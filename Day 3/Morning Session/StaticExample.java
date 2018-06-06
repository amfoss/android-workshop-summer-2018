public class StaticExample {

    private static String string = "Hello"; // static variable
    private int number = 123;   // non-static variable

    /**
     * This is a static method
     * A static method can be called directly [ClassName.aStaticMethod]
     */
    public static void printSomethingAgain() {
        System.out.println("A static method.");
    }

    /**
     * This is a non-static method
     * A non-static method can access both static and 
     * non-static members 
     */
    public void printSomething() {
        printSomethingAgain();
        System.out.println("haha"+" some string "+string);
        System.out.println("Some number "+number);
    }

}