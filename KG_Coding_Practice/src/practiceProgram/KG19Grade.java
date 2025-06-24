package practiceProgram;
import java.util.Scanner;

/*
 * Program: Grade Calculator
 * Description:
 *   A  -> 90 and above
 *   B  -> 75 to 89
 *   C  -> 60 to 74
 *   D  -> 30 to 59
 *   E  -> below 30
 */

public class KG19Grade {
	public static void main(String[] args) {
		
		// Program header
		System.out.println("Program to calculate grade according to marks.");

		// Create Scanner object to take user input
		Scanner sc = new Scanner(System.in);

		// Prompt user to enter marks
		System.out.print("Please enter your marks for calculating grade: ");
		float marks = sc.nextFloat();

		// Determine grade using if-else ladder
		if (marks >= 90) {
			System.out.println("Student is in grade A");
		} else if (marks >= 75) {
			System.out.println("Student is in grade B");
		} else if (marks >= 60) {
			System.out.println("Student is in grade C");
		} else if (marks >= 30) {
			System.out.println("Student is in grade D");
		} else {
			System.out.println("Student is in grade E");
		}

		// Close the scanner to free resources
		sc.close();
	}
}
