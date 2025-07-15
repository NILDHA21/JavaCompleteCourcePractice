package practiceProgram;
import java.util.Scanner;

//59. Create a program using do-while to find password checker until a valid password is entered.

public class KG59PasswordChecker {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Program using do-while to find password checker until a valid password is entered.");
		String password;
		
		do{
			System.out.print("Please enter the password: ");
			password = sc.next();
		}while(!isValidPassword(password));
		
		System.out.println("Thanks for entering correct password.");
		sc.close();
	}
	public static boolean isValidPassword(String password) {
		return password.length() > 6;
	}
}
