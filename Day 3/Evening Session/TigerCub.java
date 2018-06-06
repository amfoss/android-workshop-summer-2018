public class TigerCub extends Tiger{

    public static void animalSays() {
        System.out.println("Meow !!");
    }

    @Override
    public void animalLikes() {
        System.out.println("Banana chips !");
    }

    /**
     * 
     */
    @Override
    public SubClass saySomething() {
        System.out.println("I return an object of SubClass class.");
        new SubClass();
    }
    // 
}