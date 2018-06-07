public class SuperDemo extends SuperExample{
        
    public SuperDemo(){
        super(100, "Tiger cubs are cute.");
        System.out.println("Child constructor");
    }

    @Override
    public void printSomething() {
        System.out.println("Method in child class");
        super.printSomething();
    }

    public static void main(String[] args) {
        
        SuperDemo superDemo = new SuperDemo();

        System.out.println("\n-----------\n");
        
        superDemo.printSomething();
        
        System.out.println("\n-----------\n");
        
        superDemo.printVariables();
    }
}