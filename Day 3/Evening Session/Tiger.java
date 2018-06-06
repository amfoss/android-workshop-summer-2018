public class Tiger extends Animal {

    public static void animalSays(){
        System.out.println("Roar !!!");
    }

    @Override
    public void animalLikes() {
        System.out.println("Pizza !!");
    }
    
    public SuperClass saySomething() {
        System.out.println("I return an object of SuperClass class");
        return new SuperClass();
    }

}