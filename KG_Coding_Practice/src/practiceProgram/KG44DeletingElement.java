package practiceProgram;

import java.util.Arrays;
import java.util.Scanner;

// 44. Create a program to return a new array after deleting a specific element.

public class KG44DeletingElement {
	public static void main(String[] args) {
		System.out.println("Program to return a new array deleting a specific element.");
		Scanner sc = new Scanner(System.in);

		// Ask user for array size and initialize the array
		System.out.print("Please enter the size/length of array: ");
		int size = sc.nextInt();
		int[] arr = new int[size];

		// Take array input from the user using while loop
		int i = 0;
		while (i < arr.length) {
			System.out.print("Please enter the " + (i + 1) + " element: ");
			arr[i] = sc.nextInt();
			i++;
		}

		// Ask the user which number to delete
		System.out.println("Enter the number that you want to delete: ");
		int num = sc.nextInt();

		// Call method to delete all occurrences of the number and get the new array
		int[] newArr = deleteNumber(arr, num);

		// Display the new array
		System.out.println("Here is your new array " + Arrays.toString(newArr));
		sc.close(); // Close the scanner to prevent memory leaks
	}

	// Method to delete all occurrences of a specific number from the array
	public static int[] deleteNumber(int[] arr, int num) {
		// Call external method to count occurrences of the number
		int occ = KG41Occourrence.noOfOccourrence(arr, num);

		// If number is not found, return original array
		if (occ == 0) {
			return arr;
		}

		// Calculate new array size after deleting the number
		int newSize = arr.length - occ;
		int[] newArr = new int[newSize];

		// Use while loop to copy all elements except the number to delete
		int i = 0, j = 0;
		while (i < arr.length) {
			if (arr[i] != num) {
				newArr[j] = arr[i]; // Copy element to new array
				j++; // Move to next index in new array
			}
			i++; // Move to next element in original array
		}

		// Return the new array without the deleted number
		return newArr;
	}
}