import java.util.Random;
import java.util.Scanner;

public class HighLow {
    public static void main(String[] args) {
    gameDevelopment();
    }

    public static void gameDevelopment() {
        System.out.println("Would you like to play a game? (y/n)");
        Scanner userInput = new Scanner(System.in);
        String response = userInput.nextLine();
        if (response.equalsIgnoreCase("y")) {
            Random dice = new Random();
            for (int i = 1; i <= 1; i++) {
                int randomNumber = dice.nextInt(100);
                int count = 0;
                while (true) {
                    System.out.println("Please try to guess the number\n");
                    int guess = userInput.nextInt();
                    if (guess == randomNumber) {
                        System.out.println("GREAT GUESS\n");
                        count++;

                        System.out.println("It took you " + count + " guesses to guess the right number.");
                        break;
                    } else if (guess > randomNumber) {
                        System.out.println("HIGHER\n");
                        count++;
                    } else if (guess < randomNumber) {
                        System.out.println("LOW\n");
                        count++;
                    }

                }
            }
        } else {
            System.out.println("Alrighty, well bye.");
        }

    }
}