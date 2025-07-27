package com.practice;

// 🔹 8. Fibonacci Series (first 10 terms)

//public class JavaPracticePrograms8 {
//	public static void main(String[] args) {
//		int a = 0, b = 1;
//		System.out.println("Fibonacci Series is : ");
//		System.out.print(a + " " + b);
//		for(int i = 2; i < 10; i++) {
//			int c = a + b;
//			System.out.print(" " + c);
//			a = b;
//			b = c;
//		}
//	}
//}

// OR

public class JavaPracticePrograms8 {
	public static void main(String[] args) {
		int count = 10;
		int[] fib = new int[count];
		
		fib[0] = 0;
		fib[1] = 1;
		System.out.println("Fibonacci Series is : ");
		System.out.print(fib[0] + " " + fib[1]);
		
		for(int i = 2; i < count; i++) { 
			fib[i] = fib[i - 1] + fib[i -2];
			System.out.print(" " + fib[i]);
		}
	}
}