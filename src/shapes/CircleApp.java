package shapes;

import util.Input;

public class CircleApp {

    public static void main(String[] args) {
        Input input = new Input();
        startCircle(input);


    }

    public static void startCircle(Input input){
        System.out.println("Please enter a radius.");
        Double radius=input.getDouble();
        Circle myShape=new Circle(radius);
        System.out.print("Here is the Circle's Area: ");
        System.out.print(myShape.getArea());
        System.out.println("");
        System.out.print("Here is the Circle's Circumference: ");
        System.out.print(myShape.getPerimeter());
    }

}
