public interface MyFunctionalInterface {

    String methodA(String a, String b);

    default void methodB(int a, int b) {
        System.out.println("Sum : "+a+b);
        privateMethod();
    }

    static void staticMethod(String input) {
        System.out.println(input);
    }

    private void privateMethod() {
        System.out.println("Private method");
    }
} 