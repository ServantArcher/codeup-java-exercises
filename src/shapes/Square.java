package shapes;

public class Square extends Rectangle {

    public Square(double side) {
        super(side, side);
    }

    public double getPerimeter() {
        return 4*this.getLength();
    }

    public double getArea() {

        return this.getLength()*this.getWidth();
    }
}

