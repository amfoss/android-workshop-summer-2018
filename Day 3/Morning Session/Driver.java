public class Driver {
    public static void main(String[] args) {
        
        // invoking a static method 
        // Syntax -> className.nameOfTheStaticMethod
        StaticExample.printSomethingAgain();
        System.out.println("-------");

        // invoking a non-static methods
        StaticExample example = new StaticExample();
        example.printSomething();
    }
}