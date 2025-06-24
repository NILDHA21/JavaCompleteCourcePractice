package practiceProgram;
import java.util.Scanner;

//6. Create a program to add two numbers.

public class KG6SimpleAddition {

	public static void main(String[] args) {
		System.out.println("Please enter numbers for addition.");
		Scanner number = new Scanner(System.in);
		System.out.print("Enter first number: ");
		int first = number.nextInt();
		System.out.print("Enter second number: ");
		int second = number.nextInt();
		int sum = first + second;
		System.out.print("The addition of two numbers is: " + sum);
	}
}
