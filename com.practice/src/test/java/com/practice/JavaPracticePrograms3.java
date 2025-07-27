package com.practice;

//Reverse a Number

public class JavaPracticePrograms3 {
	static int rev = 0;
	
	public static void reverse(int num) {
		if (num == 0) return;
		int digit = num % 10;
		rev = rev * 10 + digit;
		reverse(num / 10);
	}
	public static void main(String[] args) {
		int num = 1234;
		reverse(num);
		System.out.println(rev);
		
	// OR			
//		int num = 1234;
//		String str = String.valueOf(num);
//		String revStr = new StringBuilder(str).reverse().toString();
//		int rev = Integer.parseInt(revStr);
//		System.out.println(rev);
//		
		
// OR	
//		int num = 1234, rev = 0;
//		while(num != 0) {
//			int digit = num % 10;
//			rev = rev * 10 + digit;
//			num = num / 10;
//		}
	}
}
