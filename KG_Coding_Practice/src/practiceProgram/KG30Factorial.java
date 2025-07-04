package practiceProgram;

import java.util.Scanner;

/*
 * KG30Factorial
 * Objective: Write a function that calculates the factorial of a given number.
 */

public class KG30Factorial {
	public static void main(String[] args) {
		// Create scanner object to read user input
		Scanner sc = new Scanner(System.in);

		System.out.println("Program to calculate the factorial of a given number.");
		System.out.print("Please enter a number in integer format: ");
		
		int num = sc.nextInt(); // Read input from user

		// Call method to calculate factorial
		long fact = FactorialCalculator(num);

		// Display result
		System.out.println("Factorial for given number " + num + " is: " + fact);

		// Close the scanner
		sc.close();
	}

	// Method to calculate factorial of a number
	public static long FactorialCalculator(int num) {
		int i = 1;         // Loop counter
		long fact = 1;      // Initialize factorial to 1 (not 0)

//		if(num < 2) {
//			return 1;
//		}
		// Multiply numbers from 1 to num
		while (i <= num) {
			fact = fact * i;
			i++;
		}
		return fact;       // Return the final factorial value
	}
}
