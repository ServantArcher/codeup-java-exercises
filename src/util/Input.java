package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner;

    public static void main(String[] args) {
//        Input input=new Input();
//        System.out.println(input.getString());
//        System.out.println(input.yesNo());
//        input.getInt(1,10);
//        input.getInt();
//        input.getDouble(1.5, 27.8);
//        input.getDouble();
    }

    public Input() {
        this.scanner=new Scanner(System.in);

    }

    public String getString(){
        return scanner.nextLine();
    }

    // Will prompt the user's input for whether or not they would like to continue using the program.
    public boolean yesNo(){
        String userInput = this.scanner.nextLine();
        return userInput.equalsIgnoreCase("y")|| userInput.equalsIgnoreCase("yes");
    }

    public int getInt(int min, int max){
        Integer number=getInt();
        if(number>=min && number<=max){
            return number;
        }
    else{
           return getInt(min, max);
        }

    }

    public int getInt() {
        if (this.scanner.hasNextInt()) {
            return this.scanner.nextInt();
    }
    else {
            System.out.println("Invalid Input");
            scanner.nextLine();
            return getInt();
        }
    }

    public double getDouble(double min, double max){
        System.out.println("");
        System.out.println("Please enter a number within the given bounds.");
        Double number=this.scanner.nextDouble();
        if(number>=min && number<=max){
            System.out.println("Thank you");
            return number;

        }
        else{
            return getDouble(min, max);
        }
    }

    public double getDouble(){
        Double number=this.scanner.nextDouble();
        return number;
    }

}
