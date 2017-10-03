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
        Student sauron = new Student("Sauron", 90);
        sauron.addGrades(87);
        sauron.addGrades(100);

        Student golum = new Student("Golum", 76);
        golum.addGrades(70);
        golum.addGrades(98);

        Student frodo = new Student("Frodo", 84);
        frodo.addGrades(98);
        frodo.addGrades(94);

        Student sam = new Student("Sam", 82);
        sam.addGrades(54);
        sam.addGrades(75);

        students.put(sauron.getNames(), "MetalMaster");
        students.put(golum.getNames(), "sLink/and/sTink");
        students.put(frodo.getNames(), "BurdenBarer");
        students.put(sam.getNames(), "gaFFer");

        //Arrays are made in order to index through them latter on.
        //Names can then be added to later on if needed.
        String[] users = {sauron.getNames(), golum.getNames(), frodo.getNames(), sam.getNames()};
        Student[] studentClass={sauron,golum,frodo,sam};
        //Prints the list of users based on their GitHub names.
        System.out.println("");
        System.out.println("Here are the list of gitHub users:");
        for (int i = 0; i < users.length; i++) {
            System.out.print("| ");
            System.out.print(students.get(users[i]));
            System.out.print(" | ");
        }
        System.out.println("");

        Input csv=new Input();
        System.out.println("Would you like to print a csv report for all the students? (y/n)");
        if(csv.yesNo()){
            printCSV(studentClass,users);
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
                System.out.println("");
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
                            System.out.println("The student " + studentClass[i].getNames() + " average grade is: " + studentClass[i].getGradeAverage());
                            System.out.println("The student "+studentClass[i].getNames()+" grades are: "+studentClass[i].getGrades());
                        }

                    }
                }
                public static void printCSV(Student[] studentClass, String [] users){

                    int i=0;
                    for(Student student: studentClass){
                        System.out.println(student.getNames()+", Github-Username: "+users[i]+", "+student.getGrades());
                        i++;


                    }
                }


            }



