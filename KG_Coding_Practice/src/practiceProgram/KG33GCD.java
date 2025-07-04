package practiceProgram;

import java.util.Scanner;

// 33. Create a program to find the Greatest Common Divisor (GCD) of two integers.

public class KG33GCD {
	public static void main(String[] args) {
		// Create Scanner object to take input from user
		Scanner sc = new Scanner(System.in);

		// Print program introduction
		System.out.println("Program to find the Greatest Common Divisor (GCD) of two integers.");

		// Prompt and read first number
		System.out.print("Enter the first number: ");
		int first = sc.nextInt();

		// Prompt and read second number
		System.out.print("Enter the second number: ");
		int second = sc.nextInt();

		// Call gcd() method and store the result
		int gcd = gcd(first, second);

		// Display the final GCD result
		System.out.println("GCD of two numbers is " + gcd);

		// Close the scanner
		sc.close();
	}

	// Method to calculate GCD by checking all common divisors up to the smaller number
	public static int gcd(int first, int second) {
		int gcd = 1;             // Variable to store the current greatest common divisor
		int i = 2;               // Start checking from 2 (since 1 is common to all)
		int least = least(first, second); // Get the smaller of the two numbers

		// Check all numbers from 2 to 'least'
		while (i <= least) {
			// If both numbers are divisible by 'i', it's a common factor
			if (first % i == 0 && second % i == 0) {
				gcd = i; // Update gcd to the current common factor
			}
			i++; // Move to the next number
		}
		return gcd; // Return the final GCD
	}

	// Helper method to return the smaller of two numbers
	public static int least(int first, int second) {
		if (first < second) {
			return first;
		} else {
			return second;
		}
	}
}
