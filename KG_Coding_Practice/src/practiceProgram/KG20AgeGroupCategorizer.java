package practiceProgram;
import java.util.Scanner;

/*
 * Program: Age Group Categorizer
 * Description:
 *   - Child  -> age below or equal to 13
 *   - Teen   -> age 14 to 20
 *   - Adult  -> age 21 to 60
 *   - Senior -> age above 60
 */

public class KG20AgeGroupCategorizer {
	public static void main(String[] args) {

		// Display program title
		System.out.println("Program to categorize a person into different age groups.");

		// Create Scanner object to take user input
		Scanner sc = new Scanner(System.in);

		// Prompt user to enter age
		System.out.print("Please enter your age: ");
		int age = sc.nextInt();

		// Determine the age group using if-else ladder
		if (age < 0) {
			System.out.println("Invalid input: Age cannot be negative.");
		} else if (age <= 13) {
			System.out.println("The person is in the Child category.");
		} else if (age <= 20) {
			System.out.println("The person is in the Teen category.");
		} else if (age <= 60) {
			System.out.println("The person is in the Adult category.");
		} else {
			System.out.println("The person is in the Senior category.");
		}
		// Close the scanner (good practice)
		sc.close();
	}
}
