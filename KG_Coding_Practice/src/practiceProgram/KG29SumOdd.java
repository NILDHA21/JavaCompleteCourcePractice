package practiceProgram;

import java.util.Scanner;

/*
 * Program Name: KG29SumOdd
 * Objective: Create a program to sum all odd numbers from 1 to a specified number N.
 */

public class KG29SumOdd {

	public static void main(String[] args) {
		// Create a Scanner object to read user input
		Scanner sc = new Scanner(System.in);
		
		// Prompt the user for input
		System.out.println("Program to calculate sum of odd numbers till nth given number");
		System.out.print("Please enter the number: ");
		
		int num = sc.nextInt(); // Read input number from user
		
		// Call method to calculate the sum of odd numbers up to 'num'
		int sum = SumOddCalculator(num);
		
		// Display the result
		System.out.println("Odd sum till " + num + " is: " + sum);
		
		// Close the scanner to prevent resource leak
		sc.close();
	}
	
	// Method to calculate the sum of odd numbers up to a given number
	public static int SumOddCalculator(int num) {
		int i = 1;         // Start from the first odd number
		int sum = 0;       // Variable to store the cumulative sum
		
		// Loop through all odd numbers until 'num'
		while(i <= num) {
			sum += i;     // Add current odd number to sum
			i += 2;       // Move to the next odd number
		}
		return sum;       // Return the final sum
	}
}

/*
 *010 => 0025
 *020 => 0100
 *030 => 0225
 *040 => 0400
 *050 => 0625
 *060 => 0900
 *070 => 1225
 *080 => 1600
 *090 => 2025
 *100 => 2500
 *110 => 3025
 */