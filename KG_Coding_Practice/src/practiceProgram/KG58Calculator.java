package practiceProgram;
import java.util.Scanner;

/*58. Create a program to create a simple calculator that uses a switch statement 
to perform basic arithmetic operations like addition, subtraction, multiplication, and division.*/

public class KG58Calculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to Switch Calculator.\n");
		System.out.print("Please enter the first number: ");
		int firstNum = sc.nextInt();
		System.out.print("Please enter the second number: ");
		int secondNum = sc.nextInt();
		System.out.print("Please enter the operator (+, -, *, /): ");
		String operator = sc.next();
		
		int result = switch(operator) {
		case "+" -> firstNum + secondNum;
		case "-" -> firstNum - secondNum;
		case "*" -> firstNum * secondNum;
		case "/" -> firstNum / secondNum;
		default -> -1;
		};
		
		System.out.println("Result is " + result);
		sc.close();
	}
}
