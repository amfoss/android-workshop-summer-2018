public class Monkey extends Animals {

    // This is method is not being overridden
    // instead, a new method with the same name is created
    public void animalSays() {
        System.out.println("Chatter, gibber");
    }

    @Override
    public void printAnimal() {
        System.out.println("Monkey !!");
    }

}