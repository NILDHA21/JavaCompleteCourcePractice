package practiceProgram;
import java.util.Scanner;

// Program: Determine the greatest of three numbers

public class KG17Greatest {
	public static void main(String[] args) {

		// Display the purpose of the program
		System.out.println("Program to determine the greatest among three numbers.");

		// Create a Scanner object to read input from user
		Scanner sc = new Scanner(System.in);

		// Prompt user to enter first number
		System.out.print("Enter first number: ");
		int a = sc.nextInt();

		// Prompt user to enter second number
		System.out.print("Enter second number: ");
		int b = sc.nextInt();

		// Prompt user to enter third number
		System.out.print("Enter third number: ");
		int c = sc.nextInt();

		// Check if all three numbers are equal
		if (a == b && b == c) {
			System.out.println("All three numbers are equal.");
		}
		// Check if 'a' is the greatest
		else if ((a > b) && (a > c)) {
			System.out.printf("The first number which is %d is the greatest.\n", a);
		}
		// Check if 'b' is the greatest
		else if ((b > a) && (b > c)) {
			System.out.printf("The second number which is %d is the greatest.\n", b);
		}
		// Otherwise, 'c' is the greatest
		else {
			System.out.printf("The third number which is %d is the greatest.\n", c);
		}

		// Close the scanner (good practice)
		sc.close();
	}
}