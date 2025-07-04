package practiceProgram;

import java.util.Scanner;

/*
 * KG31SumOfDigits
 * Objective: Create a program that computes the sum of the digits of an integer,
 * including handling of negative input.
 */

public class KG31SumOfDigits {
	public static void main(String[] args) {
		// Create Scanner object to take input
		Scanner sc = new Scanner(System.in);

		System.out.println("Program that computes the sum of the digits of an integer.");
		System.out.print("Please enter the number: ");

		int num = sc.nextInt(); // Take integer input from user

		// Call method to calculate sum of digits
		int sum = SumOfDigits(num);

		// Print the result
		System.out.println("Sum of digits of the number is: " + sum);

		// Close the scanner
		sc.close();
	}

	// Method to calculate the sum of digits of an integer
	public static int SumOfDigits(int num) {
		int sum = 0;

		// Handle negative numbers by taking absolute value
		num = Math.abs(num);

		// Loop to extract digits and add to sum
		while (num > 0) {
			int digit = num % 10;   // Get the last digit
			sum += digit;           // Add digit to sum
			num = num / 10;         // Remove the last digit
		}
		return sum; // Return final result
	}
}