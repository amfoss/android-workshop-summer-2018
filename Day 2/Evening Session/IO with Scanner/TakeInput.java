import java.util.Scanner; // Importing the Scanner class

public class TakeInput {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in); // Creating a scanner object

        String name = userInput.nextLine(); // Read a string with spaces
        String lastName = userInput.next(); // Read a string untill a space is encountered 

        System.out.println("My name is "+name+" "+lastName);

        userInput.nextLine(); // Handle the error caused by next() method

        int age = userInput.nextInt(); // Read integer value from the user

        System.out.println("I am "+age+" years old.");
        System.out.println("Enter a double");

        double variable = userInput.nextDouble(); // Read double value from the user

        System.out.println("The entered double is "+variable);

        userInput.close(); // Closing the Scanner object to prevent memory leaks
    }
}