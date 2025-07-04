package practiceProgram;

import java.util.Scanner;

// 40. Create a program to find the sum and average of all elements in an array.

public class KG40ArraySumAverage {
	public static void main(String[] args) {
		System.out.println("Program to find the sum and average of all elements in an array.");
		
		// Scanner object to take input from the user
		Scanner sc = new Scanner(System.in);
		
		// Ask the user for the length of the array
		System.out.print("Please enter the length of array : ");
		int size = sc.nextInt();
		
		// Declare and initialize the array
		int[] nums = new int[size];
		
		// Take input for array elements from the user
		int i = 0;
		while (i < size) {
			System.out.print("Please enter the element number " + (i + 1) + ": ");
			nums[i] = sc.nextInt();
			i++;
		}
		
		// Call method to calculate sum of elements
		long sum = sum(nums);
		
		// Call method to calculate average of elements
		double average = average(nums);
		
		// Display the sum and average
		System.out.println("The sum of array is " + sum);
		System.out.println("The average of array is " + average);
		
		// Close the Scanner object
		sc.close();
	}
	
	// Method to calculate and return the sum of array elements
	public static long sum(int[] nums) {
		long sum = 0;
		int i = 0;
		while (i < nums.length) {
			sum = sum + nums[i];
			i++;
		}
		return sum;
	}
	
	// Method to calculate and return the average of array elements
	public static double average(int[] nums) {
		double sum = sum(nums);  // Reuse the sum method to get total sum
		return sum / nums.length; // Divide by number of elements to get average
	}
}
