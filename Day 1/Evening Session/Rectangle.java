public class Rectangle extends Shape{
    private float length;
    private float breadth;

    public Rectangle(){
        this.length=5;
        this.breadth=2;
    }

    public Rectangle(float length, float breadth){
        this.length=length;
        this.breadth=breadth;
    }

    public void setArea(){
        area = length*breadth;
    }

    public void setPerimeter(){
        perimeter = 2*(length+breadth);
    }
}