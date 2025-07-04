package practiceProgram;
import java.util.Scanner;

// 36. Create a program to print the Fibonacci series up to a certain number.

public class KG36FibonacciSeries {
	public static void main(String[] args) {
		// Creating Scanner object to read user input
		Scanner sc = new Scanner(System.in);

		// Displaying program message
		System.out.println("Program to print the Fibonacci series up to a certain number.");

		// Prompting the user to enter the upper limit for the Fibonacci series
		System.out.println("Enter the certain number: ");
		int num = sc.nextInt();  // Reading input from the user

		// Printing the heading of the output
		System.out.print("Here is a Fibonacci series: ");
		
		// Calling method to print Fibonacci series up to given number
		printFibonacci(num);

		// Closing the Scanner
		sc.close();
	}

	// Method to print Fibonacci series up to a given number
	public static void printFibonacci(int num) {
		// If number is negative, exit the method (no output)
		if (num < 0) return;

		// First Fibonacci number is always 0
		System.out.print("0 ");

		// If user entered 0, just print 0 and return
		if(num == 0) return;

		// Second Fibonacci number is 1
		System.out.print("1 ");

		// Initialize the first two Fibonacci numbers
		int first = 0, second = 1;

		// Loop to generate and print Fibonacci numbers until the next number exceeds the input
		while(first + second <= num) {
			int third = first + second;  // Calculate next Fibonacci number
			System.out.print(third + " ");  // Print the number
			first = second;    // Move first pointer to second
			second = third;    // Move second pointer to newly calculated third
		}
	}
}