import java.util.Scanner;

public class StoreCLIApp {
    public static void main(String[] args) {
        menu();
    }
    public static void menu(){
        Scanner userInput=new Scanner(System.in);
        System.out.println("Please choose which option you would like to execute.\n1) Enter a list of groceries.\n" +
                "2) Print grocery list.\n3) Exit Menu");
        int menuInput=userInput.nextInt();
        while(true) {
            if (menuInput == 1) {
                String item = null;
                System.out.println("Here is a list of your items: " + items(item));
                menu();
            } else if (menuInput == 2) {
                System.out.println("Here is input 2");
                menu();
            } else if (menuInput == 3) {
                System.out.println("Here is input 3");
                break;

            }
        }

    }
    public static String items(String item){
        while(true) {
            Scanner userInput = new Scanner(System.in);
            System.out.println("Please enter the items you wish to add.");
            Scanner userResponse = new Scanner(System.in);
            String response=userResponse.nextLine();
            for(int i=1; i<=3;i++){
                item = userInput.nextLine();
                System.out.println("Add next item.");
                System.out.println(item);
            }
            if(response.equalsIgnoreCase("done")) {
                System.out.println("Alrighty then.");
                break;
            }
            }
        return item;

    }

}
