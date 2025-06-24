package practiceProgram;
import java.util.Scanner;

//7. Create a program to swap two numbers.
	
public class KG7Swap {
	public static void main(String[] args) {
		System.out.println("Program for swapping between two numbers.");
		Scanner swap = new Scanner(System.in);
		System.out.print("Enter first number: ");
		int first = swap.nextInt();
		System.out.print("Enter second number: ");
		int second = swap.nextInt();
		first = first + second;
		second = first - second;
		first = first - second;
		System.out.println("Swapping between two numbers is done.");
		System.out.println("Now first number is: " + first);
		System.out.println("Now second number is: " + second);
	}
}
