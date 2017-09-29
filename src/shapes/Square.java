package shapes;

public class Square extends Quadrilateral {
    public Square(double side) {
        super(side, side);
    }

    @Override
    public double setLength() {
        return this.getLength();
    }

    @Override
    public double setWidth() {
        return this.getWidth();
    }

    @Override
    public double getPerimeter() {
        System.out.println("Square Perimeter is: ");
        return 2*(this.getWidth()+this.getLength());
    }

    @Override
    public double getArea() {
        System.out.println("Square Area is: ");
        return (this.getWidth()*this.getLength());
    }

}

