import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        Scanner userInput=new Scanner(System.in);
        System.out.println("Bob is here, ask him something.");
        while(true) {
            String bobTalk = userInput.nextLine();
            if (bobTalk.endsWith("?")) {
                System.out.println("Sure");
            } else if (bobTalk.equals("")) {
                System.out.println("Fine. Be that way!");
            } else if (bobTalk.equals(bobTalk.toUpperCase())) {
                System.out.println("Whoa, chill out!");
            } else {
                System.out.println("Whatever");
            }
            if(bobTalk.equalsIgnoreCase("bye")){
                break;
            }

        }
    }
}
