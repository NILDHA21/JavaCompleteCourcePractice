package practiceProgram;

import java.util.Scanner;

// 35. Create a program to reverse the digits of a number.

public class KG35ReverseNumber {

	public static void main(String[] args) {
		// Creating Scanner object to take input from user
		Scanner sc = new Scanner(System.in);

		// Displaying program purpose
		System.out.println("Program to reverse the digits of a number.");

		// Prompting user to enter the number
		System.out.println("Please enter the number: ");
		int num = sc.nextInt();  // Reading input number from user

		// Calling method to reverse the number
		int rev = reverseNumber(num);

		// Printing the reversed number
		System.out.println("Reverse of the number is " + rev);

		// Closing Scanner to prevent resource leak
		sc.close();
	}

	// Method to reverse the digits of a number
	public static int reverseNumber(int num) {
		int rev = 0; // Variable to store the reversed number

		// Loop until the number becomes 0
		while(num != 0) {
			int digit = num % 10;  // Extracting the last digit
			rev = rev * 10 + digit;  // Appending digit to the reversed number
			num = num / 10;  // Removing the last digit from the original number
		}
		
		// Returning the reversed number
		return rev;
	}
}