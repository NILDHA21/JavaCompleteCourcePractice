package com.practice;
import java.util.Scanner;

//Check Even or Odd

public class JavaPracticePrograms1 {
	public static void main(String[] args) {
		System.out.print("Enter the number: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if(num % 2 == 0) {
			System.out.println("Even");
		} else {
			System.out.println("Odd");
		}
		sc.close();
	}
}
