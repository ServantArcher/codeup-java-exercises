package shapes;

public class ShapesTest {
    public static void main(String[] args) {
        Measurable myShape;
        myShape= new Square(5);
        System.out.println(myShape.getArea());
        System.out.println(myShape.getPerimeter());
        myShape=new Rectangle(3,8);
        System.out.println(myShape.getArea());
        System.out.println(myShape.getPerimeter());

    }


}
