public class Driver {
    
    String yay = "yay";

    public void printYay() {
        System.out.println("Yay again !!!");
    }

    public static void main(String[] args) {

        Driver driver = new Driver();
        
        driver.printYay();

        System.out.println(driver.yay);

        // ClassName.variable -> Static variable
        Student.universityName = "Harward";
        

        //ClassName.methodName() -> Static method
        Student.printSomething();   

        Student student1 = new Student(16002, "Yo");
        Student student2 = new Student(16003, "Yay");

        student1.getStudentDetails();
        student2.getStudentDetails();
    }
}