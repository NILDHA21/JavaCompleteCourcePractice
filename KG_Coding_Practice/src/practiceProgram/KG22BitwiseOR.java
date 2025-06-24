package practiceProgram;
import java.util.Scanner;

// This program demonstrates the Bitwise OR operation between two 
// integers

public class KG22BitwiseOR {
    public static void main(String[] args) {
        // Create Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);

        System.out.println("Showcasing the Bitwise OR operation.");

        // Prompt the user to enter the first number
        System.out.print("Enter first number: ");
        int first = sc.nextInt();

        // Prompt the user to enter the second number
        System.out.print("Enter second number: ");
        int second = sc.nextInt();

        // Perform bitwise OR operation
        int result = first | second;

        // Display the result of the bitwise OR operation
        System.out.println("Result is " + result);

        // Close the scanner to avoid resource leaks
        sc.close();
    }
}
//Result: 
//5 -> 0101
//3 -> 0011
//1000 -> 7