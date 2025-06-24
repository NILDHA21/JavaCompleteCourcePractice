package practiceProgram;
import java.util.Scanner;

/*Create a program that takes two numbers and shows result Of all 
arithmetic operators (+, -, *, /, %).*/

public class KG8ArithmeticOperators {
	public static void main(String[] args) {
		System.out.println("Please enter two numbers");	
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first number: ");
		int first = sc.nextInt();
		System.out.print("Enter second number: ");
		int second = sc.nextInt();
		int sum = first + second;
		int sub = first - second;
		int mul = first * second;
		int div = first / second;
		int mod = first % second;
		System.out.println("The addition of two number is: " + sum);
		System.out.println("The subtraction of two number is: " + sub);
		System.out.println("The multiplication of two number is: " + mul);
		System.out.println("The division of two number is: " + div);
		System.out.println("The Modulus of two number is: " + mod);
		}
}
