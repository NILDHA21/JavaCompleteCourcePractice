package practiceProgram;

import java.util.Scanner;

//49. Create a program to do sum and average of all elements in a 2-D array.  

public class KG49SumAvg2DArrays {
	public static void main(String[] args) {
		System.out.println("Program to do sum and average of all elements in a 2-D array.");
		int[][] numArray = input2DArray();
		
		int sum = sum(numArray);
		System.out.println("Sum of array numbers is " + sum);
		
		int totalElements = numArray.length * numArray[0].length;
		double average = (double) sum/totalElements;
		System.out.println("Average of array numbers is " + average);
	}
	
	public static int sum(int[][] numArray) {
		int sum = 0;
		int i = 0;
		while(i < numArray.length) {
			int j = 0;
			while(j < numArray[i].length) {
				sum = sum + numArray[i][j];
				j++;
			}
			i++;
		}
		return sum;
	}
	
	public static int[][] input2DArray(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter the number of rows: ");
		int rows = sc.nextInt();
		System.out.print("Please enter the number of columns: ");
		int columns = sc.nextInt();
		
		int[][] numArray = new int[rows][columns];
		
		int i = 0;
		while(i < rows) {
			int j = 0;
			while(j < columns) {
				System.out.print("Please enter the row " + (i+1) + " and column " + (j+1) + " : ");
				numArray[i][j] = sc.nextInt();
				j++;
			}
			i++;
		}
		return numArray;
	}
}
