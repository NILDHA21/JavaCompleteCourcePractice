package practiceProgram;

import java.util.Scanner;

// Program: Determine whether a given year is a leap year
// Leap year conditions:
// - Divisible by 4 AND not divisible by 100
// - OR divisible by 400

public class KG18LeapYear {
	public static void main(String[] args) {

		// Display program title
		System.out.println("Program to check whether a given year is a leap year.");

		// Create Scanner object to read input
		Scanner sc = new Scanner(System.in);

		// Prompt user to enter the year
		System.out.print("Please enter the year: ");
		int year = sc.nextInt();

		// Apply leap year logic
		if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
			System.out.println("The given year is a leap year.");
		} else {
			System.out.println("The given year is not a leap year.");
		}

		// Close the scanner to prevent resource leaks
		sc.close();
	}
}