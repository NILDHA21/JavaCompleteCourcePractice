package practiceProgram;
import java.util.Scanner;

//38. Create a program to verify if a number is a palindrome.

/*public class KG38CheckPalindrome {
	public static void main(String[] args) {
		System.out.println("Program to verify if a number is a palindrome.");
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter the number: ");
		int num = sc.nextInt();
		boolean isPalindrome = isPalindrome(num);
		if(isPalindrome) {
			System.out.println("The number is Palindrome.");
		}else {
			System.out.println("The number is NOT Palindrome.");
		}
		sc.close();
	}
	public static boolean isPalindrome(int num) {
		int original = num;
		int reverse = 0;
		while(num != 0) {
			int digit = num % 10;
			reverse = reverse * 10 + digit;
			num = num / 10;
		}
		return reverse == original;
	}
}*/

//38. Create a program to verify if a string is a palindrome.

public class KG38CheckPalindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Program to verify if a string is a palindrome");
		System.out.print("Please enter the name in string format: ");
		String name = sc.next();
		boolean isPalindrome = isPalindrome(name);
		if(isPalindrome) {
			System.out.println("The name '" +name + "' is Palindrome");
		}else {
			System.out.println("The name '" +name + "' is not Palindrome");
		}
		sc.close();
		}
	public static boolean isPalindrome(String name) {
		String original = name;
		String reverse = "";
		for(int i = name.length()-1; i >= 0; i--) {
			reverse = reverse + name.charAt(i);
		}
		//return reverse == original;
		return reverse.equals(original);
	}
}
	