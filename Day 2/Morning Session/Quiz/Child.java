// Super is used to access members of parent class
// Also, super cannot be used inside static methods

class Parent {
    
    int number = 1002;
    String favoriteFruit = "Watermelon";
    String name = "?";
    int rollNo = 16002;
}

public class Child extends Parent {
    
    int number = 1004;
    String favoriteFruit = "Mango";
    int rollNo = 14523;
    static String goodBye = "Sayonara"; 

    public void print1() {
        System.out.println("Parent "+super.number);
        System.out.println(super.favoriteFruit+" "+super.name);
    }

    public void print2() {
        System.out.println(super.rollNo);
    }

    public static void main(String[] args) {
        Child child = new Child();
        System.out.println("Child "+child.number);
        child.print1();
        System.out.println(child.favoriteFruit+
        " "+child.rollNo);
        child.print2();
    }

}