package practiceProgram;
import java.util.Scanner;

// Program: Determines if a number is odd or even

public class KG16OddEven {
	public static void main(String[] args) {

		// Display purpose of the program
		System.out.println("Program that determines if a number is odd or even.");

		// Create a Scanner object to take input from the user
		Scanner sc = new Scanner(System.in);

		// Prompt the user to enter a number
		System.out.print("Please enter a number: ");
		int a = sc.nextInt();  // Read the input number

		// Check if the number is even (divisible by 2 with no remainder)
		if (a % 2 == 0) {
			System.out.println("The given number is an Even number.");

		// If not even, then it's odd
		} else {
			System.out.println("The given number is an Odd number.");
		}

		// Close the Scanner (best practice to release resources)
		sc.close();
	}
}
