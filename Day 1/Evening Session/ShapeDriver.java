public class ShapeDriver{
    public static void main(String[] args) {
        Circle c = new Circle();
        Square sq = new Square(10);
        Rectangle rc = new Rectangle();
        c.setArea();
        c.setPerimeter();
        sq.setArea();
        sq.setPerimeter();
        rc.setArea();
        rc.setPerimeter();

        c.getArea();
        c.getPerimeter();
        sq.getArea();
        sq.getPerimeter();
        rc.getArea();
        rc.getPerimeter();
    }
}