package practiceProgram;
import java.util.Scanner;

// 41. Create a program to find number of occurrences of an element in an array.

public class KG41Occourrence {
	public static void main(String[] args) {
		System.out.println("Program to find number of occurrences of an element in an array.");

		// Scanner object to take input from user
		Scanner sc = new Scanner(System.in);

		// Ask user for array size
		System.out.print("Please enter the length of array in integer format: ");
		int size = sc.nextInt();

		// Create an integer array of given size
		int[] arr = new int[size];

		// Loop to accept array elements from user
		int i = 0;
		while(i < size) {
			System.out.print("Please enter the element number " + (i+1) + ": ");
			arr[i] = sc.nextInt();
			i++;
		}

		// Ask user for the element to search for
		System.out.print("Please enter the number you want to find in the array: ");
		int find = sc.nextInt();

		// Call the method to count occurrences of the number
		int occourrence = noOfOccourrence(arr, find);

		// Print the result
		System.out.print("Your element was found " + occourrence + " times.");

		// Close the scanner
		sc.close();
	}

	// Method to count how many times a number occurs in the array
	public static int noOfOccourrence(int[] arr, int find) {
		int occourrence = 0;
		int i = 0;

		// Loop through array and count matching elements
		while(i < arr.length) {
			if(arr[i] == find) {
				occourrence++;
			}
			i++;
		}

		// Return the total count
		return occourrence;
	}
}
