package grades;

import util.Input;

import java.util.HashMap;

public class GradesApplication {
    public static void main(String[] args) {
        //Code that starts the program.
        Input input = new Input();
        startGitHubGrade(input);
    }

    public static void startGitHubGrade(Input input) {
        //Created a HashMap that contains all of the users and grades.
        HashMap<String, String> students = new HashMap();
        Student student1 = new Student("Sauron", 90);
        student1.addGrades(87);
        student1.addGrades(100);

        Student student2 = new Student("Golum", 76);
        student2.addGrades(70);
        student2.addGrades(98);

        Student student3 = new Student("Frodo", 84);
        student3.addGrades(98);
        student3.addGrades(94);

        Student student4 = new Student("Sam", 82);
        student4.addGrades(54);
        student4.addGrades(75);

        students.put(student1.getNames(), "MetalMaster");
        students.put(student2.getNames(), "sLink/and/sTink");
        students.put(student3.getNames(), "BurdenBarer");
        students.put(student4.getNames(), "gaFFer");

        //Arrays are made in order to index through them latter on.
        //Names can then be added to later on if needed.
        String[] users = {student1.getNames(), student2.getNames(), student3.getNames(), student4.getNames()};
        Student[] studentClass={student1,student2,student3,student4};

        //Prints the list of users based on their GitHub names.
        System.out.println("");
        System.out.println("Here are the list of gitHub users:");
        for (int i = 0; i < users.length; i++) {
            System.out.print(" | ");
            System.out.print(students.get(users[i]));
            System.out.print(" | ");
        }

        //Checks to see that the user entered a valid name from the given list of users.
        String userInput;
        do {
            System.out.println("");
            System.out.println("Please enter a listed username to view user info.");
            userInput = input.getString();
            if (!students.containsValue(userInput)) {
                System.out.println("Sorry " + userInput + " is not a registered user");
            }

            //If an appropriate name is passed through. The program will then begin to get the users information.
            else {
                    getStudentInfo(userInput, students, users, studentClass);
                    Input moreInfo = new Input();
                    System.out.println("Would you like to see another student?");
                    //If the user asks result returns true the info program will run again and ask user for a different username.
                    if(moreInfo.yesNo()){
                        getStudentInfo(String.valueOf(moreInfo), students, users, studentClass);
                    }
                    else{
                        break;
                    }
                }
            }
        while (true);
    }
            //Method will pass various arguments in order to index through the appropriate student's information.
            public static void getStudentInfo(String userInput, HashMap students, String[] users, Student[] studentClass) {
                    for (int i = 0; i < users.length; i++) {
                        //Indexes to the username passed by the user.
                        if (userInput.equals(students.get(users[i]))) {
                            System.out.println("Name: " + studentClass[i].getNames() + " - Github UserName: " + users[i]);
                            System.out.println("The student's " + studentClass[i].getNames() + " average grade is: " + studentClass[i].getGradeAverage());
                        }

                    }
                }
            }



