package practiceProgram;
import java.util.Scanner;

//64. Create a program using for-each to find the occurrences of a specific element in an array.

public class KG64ForEachOccourrences {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Program using for-each to find the occurrences of a specific element in an array.");
		int[] myArray = inputArray();
		System.out.print("Enter the number for which you want occourrences: ");
		int num = sc.nextInt();
		sc.close();
		int occourrences = occourrences(myArray, num);
		System.out.println("The element found in the array "+occourrences+ " times.");
	}
	
	public static int[] inputArray() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter the size of array: ");
		int size = sc.nextInt();
		
		int[] array = new int[size];
		int i = 0;
		while(i < array.length) {
			System.out.print("Enter the array element at " + (i+1)+ "th positin: ");
			array[i] = sc.nextInt();
			i++;
		}
		return array;
	}
	
//	public static int occourrences(int[] myArray, int num) {
//		int occ = 0;
//		int i = 0;
//		while(i< myArray.length) {
//			if(myArray[i] == num) {
//				occ++;
//			}
//		}
//		return occ;
//	}
	
	public static int occourrences(int[] myArray, int num) {
		int occ = 0;
		for(int i : myArray) {
			if(i == num) {
				occ++;
			}
		} 
		return occ;
	}
}
