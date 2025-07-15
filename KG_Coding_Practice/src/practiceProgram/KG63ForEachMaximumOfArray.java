package practiceProgram;
import java.util.Scanner;

//63. Create a program using for-each to find the maximum value in an integer array.

public class KG63ForEachMaximumOfArray {
	public static void main(String[] args) {
		int[] myArr = inputArray();
		int max = Integer.MIN_VALUE;
		for(int num : myArr) {
			if(num > max) {
				max = num;
			}
		}
		System.out.println("The maximum value in the array is: " + max);
	}
	
	public static int[] inputArray() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter the number of elements: ");
		int size = sc.nextInt();
		
		int[] nums = new int[size];
		int i = 0;
		while(i < size) {
			System.out.println("Please enter the element no "+ (i+1)+ " : ");
			nums[i] = sc.nextInt();
			i++;
		}
		return nums;
	}
}
