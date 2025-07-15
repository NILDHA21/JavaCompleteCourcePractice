package practiceProgram;
import java.util.Scanner;

//62. Create a program using for to display if a number is prime or not.

public class KG62IsPrimeUsingForLoop {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Program using for to display if a number is prime or not.");
		System.out.print("Please enter the number: ");
		int num = sc.nextInt();
		System.out.println("Your number is "+ (isPrime(num) ? "Prime" : "Not Prime"));
		sc.close();
	}
	public static boolean isPrime(int num) {
		for(int i = 2; i < num; i++) {
			if(num % 2 == 0) {
				return false;
			}
		}
		return true;
	}
}
