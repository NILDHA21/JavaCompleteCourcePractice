package practiceProgram;
import java.util.Scanner;

//61. Create a program using for loop to print multiplication table for a number.

public class KG61MultiplicationTableForLoop {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Program using for loop to print multiplication table for a number.");
		System.out.print("Please enter the number:");
		int num = sc.nextInt();
		
		System.out.println("Your multiplication table is here,");
		for(int i =1; i<=10; i++) {
			int result = num * i;
			System.out.println(num + " * "+ i + " = " + result);
		}
		sc.close();
	}
}
