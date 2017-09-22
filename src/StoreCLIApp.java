import java.util.Scanner;

public class StoreCLIApp {
    public static void main(String[] args) {
        String item=null;
        System.out.println("Here is a list of your items: "+items(item));


    }
    public static String items(String item){
        while(true) {
            Scanner userInput = new Scanner(System.in);
            System.out.println("Please enter the item you wish to add.");
            item = userInput.nextLine();
            System.out.println(item);
            Scanner userResoponse = new Scanner(System.in);
            System.out.println("Do you want to add more items. (y/n)");
            String response=userResoponse.nextLine();

            if(!response.equalsIgnoreCase("y")) {
                System.out.println("Alrighty then.");
                break;
            }
            }
        return item;

    }
}
