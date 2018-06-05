// A class that implements the MyInterface interface
public class MyClass implements MyInterface {
    // implementation of the method declared in MyInterface interface 
    public void saySomething() {
        System.out.println("Something");
    }

    // implementation of the method declared in MyInterface interface
    public void sayHello() {
        System.out.println("Hello !");
    }

    public static void main(String[] args) {

        MyClass myClass = new MyClass();
        
        myClass.saySomething();
        myClass.sayHello();
    }

}   