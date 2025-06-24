package practiceProgram;
import java.util.Scanner;

// Program: Determine if a number is positive, negative, or zero

public class KG15PositiveNegativeZero {
	public static void main(String[] args) {

		// Display the purpose of the program
		System.out.println("Program to determine if a number is positive, negative, or zero");

		// Create a Scanner object to read input from the user
		Scanner sc = new Scanner(System.in);

		// Prompt the user to enter a number
		System.out.print("Please enter the number: ");
		int a = sc.nextInt();  // Read the input number

		// Check if the number is positive
		if (a > 0) {
			System.out.println("The provided number is a positive number.");

		// Check if the number is negative
		} else if (a < 0) {
			System.out.println("The provided number is a negative number.");

		// If not positive or negative, it must be zero
		} else {
			System.out.println("The provided number is zero.");
		}

		// Close the scanner (good practice to release resources)
		sc.close();
	}
}