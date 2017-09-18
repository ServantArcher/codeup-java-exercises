
import java.util.Scanner;
public class ConsoleExercises {
    public static void main(String[] args) {
        Scanner userInput=new Scanner(System.in);
        System.out.println("Please enter an integar");
        int number=userInput.nextInt();
        System.out.println("The number you entered is "+number);
        //If you try to input a number that is not an integar the code will not run correctly.
        System.out.println("Please enter 3 words followed by an enter for each word.");

        String word1=new Scanner(System.in).nextLine();
        String word2=new Scanner(System.in).nextLine();
        String word3=new Scanner(System.in).nextLine();
        System.out.println(word1+" "+word2+" "+word3);
        //Code will not execute;
        //Will not accept anymore inputs.
        Scanner userSentence=new Scanner(System.in);
        System.out.println("Please enter a sentence");
        String sentence=userSentence.nextLine();
        System.out.println(sentence);
        //No only the first word is recorded.
        //Sentence is captured with .nextLine.
        System.out.println("Please enter the length.");
        double length= new Scanner(System.in).nextDouble();
        System.out.println("Please enter the width.");
        double width= new Scanner(System.in).nextDouble();
        System.out.println("Please enter the height.");
        double height= new Scanner(System.in).nextDouble();
        System.out.println("Volume = "+length*width*height);
        System.out.println("Surface Area = "+ length*width);
        System.out.println("Perimeter = "+ 2*(length+width));


    }

}
