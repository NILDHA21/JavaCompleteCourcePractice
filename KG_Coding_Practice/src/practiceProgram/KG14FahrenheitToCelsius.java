package practiceProgram;
import java.util.Scanner;

// Program: Convert Fahrenheit to Celsius
// Formula: C = (F - 32) * 5 / 9

public class KG14FahrenheitToCelsius {
	public static void main(String[] args) {
		
		// Display program description
		System.out.println("Program to convert Fahrenheit to Celsius");

		// Create Scanner object for user input
		Scanner sc = new Scanner(System.in);

		// Prompt user to enter temperature in Fahrenheit
		System.out.print("Enter temperature in Fahrenheit: ");
		double F = sc.nextDouble();  // Read Fahrenheit value

		// Convert Fahrenheit to Celsius using formula
		double C = (F - 32) * (5.0 / 9);  // Use 5.0 to ensure floating-point division

		// Display the result rounded to 2 decimal places
		System.out.printf("Temperature in Celsius is %.2f°C\n", C);

		// Close the scanner to free resources 
		sc.close();
	}
}