public class Child extends Parent{

    @Override
    protected void methodA() {
        super.methodA();
        System.out.println("Overridden A");
    }

    @Override
    public void methodB() {
        super.methodB();
        System.out.println("Overridden B");
    }

    public static void main(String[] args) {
        
        Child child = new Child();
        child.methodA();
        child.methodB();
    }

}