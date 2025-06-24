package practiceProgram;
import java.util.Scanner;

// Program to perform bitwise XOR (^) operation on two integers

public class KG23BitwiseXOR {
	public static void main(String[] args) {
		
		// Print introductory message
		System.out.println("Showcasing the Bitwise XOR operation.");

		// Create Scanner object to take input from user
		Scanner sc = new Scanner(System.in);

		// Prompt the user to enter the first number
		System.out.print("Enter the first number: ");
		int first = sc.nextInt();  // Read first integer input

		// Prompt the user to enter the second number
		System.out.print("Enter the second number: ");
		int second = sc.nextInt();  // Read second integer input

		// Perform bitwise XOR operation using ^ operator
		int result = first ^ second;

		// Display the result of XOR operation
		System.out.println("Result for Bitwise XOR is: " + result);

		// Close the Scanner to prevent resource leak
		sc.close();
	}
}

/*XOR
 * 0 0 / 1 1 -> 0
 * 0 1 -> 1
 * */

/*
 * 5 -> 0101
 * 3 -> 0011
 * 0110 -> 6
 * 
 * */
