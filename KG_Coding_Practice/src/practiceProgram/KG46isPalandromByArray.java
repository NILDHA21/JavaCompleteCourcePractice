package practiceProgram;

import java.util.Scanner;

//46. Create a program to check is the array palindrome or not.  

public class KG46isPalandromByArray {

	public static void main(String[] args) {
		System.out.println("Program to check is the array palindrome or not.");
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter the size/length of the array: ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		int i = 0;
		while(i < arr.length) {
			System.out.print("Please enter the element at " + (i+1) + " position: ");
			arr[i] = sc.nextInt();
			i++;
		}
		boolean isPalindrome = isPalindrome(arr);
		if(isPalindrome) {
			System.out.println("Array is palindrome array.");
		}else {
			System.out.println("Array is NOT palindrome array.");
		}
		
		sc.close();
	}
	
	public static boolean isPalindrome(int[] arr) {
		int i = 0;
		//int copy = arr[i];
		while(i< arr.length/2) {
			if(arr[i] != arr[(arr.length - 1) - i]) {
				return false;
			}
			i++;
		}
		return true;
	}
}
