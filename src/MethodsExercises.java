import java.util.Random;
import java.util.Scanner;

public class MethodsExercises {

    public static void main(String[] args) {
//        System.out.println(add(5,6));
//        System.out.println(subtract(5,6));
//        System.out.println(multiply( 5,8));
//        System.out.println(divide(5,6));
//        System.out.println(modulus(8,6));
//        System.out.println("");
        factorial();
//        dice();
//        gameDevelopment();
    }
    //1
    public static int add(int x, int y){
        return x+y;
    }
    public static int subtract(int x, int y){
        return x-y;
    }
    public static int multiply(int x, int y){
        int result=0;
        while(x>0){
            result+=y;
            x--;
        }
        return result;
    }
    public static float divide(double x, double y){
        return (float) (x/y);
    }
    public static int modulus(int x, int y){
        return (x%y);
    }
    //It would break the code diving by 0 is infinite.

    //2
    public static void getIntegar(int min, int max) {
        while(true) {
            System.out.println("Please enter a number between " + min + " and " + max);
            Scanner userInput = new Scanner(System.in);
            int number = userInput.nextInt();
            if (number >= min && number <= max) {
                System.out.println("That is a valid input");
                break;
            } else {
                System.out.println("That is not a valid input.");
            }
        }
    }
    //3
    public static int factorial(){
        getIntegar(1,100);
        System.out.println("Please enter the number you would like to factorial.");
        Scanner userInput=new Scanner(System.in);
        int number=userInput.nextInt();
        int count=1;
        for(int i=number;i>=1; i--) {
//            System.out.print(i+"! = "+ (i)+" x "+ " = "+count);
            count=count*i; // This the factorial output
            System.out.print(i);

            for (int j = number; j >= 1; j--) {
                System.out.print(j);
            }
        }
        return number;
    }

    //4
public static void dice() {
    while (true) {
        System.out.println("Ready to roll? (y/n)");
        Scanner userResponse = new Scanner(System.in);
        String response = userResponse.nextLine();
        if (response.equalsIgnoreCase("y")) {
            Scanner diceNumber = new Scanner(System.in);
            System.out.println("How many dice are you going to roll.");
            int numberOfDice = diceNumber.nextInt();
            Scanner userInput = new Scanner(System.in);
            System.out.println("How many sides are on this dice?");
            int number = userInput.nextInt();
            Random dice = new Random();
            Scanner diceRoll = new Scanner(System.in);
            System.out.println("How many times do you want to roll this dice?");
            int rollCount = diceRoll.nextInt();
            if (response.equalsIgnoreCase("y")) {
                for (int count = 0; count < rollCount; count++) {
                    for (int i = 1; i <= numberOfDice; i++) {
                        int randomNumber = dice.nextInt(number);
                        System.out.println("Random No: " + (randomNumber + 1)); //Random number includes 0 added 1 to start the dice at 1.
                        //This generates the random dice roll.
                    }
                }
            }
        }
        if(!response.equalsIgnoreCase("y")) {
            System.out.println("Alrighty, well bye!");
            break;
        }
    }
}
//5
public static void gameDevelopment(){
    System.out.println("Would you like to play a game? (y/n)");
    Scanner userInput=new Scanner(System.in);
    String response=userInput.nextLine();
    if(response.equalsIgnoreCase("y")) {
        Random dice = new Random();
        for(int i = 1; i <= 1; i++){
            int randomNumber = dice.nextInt(100);
            int count=0;
            while(true){
                System.out.println("Please try to guess the number\n");
                int guess=userInput.nextInt();
                if(guess==randomNumber){
                    System.out.println("GREAT GUESS\n");
                    count++;

                    System.out.println("It took you "+count+" guesses to guess the right number.");
                    break;
                }
                else if(guess>randomNumber){
                    System.out.println("HIGHER\n");
                    count++;
                }
                else if(guess<randomNumber){
                    System.out.println("LOW\n");
                    count++;
                }

            }
        }
    }
    else{
        System.out.println("Alrighty, well bye.");
    }

}


}


