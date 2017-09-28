package shapes;

public class ShapesTest {
    public static void main(String[] args) {
        Rectangle box1 =new Rectangle(4,5);
        showRectangleInfo(box1);
        Rectangle box2= new Square(5);
        showRectangleInfo(box2);
        //You can pass an object of the type Square.

    }
    public static void showRectangleInfo(Rectangle rectangle){
        System.out.println("The rectangle's Area is: "+rectangle.getArea());
        System.out.println("The rectangle's Perimeter is: "+rectangle.getPerimeter());

    }

}
