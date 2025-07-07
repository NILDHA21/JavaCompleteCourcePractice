package practiceProgram;
import java.util.Scanner;

// 45. Create a program to reverse an array using while loop

public class KG45Reversal {
	public static void main(String[] args) {
		System.out.println("Program to reverse an array");

		Scanner sc = new Scanner(System.in);  // Scanner for user input

		// Step 1: Ask user to enter the array size
		System.out.print("Please enter the length/size of the array: ");
		int size = sc.nextInt();

		// Step 2: Create an array of the given size
		int[] arr = new int[size];

		// Step 3: Take array elements as input from the user
		int i = 0;
		while(i < arr.length) {
			System.out.print("Please enter the element " + (i + 1) + " : ");
			arr[i] = sc.nextInt();  // Store user input in array
			i++;
		}

		// Step 4: Reverse the array and store in newArr
		int[] newArr = reverse(arr);

		// Step 5: Print the reversed array
		System.out.println("The required reversed array is ");
		int k = 0;
		while(k < newArr.length) {
			System.out.print(newArr[k] + " ");  // Print each element with space
			k++;
		}
		System.out.println();  // Print a new line after array output

		sc.close();  // Close the scanner to prevent resource leak
	}

	// Method to reverse the given array
	public static int[] reverse(int[] arr) {
		int newSize = arr.length;
		int[] newArr = new int[newSize];  // Create a new array of same size

		// Initialize i to last index of original array
		int i = arr.length - 1;
		int j = 0;  // Index for new array (starts from beginning)

		// Step 6: Copy elements from original array to new array in reverse order
		while(i >= 0) {
			newArr[j] = arr[i];  // Assign reversed element
			i--;  // Move backward in original array
			j++;  // Move forward in new array
		}
		return newArr;  // Return the reversed array
	}
}