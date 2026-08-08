// Import Scanner class to take user input

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {

        // Create a Scanner object to read input from the console

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();    // Read age from user

        if (age >= 18) {
            System.out.println("You're an adult.");
        } else {
            System.out.println("You're not an adult.");
        }

        // Close the Scanner object to avoid resource leaks

        scanner.close();
    }
}