package practiceProgram;
import java.util.Scanner;

//50. Create a program to find the sum of two diagonal elements.

public class KG50SumOfDiagonal {
	public static void main(String[] args) {
		System.out.println("Program to find the sum of two diagonal elements.");
		int [][] numArray = input2DArray();
		long sum = sumOfDiagonals(numArray);
		System.out.println("Sum of diagonal is " + sum);
	}
	public static long sumOfDiagonals(int[][] numArray) {
		long leftSum = sumOfLeftDiagonal(numArray);
		long rightSum =	sumOfRightDiagonal(numArray);
		long sum = leftSum + rightSum;
		if(numArray.length %2 != 0) {
			int ind = numArray.length / 2;
			sum = sum - numArray[ind][ind];
		}
		return sum;
	}
	public static long sumOfRightDiagonal(int[][] numArray) {
		long sum = 0;
		int i = 0;
		while(i < numArray.length) {
			int col = numArray.length -1 - i;
			sum += numArray[i][col];
			i++;
		}
		return sum;
	}
	public static long sumOfLeftDiagonal(int[][] numArray) {
		
		long sum = 0;
		int i = 0;
		while(i < numArray.length) {
			sum += numArray[i][i];
			i++;
		}
		return sum;
}	
	
	public static int[][] input2DArray(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the length of rows: ");
		int rows = sc.nextInt();
		System.out.print("Enter the length of columns: ");
		int columns = sc.nextInt();
		
		int[][] numArray = new int[rows][columns];
		
		int i = 0;
		while(i < numArray.length) {
			int j = 0;
			while(j < numArray[i].length) {
				System.out.print("Enter the element for row " + (i+1) + " and column " + (j+1) + ": ");
				numArray[i][j] = sc.nextInt();
				j++;
			}
			i++;
		}
		return numArray;
	}

}
