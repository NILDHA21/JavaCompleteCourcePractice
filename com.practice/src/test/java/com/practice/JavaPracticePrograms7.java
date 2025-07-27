package com.practice;

// 🔹 7. Factorial of a Number

//public class JavaPracticePrograms7 {
//	public static void main(String[] args) {
//		int num = 5;
//		int fact = 1;
//		
//		for(int i = 1; i<= num; i++) {
//			fact = fact * i;
//		}
//		System.out.println("Factorial of a number is: " + fact);
//	}
//}

// OR
// Using Recursion

public class JavaPracticePrograms7 {
	public static void main(String[] args) {
		int num = 5;
		int result = factorial(num);
		System.out.println("Factorial of a number is: " + result);
	}
	
	public static int factorial(int num) {
		if(num == 0 || num == 1) return 1;
		else
		return num * factorial(num - 1);
	}
}
