public class Demo {
    public static void main(String[] args) {
        
        Animals animals = new Animals();
        animals.animalSays("Muhahahahahah");
        animals.printAnimal();
        System.out.println();
        
        Lion lion = new Lion();
        lion.animalSays("Yahoooooo !!");
        lion.printAnimal();
        System.out.println();

        Tiger tiger = new Tiger();
        tiger.animalSays();
        tiger.printAnimal();
        System.out.println();

        Monkey monkey = new Monkey();
        monkey.animalSays();
        monkey.printAnimal();
        
    }
}