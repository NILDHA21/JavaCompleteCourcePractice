package practiceProgram;
import java.util.Scanner;

//66. Create a program using continue to sum all positive numbers entered by the user; skip any negative numbers.

public class KG66SumOfPositiveUsingContinue {
	public static void main(String[] args) {
	int[] myArray = arrayUtility();
	
	int sum = 0;
	for(int num:myArray) {
		if(num < 0) {
			continue;
		}
		sum += num;
	}
	System.out.println("\nThe sum of positive numbers is " + sum);
	}
	
	public static int[] arrayUtility() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter the array length: ");
		int size = sc.nextInt();
		
		int[] array = new int[size];
		for(int i=0; i< array.length; i++) {
			System.out.print("Please enter the element for " + (i+1) + " position: ");
			array[i] = sc.nextInt();
		}
		return array;
	}

}
