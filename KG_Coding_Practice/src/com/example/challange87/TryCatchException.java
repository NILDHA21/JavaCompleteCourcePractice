package com.example.challange87;
import java.util.Scanner;

/*87. Arithmetic Exception Handling
Write a program that asks the user to enter two integers and then divides the first by the second. The program should handle any arithmetic exceptions that may occur (like division by zero) and display an appropriate message.
Key Points:
• Use Scanner to read user input.
• Implement a try-catch block to handle ArithmeticException.
• Display a user-friendly message if division by zero occurs.*/

public class TryCatchException {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		int first = sc.nextInt();
		System.out.println("Enter the second number: ");
		int second = sc.nextInt();
		
		try {
		int result = first / second;
		System.out.println("Result: " + result);
		} catch(ArithmeticException exception) {
			if(exception.getMessage().equals("/ by zero")) {
				System.out.println("Divide by zero occoured.");
			} else {
				throw exception;
			}
		}	
		sc.close();
	}
}