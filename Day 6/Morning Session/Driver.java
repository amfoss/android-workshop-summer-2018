public class Driver implements MyFunctionalInterface {

    public void saySomething(){
        System.out.println("Implementation of an interface using a class !!");
    }

    public static void main(String[] args) {

        MyFunctionalInterface anotherInterface = 
        () -> System.out.println("Implementation of an interface using a lambda expression !!");
        anotherInterface.saySomething();

        MyFunctionalInterface myInterface = new MyFunctionalInterface(){
            public void saySomething(){
                System.out.println("Implementation of an interface using an anonymous class !!");
            }
        };

        myInterface.saySomething();
        Driver driver = new Driver();
        driver.saySomething(); 
    }

}