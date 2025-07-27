package com.practice;

//Find Maximum of 3 Numbers

public class JavaPracticePrograms2 {
//	public static void main(String[] args) {
//		int a = 10, b = 20, c = 32;
//		int max = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);
//		System.out.println(max);
//	}
	
	public static void main(String[] args) {
		int a = 10, b = 20, c = 32;
		int max;
		if ((a >= b) && (a >= c)) {
			max = a;
		} else if((b >= a) && (b >= c)) {
				max = b;
		} else 
			max = c;
		System.out.println("Maximum number is: " + max);
		}
	}