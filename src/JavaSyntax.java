public class JavaSyntax {
    public static void main(String[] args) {
        int myFavoriteNumber=7;
        System.out.println(myFavoriteNumber);
        //Code does not compile because you are trying to assign a string to a single character value.
        String myString="3.14159";
        //Code does not compile trying to assign a number to a string value.
        System.out.println(myString);
        float myNumber= 3.14f;
        //Code does not compile variable is not initialized with a value.
        //Decimal is incompatible with the type long.
        //IDK
        //There is an error in the code. Add an 'f' to the end of the number, change the declaration to double.
        System.out.println(myNumber);
//        int x = 5;
//        System.out.println(x++); 5
//        System.out.println(x); 6
        // The console prints out the variable number before adding the increment.
//        int x = 5;
//        System.out.println(++x); 6
//        System.out.println(x); 6
        //The console prints out the variable after the increment.

        //class is a reserved word, cannot assign a variable declaration to it.
//        int x = 4;
//        x = x + 5;
        //x+=5;
//        int x = 3;
//        int y = 4;
//        y = y * x;
        //y*=x;
        int x = 10;
        int y = 2;
//        x = x / y;
//        y = y - x;
//        x/=y;
        y=y-x;
        System.out.println(x);
        System.out.println(y);


    }
}
