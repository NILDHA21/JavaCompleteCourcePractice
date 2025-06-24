package practiceProgram;
import java.util.Scanner;

/*5. Create a program to input name of the person and
respond with "Welcome NAME to Pune".*/

public class KG5Welcome {
	public static void main(String[] args) {
		System.out.print("Enter your name: ");
		Scanner input = new Scanner(System.in);
		String name = input.nextLine();
		System.out.print(name +", Welcome to Pune");
	}
}
