package com.practice;

// 🔹 6. Check for Palindrome Number

public class JavaPracticePrograms6 {
	public static void main(String[] args) {
		int num = 121;
		if(isPalindrome(num)) {
			System.out.println(num + "  Palindrome");
		} else
			System.out.println(num + " Not Palindrome");
		
	}
	public static boolean isPalindrome(int num) {
		int original = num;
		int rev = 0;
		while(num != 0) {
			int digit = num % 10;
			rev = rev*10 + digit;
			num = num / 10;
		}
		return rev == original;
	}
}
