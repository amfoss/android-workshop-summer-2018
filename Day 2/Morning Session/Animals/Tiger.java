public class Tiger extends Animals {

    // Again, this method is not being overridden
    // a new method with the same method signature is created
    // Method signature -> method name, number of paramerters, data type of the parameters
    public void animalSays() {
        System.out.println("Meow !!");
    }

    // Method Overloading
    public void animalSays(int number) {
        System.out.println("Meow !! "+number);
    }

    @Override
    public void printAnimal() {
        System.out.println("Tiger !!");
    }

}