package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner;

    public static void main(String[] args) {
        Input input=new Input();
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
    public boolean yesNo(){
        System.out.println("What is the question?");
        String userInput = this.scanner.nextLine();
        if(userInput.equalsIgnoreCase("y")|| userInput.equalsIgnoreCase("yes")) {
            return true;
        }
        else{
            return false;
        }
    }
    int getInt(int min, int max){
        System.out.println("");
        System.out.println("Please enter a number within the given bounds.");
        Integer number=this.scanner.nextInt();
        if(number>=min && number<=max){
            return number;
        }
    else{
           return getInt(min, max);
        }

    }
    int getInt(){
        System.out.println("Please enter a lower bound.");
        int min=this.scanner.nextInt();
        System.out.println("Please enter an upper bounnd");
        int max=this.scanner.nextInt();
        System.out.println("Please enter a number within the given bounds ["+min+", "+ max+"]");
        Integer number=this.scanner.nextInt();
        while(!(number >= min && number <= max)) {
            System.out.println("Please enter a number within the given bounds ["+min+", "+ max+"]");
            number=this.scanner.nextInt();
            if (number >= min && number <= max) {
                System.out.println("Perfect!");
                break;

            }
        }
        return number;
    }
    double getDouble(double min, double max){
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
    double getDouble(){
        System.out.println("Please enter a lower bound.");
        Double min=this.scanner.nextDouble();
        System.out.println("Please enter an upper bounnd");
        Double max=this.scanner.nextDouble();
        System.out.println("Please enter a number within the given bounds ["+min+", "+ max+"]");
        Double number=this.scanner.nextDouble();
        while(!(number >= min && number <= max)) {
            System.out.println("Please enter a number within the given bounds ["+min+", "+ max+"]");
            number=this.scanner.nextDouble();
            if (number >= min && number <= max) {
                break;
            }
        }
        System.out.println("Perfect");
        return number;
    }

}
