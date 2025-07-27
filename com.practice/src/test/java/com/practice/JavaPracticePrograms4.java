package com.practice;

//Check for Palindrome Number

public class JavaPracticePrograms4 {
	public static void main(String[] args) {
		int num = 121;
		String str = String.valueOf(num);
		boolean isPalindrome = true;
		for(int i = 0; i < str.length() / 2; i++) {
			if(str.charAt(i) != str.charAt(str.length() - 1 - i)){
				isPalindrome = false;
				break;
			}
		}
		System.out.println(isPalindrome ? "Palindrome" : "Not Palindrome");
		
	// OR
//		int num = 121;
//		String str = String.valueOf(num);
//		String reversed = new StringBuilder(str).reverse().toString();
//		if(str.equals(reversed)) {
//			System.out.println("Palindrome");
//		} else {
//			System.out.println("Its not Palindrome");
//		}
		
	// OR
//		int num = 121, rev = 0, original = num;
//		
//		while(num != 0) {
//			int digit = num % 10;
//			rev = rev* 10 + digit;
//			num = num / 10;
//		}
//		if(original == rev) {
//			System.out.println("its Palindrome");
//		} else {
//			System.out.println("its not a Palindrome");
//		}
	}
}
