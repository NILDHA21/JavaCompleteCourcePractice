package practiceProgram;
import java.util.Scanner;

//55. Create a program to calculate the absolute value of a given integer.

public class KG55AbsoluteValue {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Program to calculate the absolute value of a given integer.");
		System.out.println("Please enter the number: ");
		int num = sc.nextInt();
		
		int absoluteValue = num < 0 ? -num : num;
		System.out.println("Absolute value of number is " + absoluteValue);
		sc.close();
	}

}
