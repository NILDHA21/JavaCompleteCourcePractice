package practiceProgram;
import java.util.Scanner;

//69. Create a program using recursion to check if a string is a palindrome using recursion.

public class KG69PalindromeRecursion {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to Palindrome Checker.\n");
		System.out.print("Enter the string to be checked: ");
		String str = sc.next();
		System.out.print("Your string is " + ((isPalindrome(str) ? "Palindrome" : "Not Palindrome")));
		sc.close();
	}
	public static boolean isPalindrome(String str) {
		if(str.length() <= 1) {
			return true;
		}
		int lastPos = str.length() - 1;
		if(str.charAt(0) != str.charAt(lastPos)) {
			return false;
		}
		String newStr = str.substring(1, lastPos);
		return isPalindrome(newStr);
	}
}
