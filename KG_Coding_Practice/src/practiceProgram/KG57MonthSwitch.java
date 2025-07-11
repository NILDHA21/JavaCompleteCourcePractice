package practiceProgram;
import java.util.Scanner;

/*57. Create a program to print the month of the year based on a number (1–12) input 
by the user.*/

public class KG57MonthSwitch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Program to print the month of the year based on a number (1–12) input \r\n"
				+ "by the user.");
		System.out.print("Please enter the month number: ");
		int monthNum = sc.nextInt();
		String monthName = getMonthName(monthNum);
		System.out.println("Your month name is " + monthName);
		sc.close();
	}
	public static String getMonthName(int monthNum) {
		return switch(monthNum){
		case 1 -> "January"; 
		case 2 -> "February"; 
		case 3 -> "March"; 
		case 4 -> "April"; 
		case 5 -> "May"; 
		case 6 -> "June"; 
		case 7 -> "July"; 
		case 8 -> "August"; 
		case 9 -> "September"; 
		case 10 -> "October"; 
		case 11 -> "November"; 
		case 12 -> "December"; 
		default -> "Mars Month";
		};
	}
}
