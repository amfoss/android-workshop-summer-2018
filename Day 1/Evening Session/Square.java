public class Square extends Shape{
    private float side;

    public Square(){
        this.side=5;
    }

    public Square(float side){
        this.side=side;
    }

    public void setArea(){
        area = side*side;
    }

    public void setPerimeter(){
        perimeter = 4*side;
    }
}