public class Circle extends Shape{
    private float radius;

    public Circle(){
        this.radius=5;
    }

    public Circle(float radius){
        this.radius=radius;
    }

    public void setArea(){
        area = (float)3.14*radius*radius;
    }

    public void setPerimeter(){
        perimeter = (float)6.28*radius;
    }
}