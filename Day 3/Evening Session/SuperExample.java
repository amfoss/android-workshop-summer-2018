public class SuperExample {

    private int number;
    private String someString;

    /**
     * Default constructor
     */
    public SuperExample(){
        System.out.println("Default parent constructor");
    }

    /**
     * Parameterized constructor
     */
    public SuperExample(int number, String someString) {
        this.number = number;
        this.someString = someString;
    }

    /**
     * A simple non-static method
     */
    public void printSomething() {
        System.out.println("Method in parent class");
    }

    /**
     * Prints the value of the variables declared 
     * in this class
     */
    public void printVariables() {
        System.out.println("Number : "+number+"\nString : "+someString);
    }

}