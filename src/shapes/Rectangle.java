package shapes;

public class Rectangle {
    private int length;
    private int width;

    public Rectangle(int length, int width){
        this.length=length;
        this.width=width;
    }

    public int getArea(){
        int area=this.length*this.width;
        return area;
    }
    public int getPerimeter(){
        int perimeter=2*(this.length+this.width);
        return perimeter;
    }

}
