public class Driver {

    public static void main(String[] args) {
        // Lambda Expression
        MyFunctionalInterface obj = (a, b) -> {
            return a+" "+b;
        };
        
        System.out.println(obj.methodA("Hello", "world !"));
        obj.methodB(5, 10);
        MyFunctionalInterface.staticMethod("watermelon");
    }
}    