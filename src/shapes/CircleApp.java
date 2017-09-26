package shapes;

import util.Input;

public class CircleApp {

    public static void main(String[] args) {
        Input input = new Input();

        do {
            System.out.println("Please enter a radius: ");
            double userInput = input.getDouble();
            Circle circle = new Circle(userInput);
            System.out.println(circle.getCircumference());
            System.out.println(circle.getArea());
            System.out.println("Would you like to find more circle info?");


        }
        while(moreCircles()); {
            int numbCreated= Circle.getTotalCircles();
            System.out.println("You found info on "+ numbCreated+" circles.");
        }

    }
    public static boolean moreCircles() {
        Input input= new Input();
        return input.yesNo();

    }


}
