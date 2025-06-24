package practiceProgram;
import java.util.Scanner;

// Program to calculate Compound Interest
// Formula: Compound Interest = P * [(1 + R/100)^T - 1]

public class KG13CompoundInterest {
	public static void main(String[] args) {
		// Display program information
		System.out.println("Program to calculate Compound Interest");
		
		// Create Scanner object to take input from user
		Scanner sc = new Scanner(System.in);

		// Prompt and read the principal amount from the user
		System.out.print("\nEnter the Principal in rupees: ");
		int P = sc.nextInt();

		// Prompt and read the annual rate of interest from the user
		System.out.print("Enter the Rate of Interest:  ");
		double R = sc.nextDouble();

		// Prompt and read the time in years from the user
		System.out.print("Enter the Time in years: ");
		int T = sc.nextInt();

		// Calculate compound interest using formula: P * ((1 + R/100)^T - 1)
		double CI = P * (Math.pow((1 + R / 100), T) - 1);

		// Display the calculated compound interest rounded to 2 decimal places
		System.out.printf("The calculated Compound Interest is %.2f", CI);

		// Close the scanner to avoid memory leak
		sc.close();
	}
}
