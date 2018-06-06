import a.A;
//import packageName.classaName; [syntax]

public class Demo {
    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.number + " " + a.someString);
        a.someMethod();
    }
}