package shapes;

public class Rectangle extends Quadrilateral implements Measurable{

// Doesn't need to Measurable since it's already defined in quadrilateral.
    //Yes, it is used in Rectangle


    public Rectangle(double length, double width) {
        super(length, width);
    }

    @Override
    public double setLength() {
        System.out.println("Rectangle Length is: ");
        return this.length;
    }

    @Override
    public double setWidth() {
        System.out.println("Rectangle Width is: ");
        return this.width;
    }

    @Override
    public double getPerimeter() {
        System.out.println("Rectangle Perimeter is: ");
        return 2*(this.getWidth()+this.getLength());
    }
// Abstract method must be defined in order for the code to compile.
    @Override
    public double getArea() {
        System.out.println("Rectangle Area is: ");
        return (this.width*this.length);
    }

}
