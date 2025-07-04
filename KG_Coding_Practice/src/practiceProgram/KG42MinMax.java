package practiceProgram;

import java.util.Scanner;

//42. Create a program to find the maximum and minimum element in an array.  

public class KG42MinMax {
	public static void main(String[] args) {
	System.out.println("Program to find the maximum and minimum element in an array.");
	Scanner sc = new Scanner(System.in);
	System.out.print("Please enter the length of an array in integer: ");
	int arrLength = sc.nextInt();
	int[] arr = new int[arrLength];
	int i = 0;
	while(i<arrLength) {
		System.out.println("Please enter the element number" + (i+1) + ": ");
		arr[i] = sc.nextInt();
		i++;
		}
	}
}
