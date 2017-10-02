package grades;

import util.Input;

import java.util.HashMap;

public class GradesApplication {
    public static void main(String[] args) {

        Input input = new Input();
        startGitHubGrade(input);

    }

    public static void startGitHubGrade(Input input) {
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

        String[] users = {student1.getNames(), student2.getNames(), student3.getNames(), student4.getNames()};
        Student[] studentClass={student1,student2,student3,student4};

        System.out.println("");
        System.out.println("Here are the list of gitHub users:");

        for (int i = 0; i < users.length; i++) {
            System.out.print(" | ");
            System.out.print(students.get(users[i]));
            System.out.print(" | ");
        }

        String userInput;
        do {
            System.out.println("");
            System.out.println("Please enter a listed username to view user info.");
            userInput = input.getString();
            if (!students.containsValue(userInput)) {
                System.out.println("Sorry " + userInput + " is not a registered user");
            }
            else {
                getStudentInfo(userInput, students, users,studentClass);
                break;
            }
        }
        while (true);
    }

            public static void getStudentInfo(String userInput, HashMap students, String[] users, Student[] studentClass){
            while(true) {
                for(int i=0; i< users.length; i++)
                if (userInput.equals(students.get(users[i]))) {
                        System.out.println("Name: "+studentClass[i].getNames()+" - Github UserName: "+users[i]);
                    System.out.println("The student's "+studentClass[i].getNames()+" average grade is: "+studentClass[i].getGradeAverage());
                    System.out.println("Would you like to see another student?");
                }


                break;
                }
            }




}
