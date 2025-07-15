package practiceProgram;
import java.util.Scanner;

//60. Create a program using do-while to implement a number guessing game.

public class KG60NumberGuessing {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Program using do-while to implement a number guessing game.");
		int num;
		do {
			System.out.print("Please enter the number: ");
			num = sc.nextInt();
		}while(!isValidNumber(num));
		
		System.out.println("Congrats, your guessing is correct.");
		sc.close();
	}
	public static boolean isValidNumber(int num) {
		return num == 6;
	}
}
