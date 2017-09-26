package shapes;

public class Circle {
    private static int totalCircles;
    private double radius;


    public static void main(String[] args) {
//        Circle circle = new Circle(4.3); //Creates a new instance of radius
//        System.out.println(circle.getArea());
//        System.out.println(circle.getCircumference());

    }

    public Circle(double radius) {
        this.radius=radius;
    }

    public double getArea(){
        return (Math.PI)*(Math.pow(this.radius, 2.0));
    }

    public double getCircumference(){
        return (Math.PI)*2*this.radius;
    }
    public static int getTotalCircles(){
        int count=totalCircles;
        count++;
        return count;
    }
}

