package shapes;

public class Square extends Rectangle {

    private int side;

    public Square(int side) {
        super(side, side);
        this.side = side;
    }

    public int getPerimeter() {
        int perimeter = 4 * side;
        return perimeter;
    }

    public int getArea() {
        int area = side * side;
        return area;
    }
}

