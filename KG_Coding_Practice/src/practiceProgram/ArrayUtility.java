package practiceProgram;
import java.util.Scanner;

public class ArrayUtility {
	public static int[] inputArray() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter the number of elements: ");
		int size = sc.nextInt();
		
		int[] numArray = new int[size];
		int i = 0;
		while(i < size) {
			System.out.println("Please enter the element no "+ (i+1)+ " : ");
			numArray[i] = sc.nextInt();
			i++;
		}
		return numArray;
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
