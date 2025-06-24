package practiceProgram;
import java.util.Scanner;

//Create a program to calculate product of two floating points numbers.

public class KG9ProductOfFloat {
	public static void main(String[] args) {
		System.out.println("Enter two numbers.");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first number as a = ");
		float a = sc.nextFloat();
		System.out.print("Enter second number as b = ");
		float b = sc.nextFloat();
		float mul = a * b;
		System.out.println("Product of two floating point numbers is " + mul);
	    System.out.printf("Product of two floating point numbers is %.2f", mul);
	}
}
