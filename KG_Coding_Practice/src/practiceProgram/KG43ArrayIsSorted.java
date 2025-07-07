package practiceProgram;
import java.util.Scanner;

// Program to check if the given array is sorted (either ascending or descending)

public class KG43ArrayIsSorted {

    public static void main(String[] args) {
        System.out.println("Program to check if the given array is sorted.");

        Scanner sc = new Scanner(System.in);

        // Ask user for array length
        System.out.print("Please enter the array length: ");
        int size = sc.nextInt();

        // Declare the array with user-defined size
        int[] arr = new int[size];

        // Input: Array elements from the user
        int i = 0;
        while (i < size) {
            System.out.print("Enter the element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
            i++;
        }

        // Call helper methods to check if array is sorted
        boolean isDec = isDecreasing(arr);
        boolean isAsc = isAscending(arr);

        // Print result based on method outputs
        if (isDec || isAsc) {
            System.out.println("Your array is sorted.");
        } else {
            System.out.println("Your array is not sorted.");
        }

        sc.close(); // Close the Scanner object
    }

    // Method to check if the array is in decreasing (descending) order
    
    public static boolean isDecreasing(int[] arr) {
        int i = 1; // Start from index 1 to compare with previous element
        while (i < arr.length) {
            // If current element is greater than the previous, it's not decreasing
            if (arr[i] > arr[i - 1]) {
                return false;
            }
            i++;
        }
        return true; // If no violations, it's decreasing
    }

    // Method to check if the array is in increasing (ascending) order
    
    public static boolean isAscending(int[] arr) {
        int i = 1; // Start from index 1 to compare with previous element
        while (i < arr.length) {
            // If current element is less than the previous, it's not ascending
            if (arr[i] < arr[i - 1]) {
                return false;
            }
            i++;
        }
        return true; // If no violations, it's ascending
    }
}