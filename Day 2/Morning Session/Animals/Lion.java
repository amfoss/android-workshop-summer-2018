public class Lion extends Animals {
   
    // New method with the same name is defined in Lion class
    // This is not method overriding 
    public void animalSays(String saySomething, int age) {
        System.out.println("Roar !");
    }

    // Overloading the animalSays method
    public void animalSays(String saySomething, int age, 
                           boolean alive) {
                        System.out.println(saySomething+" "+
                        age+" "+alive);
    }


    // Overriding the printAnimal() method from Animal Class
    @Override
    public void printAnimal() {
        System.out.println("Lion !!");
    }

    public static void main(String[] args) {

        Lion lion = new Lion();

        //Overridden methods
        lion.printAnimal();
        
        // Overloaded methods
        lion.animalSays("I am old ", 1112);
        lion.animalSays("Ha", 99, true);

        // Calling method from parent Animals class
        lion.animalSays("Yahoooooooo !");
    }   

}