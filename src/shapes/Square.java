package shapes;

public class Square extends Quadrilateral {
    public Square(double side) {
        super(side, side);
    }

    @Override
    public void setLength(double side) {
        this.length=side;
        this.width=side;
    }

    @Override
    public void setWidth(double side) {
        this.width=side;
        this.length=side;
    }

    @Override
    public double getPerimeter() {
        System.out.println("Square Perimeter is: ");
        double side=this.length;
        return 4*(side);
    }

    @Override
    public double getArea() {
        System.out.println("Square Area is: ");
        double side=this.length;
        return (side*side);
    }

}

