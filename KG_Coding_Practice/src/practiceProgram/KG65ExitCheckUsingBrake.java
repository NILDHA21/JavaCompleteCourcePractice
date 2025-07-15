package practiceProgram;
import java.util.Scanner;

/*65. Create a program using break to read inputs from the user in a loop 
 * and break the loop if a specific keyword (like "exit") is entered. */

public class KG65ExitCheckUsingBrake {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	while(true) {
		System.out.print("Please enter your command: ");
		String command = sc.next();
		//if(command.contentEquals("exit"))
		//if(command.equals("exit"))
		if(command.equalsIgnoreCase("exit")) {
			break;
		}
	}
	System.out.println("You have successfully exited.");
	sc.close();
	}
}
