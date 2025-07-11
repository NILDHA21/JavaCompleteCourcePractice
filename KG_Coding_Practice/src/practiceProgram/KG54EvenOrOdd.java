package practiceProgram;
import java.util.Scanner;

//54. Create a program to find if the given number is even or odd.

public class KG54EvenOrOdd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Program to find if the given number is even or odd.");
		System.out.print("Please enter the number: ");
		int num = sc.nextInt();
		String result = num % 2 == 0 ? "Even" : "Odd";
		System.out.println("Your number is " + result);
		sc.close();
	}

}
