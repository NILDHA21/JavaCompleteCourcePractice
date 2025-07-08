package practiceProgram;

import java.util.Scanner;

//48. Create a program to search an element in a 2-D array.  

public class KG48Search2DArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("program to search an element in a 2-D array.\n");
		int[][] numArr = input2DArray();
		System.out.println("Now enter the you want to search: ");
		int num = sc.nextInt();
		boolean isFound = search(numArr, num);
		if(isFound) {
			System.out.println("Your number is found.");
		}else {
			System.out.println("Your number is not found.");
		}
	}
	
	public static boolean search(int[][] numArr, int num) {
		int i = 0;
		while(i < numArr.length) {
			int j = 0;
			while(j < numArr[i].length) {
				if(numArr[i][j] == num) {
					return true;
				}
				j++;
			}
			i++;
		}
		
		return false;
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
				System.out.print("Please enter the row " + (i+1) + " and column " + (j+1) + " :");
				numArray[i][j] = sc.nextInt();
				j++;
			}
			i++;
		}
		return numArray;
	}
}
