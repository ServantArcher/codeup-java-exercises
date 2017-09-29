package shapes;

public class Circle implements Measurable {
    private double radius;

    public Circle(double radius) {
        this.radius=radius;
    }

    @Override
    public double getPerimeter() {
        return (Math.PI)*2*this.radius;
    }
    @Override
    public double getArea(){
        return (Math.PI)*(Math.pow(this.radius, 2.0));
    }

//    public static int getTotalCircles(){
//        int count=totalCircles;
//        count++;
//        return count;
//    }
}

