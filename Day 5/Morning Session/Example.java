public class Example {

    /**
     * A static method of Example class that takes
     * a string, integer and an interface as arguments
     */
    public static void methodA (String a, 
                                int b, 
                                MyInterface myInterface){
        
            System.out.println(a+" "+b);

            // invoking sayHello() method of MyInterface interface

            myInterface.sayHello();                        
    }

    public static void main(String[] args) {
        
        // Instatiation of MyClass class
        MyClass myClass = new MyClass();

        // Here object of MyClass class is passed as an argument, 
        // as it implements the methods of the MyInterface interface.
        // NOTE: We cannot pass an object of an interface directly as an argument as
        // interfaces cannot be instantiated, unless an anonymous class is used. 
        methodA("Yes", 9, myClass);  

        // Here, an anonymous class implements the MyInterface interface and
        // then it is passed as an argument in methodA() method
        methodA("Bond", 007, new MyInterface(){
            public void saySomething() {
                System.out.println("Who's Bond?");
            }
            public void sayHello(){
                System.out.println("Hello, Mr Bond");
            }

        });
    }
}