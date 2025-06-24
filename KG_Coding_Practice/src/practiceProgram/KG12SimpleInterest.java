package practiceProgram;
import java.util.Scanner;
/*
 * Program Name: SimpleInterest
 * Description: This program calculates the Simple Interest using the formula:
 *              Simple Interest = (Principal * Time * Rate) / 100
 * Date: 21 June 2025
 */
public class KG12SimpleInterest {
	public static void main(String[] args) {
		// Display a message about the program's purpose
		System.out.println("The program for calculating the Simple Interest.");
		
		// Create a Scanner object to read input from the user
		Scanner sc = new Scanner(System.in);
		
		// Prompt the user to enter the Principal amount
		System.out.print("Enter the value for Principal amount in rupees: ");
		int P = sc.nextInt(); // Read principal amount
		
		// Prompt the user to enter the Time in years
		System.out.print("Enter the value for Time in years: ");
		int T = sc.nextInt(); // Read time
		
		// Prompt the user to enter the Rate of Interest
		System.out.print("Enter the value for Rate of interest: ");
		float R = sc.nextFloat(); // Read rate of interest
		
		// Calculate simple interest using the formula
		float SI = (P * T * R) / 100;
		
		// Display the result with 3 decimal places
		System.out.printf("Simple Interest in Rs. %.3f", SI);
		
		// Display the total amount
		System.out.println("\nTotal Amount = " + (SI + P));
		
		// Close the scanner to prevent memory leak
		sc.close();
	}
}
