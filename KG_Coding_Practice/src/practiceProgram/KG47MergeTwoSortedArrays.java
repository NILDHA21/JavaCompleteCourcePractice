package practiceProgram;
import java.util.Arrays;
import java.util.Scanner;

//47. Create a program to merge two sorted arrays.  

public class KG47MergeTwoSortedArrays {
	public static void main(String[] args) {
		System.out.println("program to merge two sorted arrays. ");
		Scanner sc = new Scanner(System.in);
		System.out.print("Please provide the size of 1st array: ");
		int size1 = sc.nextInt();
		int[] arr1 = getInputArray(size1,sc);
		Arrays.sort(arr1);
		
		System.out.print("Please provide the size of 2nd array: ");
		int size2 = sc.nextInt();
		int[] arr2 = getInputArray(size2,sc);
		Arrays.sort(arr2);
		
		int[] mergedArr = merge(arr1, arr2);
		display(mergedArr);
		sc.close();
	}
	
	//logic for merger of two arrays
	public static int[] merge(int[] arr1, int[] arr2) {
		int newSize = arr1.length + arr2.length;
		int[] newArr = new int[newSize];
		int i = 0, j = 0, k = 0;
		while(i < arr1.length || j < arr2.length) {
			if(j == arr2.length || (i < arr1.length && arr1[i] < arr2[j])) {
				newArr[k] = arr1[i];
				i++;
				k++;
			}else {
				newArr[k] = arr2[j];
				j++;
				k++;
			}
		}
		
		return newArr;
	}
	
	//Method to get input array
	public static int[] getInputArray(int size, Scanner sc) {
		int[] arr = new int[size];
		int i = 0;
		while(i < size) {
			System.out.print("Please enter the element " + (i+1) + " : ");
			arr[i] = sc.nextInt();
			i++;
		}
		return arr;
	}
	
	//method to display array
	public static void display(int[] mergedArr) {
		System.out.println("The required array is: ");
		int l = 0;
		while(l < mergedArr.length) {
			System.out.print(mergedArr[l] + " ");
			l++;
		}
		System.out.println();  // Print a new line after array output
	}
}























