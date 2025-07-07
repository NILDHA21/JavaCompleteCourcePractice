package practiceProgram;
import java.util.Scanner;

//42. Create a program to find the maximum and minimum element in an array.  

public class KG42MinMax {
	public static void main(String[] args) {
	System.out.println("Program to find the maximum and minimum element in an array.");
	Scanner sc = new Scanner(System.in);
	System.out.print("Please enter the length of an array in integer: ");
	int size = sc.nextInt();
	int[] arr = new int[size];
	int i = 0;
	while(i<size) {
		System.out.print("Please enter the element number " + (i+1) + ": ");
		arr[i] = sc.nextInt();
		i++;
		}
	int max = max(arr);
	int min = min(arr);
	System.out.println("Max of the array is: " + max);
	System.out.println("Min of the array is: " + min);
	sc.close();
	}
	
	public static int max(int[] arr) {
		if(arr.length == 0) {
			return Integer.MIN_VALUE;
		}
		int max = arr[0];
		int i = 1;
		while(i<arr.length) {
			if(max < arr.length) {
				max = arr[i];
			}
			i++;
		}
		return max;
	}
	
	public static int min(int[] arr) {
		int i = 0;
		int min = Integer.MAX_VALUE;
		while(i<arr.length) {
			if(min>arr[i]) {
				min = arr[i];
			}
			i++;
		}
		return min;
	}
}
