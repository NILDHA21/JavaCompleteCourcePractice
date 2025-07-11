package practiceProgram;
import java.util.Scanner;

/*56. Create a program to Based on a student's score, categorize as "High", "Moderate", 
or "Low" using the ternary operator (e.g., High for scores > 80, Moderate for 50–80, 
Low for < 50).*/

public class KG56StudentScoreTurnary {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Program to Based on a student's score, categorize as \"High\", \"Moderate\", \r\n"
				+ "or \"Low\" using the ternary operator");
		System.out.print("Please enter the score: ");
		int marks = sc.nextInt();
		
		String category = marks >= 80 ? "High" : (marks >= 50 ? "Moderate" : "Low");
		System.out.println("The category for the marks " + marks + " of student is " + category);
		sc.close();
		}

}
