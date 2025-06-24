package practiceProgram;
import java.util.Scanner;

//Create a program that shows bitwise AND of two numbers.

public class KG21BitwiseAnd {

    public static void main(String[] args) {
        // Create Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        System.out.println("Showcasing Bitwise AND operator");

        // Prompt user to enter the first integer
        System.out.print("Enter the first number: ");
        int first = sc.nextInt();

        // Prompt user to enter the second integer
        System.out.print("Enter the second number: ");
        int second = sc.nextInt();

        // Perform bitwise AND operation between the two integers
        int result = first & second;

        // Display the result of the bitwise AND operation
        System.out.println("Result is " + result);

        // Close the Scanner to avoid resource leaks
        sc.close();
    }
}

