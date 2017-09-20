import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {

//        int i = 5;
//        while (i <= 15) {
//            System.out.print(i + " ");
//            i++;
//        }
//        System.out.println(" ");

        //Bullet Point 1
//        byte j=0;
//        do {
//            System.out.println(j);
//            j+=2;
//        }
//        while(j<=100);

        //Bullet Point 2
//        byte j=100;
//        do {
//            System.out.println(j);
//            j-=5;
//        }
//        while(j>=-10);

        //Bullet Point 3
//        int j=2;
//        do {
//            System.out.println(j);
//            j=(int) Math.pow(j,2);
//        }
//        while(j<1000000);
//    }
        //Bullet 1
//        byte k = 0;
//        for (int j = 0; k <= 100; j++) {
//            System.out.println(k);
//            k+=2;
//        }
        //Bullet 2
//        byte k=100;
//        for(int j=0; k>=-10; j++){
//            System.out.println(k);
//            k-=5;
//        }
        //Bullet 3
//        int k=2;
//        for(int j=0; k<1000000; j++){
//            System.out.println(k);
//            k=(int) Math.pow(k,2);
//        }

        //FizzBuzz
//        for(int i=1; i<=100; i++){
//            if(i%15==0){
//                System.out.println("FizzBuzz");
//
//            }
//            else if(i%5==0){
//                System.out.println("Buzz");
//            }
//            else if(i%3==0){
//                System.out.println("Fizz");
//            }
//            else{
//                System.out.println(i);
//            }
//        }


        Scanner input= new Scanner(System.in);

//        while(true) {
//        System.out.println("What number would you like to go up to? ");
//        int number=input.nextInt();
//        input.nextLine();
//
//        System.out.println("number | squared | cubed\n" +
//                "------ | ------- | -----");
//        for(int i=1; i<=number; i++){
//            int sq=(int) Math.pow(i,2);
//            int cub= (int) Math.pow(i,3);
//            System.out.printf("%-7s| ",i);
//            System.out.printf("%-8s| ", sq);
//            System.out.printf("%-5s", cub);
//            System.out.println("");
//        }
//            System.out.println("Do you want to continue? (y/n)");
//            String option =input.nextLine();
//            if(!option.equalsIgnoreCase("y")){
//                System.out.println("Breaking Loop");
//                break;
//            }
//
//        }
        // Grades
        while(true) {
            System.out.println("Please enter the the grade you received.");
            int grade = input.nextInt();
            input.nextLine();
            if (100 >= grade && grade >= 90) {
                if (100 >= grade && grade >= 93)
                    System.out.println("A");
                else {
                    System.out.println("A-");
                }
            } else if (89 >= grade && grade >= 80) {
                if (89 >= grade && grade >= 87) {
                    System.out.println("B+");
                } else if (86 >= grade && grade >= 83) {
                    System.out.println("B");
                } else {
                    System.out.println("B-");
                }
            } else if (79 >= grade && grade >= 70) {
                if (79 >= grade && grade >= 77) {
                    System.out.println("C+");
                } else if (76 >= grade && grade >= 73) {
                    System.out.println("C");
                } else {
                    System.out.println("C-");
                }
            } else if (69 >= grade && grade >= 60) {
                if (69 >= grade && grade >= 67) {
                    System.out.println("D+");
                } else if (66 >= grade && grade >= 63) {
                    System.out.println("D");
                } else {
                    System.out.println("D-");
                }
            } else if (grade < 59) {
                System.out.println("F");
            }

            System.out.println("Do you want to continue? (y/n)");
            String option =input.nextLine();
            if(!option.equalsIgnoreCase("y")){
                System.out.println("Breaking Loop");
                break;
            }
        }
        //Bonus Pyramid thingy
//        System.out.println("Please enter a number and letter.");
//         int length=input.nextInt();
//         String characterPrint=input.nextLine();
//         for(int i=0; i<length; i++) {
//             for (int j = 0; j<=i; j++){
//                 System.out.print(characterPrint+" ");
//             }
//             System.out.println("");
//         }
    }

}
