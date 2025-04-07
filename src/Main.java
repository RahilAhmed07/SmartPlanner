// Main.java
import java.util.Scanner; // we import Scanner to take input

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Step 1: create Scanner object

        // Step 2: Ask for user name
        System.out.print("Enter your name: ");
        String name = input.nextLine(); // reads text input

        // Step 3: Ask for age
        System.out.print("Enter your age: ");
        int age = input.nextInt(); // reads integer input

        // Step 4: Output greeting
        System.out.println("Hello " + name + "! You are " + age + " years old.");

        input.close(); // close the scanner (good practice)
    }
}
