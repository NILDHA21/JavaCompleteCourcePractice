package com.practice;
import java.math.BigInteger;

//Factorial of a Number

public class JavaPracticePrograms5 {
	public static void main(String[] args) {
		
//for very large numbers
		int num = 100;
		BigInteger fact = BigInteger.ONE;
		
		for(int i = 2; i<= num; i++) {
			fact = fact.multiply(BigInteger.valueOf(i));
		}
		System.out.println("Factorial: " + fact);
		//OR		
//		int num = 5 , fact = 1;
//		while(num > 0) {
//			fact = fact * num;
//			num--;
//		}
//		System.out.println(fact);
	
	//OR
//		int num = 5 , fact = 1;
//		for(int i = 1; i <= num; i++) {
//			fact = fact * i;
//		}
//		System.out.println("factorial: " + fact);
	}
}
