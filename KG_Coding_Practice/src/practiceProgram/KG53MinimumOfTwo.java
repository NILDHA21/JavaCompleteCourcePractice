package practiceProgram;
import java.util.Scanner;

//53. Create a program to find the minimum of two numbers using ternary operator.

public class KG53MinimumOfTwo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Program to find the minimum of two numbers using ternary operator.");
		System.out.print("Please enter first number: ");
		int num1 = sc.nextInt();
		System.out.print("Please enter second number: ");
		int num2 = sc.nextInt();
		KG53MinimumOfTwo ternary = new KG53MinimumOfTwo();
		int min = ternary.min(num1, num2);
		System.out.println("The minimum of two numbers is " + min);
		sc.close();
	}
	public int min(int num1, int num2) {
		return num1 < num2 ? num1 : num2;
		
//		if(num1 < num2) {
//			return num1;
//		}else
//		return num2;
	}
}
