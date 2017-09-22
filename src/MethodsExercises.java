import java.util.Random;
import java.util.Scanner;

public class MethodsExercises {

    public static void main(String[] args) {
        Scanner userResponse = new Scanner(System.in);

//        System.out.println(add(5,6));
//        System.out.println(subtract(5,6));
//        System.out.println(multiply( 5,8));
//        System.out.println(divide(5,6));
//        System.out.println(modulus(8,6));
//        System.out.println("");
//        getIntegar(1,100);
//        factorial();
//        dice(userResponse);
//        gameDevelopment();
//        factorial(getIntegar(1,10));
    }
    //1
    public static double add(double x, double y){
        return x+y;
    }
    public static double subtract(double x, double y){
        return x-y;
    }
    public static double multiply(double x, double y){
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
    public static int getIntegar(int min, int max) {

            System.out.println("Please enter a number between " + min + " and " + max);
            Scanner userInput = new Scanner(System.in);
            int number = userInput.nextInt();
            if (number < min || number > max) {
                System.out.println("That is not a valid input");
                getIntegar(min, max);

            } else {
                System.out.println("That is a valid input.");
                return number;
            }
            return 0;


    }


    //3
    public static void factorial(int number){

        System.out.println("Please enter the number you would like to factorial.");
        int acum=1;
        String details="";
        for(int i=1;i<=number; i++) {
            details+=(i==1)? i:" x "+i;
            System.out.println(i+"! = "+details+" = "+(acum*=i));
            ;
        }
    }

    //4
public static void dice(Scanner input) {
    System.out.println("Ready to roll? (y/n)");
    while (true) {
        String response = input.nextLine();
        if (response.equalsIgnoreCase("y")) {
            System.out.println("How many dice are you going to roll.");
            int numberOfDice = input.nextInt();
            System.out.println("How many sides are on this dice?");
            int number = input.nextInt();
            Random dice = new Random();
            System.out.println("How many times do you want to roll this dice?");
            int rollCount = input.nextInt();
                for (int count = 0; count < rollCount; count++) {
                    System.out.println("Roll "+(count+1));
                    for (int i = 1; i <= numberOfDice; i++) {
                        int randomNumber = dice.nextInt(number);
                        System.out.println("Die: "+i+" is " +(randomNumber + 1)); //Random number includes 0 added 1 to start the dice at 1.
                        //This generates the random dice roll.
                    }
                }
            System.out.println("Roll again? (y/n)");
        }
        else if (response.equalsIgnoreCase("n")){
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


