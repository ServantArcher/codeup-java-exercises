import java.util.Scanner;
public class ConsoleExercises {
    public static void main(String[] args) {
        Scanner userInput=new Scanner(System.in);
        //Every scanner works with a delimiter -> ' ' by default.
        System.out.println("Please enter an integar");
        int number=userInput.nextInt();
        System.out.println("The number you entered is "+number);
        //If you try to input a number that is not an integar the code will not run correctly.

        System.out.println("Please enter 3 words.");
        String word1=userInput.next();
        String word2=userInput.next();
        String word3=userInput.next();
        System.out.println(word1);
        System.out.println(word2);
        System.out.println(word3);
        //Code will not execute;
        //Will not accept anymore inputs.

        userInput.nextLine();
        //This is an extra \n (enter)

        System.out.println("Please enter a sentence");
        String sentence=userInput.nextLine();
        System.out.println(sentence);
        //No only the first word is recorded.
        //Sentence is captured with .nextLine.

        System.out.println("Please enter the length.");
        double length= Double.parseDouble(userInput.nextLine());
        System.out.println("Please enter the width.");
        double width= Double.parseDouble(userInput.nextLine());
        System.out.println("Please enter the height.");
        double height= Double.parseDouble(userInput.nextLine());
        System.out.println("Volume = "+length*width*height);
        System.out.println("Surface Area = "+ length*width);
        System.out.println("Perimeter = "+ 2*(length+width));
    }
}
