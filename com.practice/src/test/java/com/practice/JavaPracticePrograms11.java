package com.practice;

// 🔹 11. Print Prime Numbers in Range

public class JavaPracticePrograms11 {
	public static void main(String[] args) {
		
		int start = 10, end = 50;
		System.out.print("Prime numbers between " + start + " and " + end + " : " );
		for(int num = start; num <= end; num++) {
			if(isPrime(num)) {
				System.out.print(num + " ");
			}
		}
	}
	public static boolean isPrime(int num) {
		if(num <= 1) return false;
		
		for(int i = 2; i<= num/2; i++) {
			if(num % i == 0) {
				return false;
			}
		}
		return true;
	}
}

	
//public class JavaPracticePrograms11 {
//	public static void main(String[] args) {	
//		int start = 10, end = 50;
//		
//		for (int num = start; num<=end; num++) {
//			boolean isPrime = true;
//			
//			if(num <= 1)
//				continue;
//			
//			for (int i = 2; i<= Math.sqrt(num); i++) {
//				if(num % i == 0) {
//					isPrime = false;
//					break;
//				}
//			}
//			if(isPrime)
//				System.out.print(num + " ");
//		}
//	}
//}
