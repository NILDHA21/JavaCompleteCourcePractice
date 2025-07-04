package practiceProgram;
import java.util.Scanner;

/*
 * KG32LCM
 * Objective: Create a program to find the Least Common Multiple (LCM) of two numbers.
 */

public class KG32LCM {

	public static void main(String[] args) {
		// Create Scanner object to take user input
		Scanner sc = new Scanner(System.in);

		// Display heading and prompt user for input
		System.out.println("Program to find the Least Common Multiple (LCM) of two numbers.");
		System.out.print("Please enter the first number: ");
		int first = sc.nextInt(); // Read first number

		System.out.print("Please enter the second number: ");
		int second = sc.nextInt(); // Read second number

		// Call LCM method and store result
		int lcm = LCM(first, second);

		// Display the result
		System.out.println("LCM of two numbers is: " + lcm);

		// Close the scanner
		sc.close();
	}

	// Method to find LCM using brute-force approach
	public static int LCM(int first, int second) {
		int i = 1; // Start with a multiplier of 1

		// Loop will keep checking multiples of 'first' until one is divisible by 'second'
		while (i <= second) {  // You could also use while(true) for infinite loop and return from inside
			int factor = first * i; // Generate current multiple of 'first'

			// Check if it's divisible by 'second' (common multiple)
			if (factor % second == 0) {
				return factor; // First common multiple found → return as LCM
			}
			i++; // Try next multiple
		}

		// Technically unreachable, but added to satisfy compiler return path
		return 0;
	}
}
