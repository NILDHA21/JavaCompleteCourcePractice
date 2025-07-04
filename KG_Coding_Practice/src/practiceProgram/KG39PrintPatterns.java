package practiceProgram;
import java.util.Scanner;

/*Create a program that prints patterns.
Right Half Pyramid
Reverse Right Half Pyramid
Left Half Pyramid*/

public class KG39PrintPatterns {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Program to print patterns.");
		System.out.print("Please enter the row number: ");
		int row = sc.nextInt();
		System.out.print("Please enter the column number: ");
		int column = sc.nextInt();
		RightHalfPyramid(row,column);
		System.out.println();
		LeftHalfPyramid(row,column);
		System.out.println();
		ReverseRightHalfPyramid(row,column);
		System.out.println();
		ReverseLeftHalfPyramid(row,column);
		sc.close();
	}
	public static void RightHalfPyramid(int row, int column) {
		System.out.println("Right Half Pyramid");
		for(int i = 1; i <= row; i++) {
			for(int j = 1; j <= i && j <= column; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	public static void LeftHalfPyramid(int row, int column) {
		System.out.println("Left Half Pyramid");
		for(int i = 1; i <= row; i++) {
			for(int j = i; j < row && j < column; j++) {
				System.out.print("  ");
			}
			for(int k = 1; k <= i && k <= column; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}            
	}
	public static void ReverseRightHalfPyramid(int row, int column) {
		System.out.println("Reverse Right Half Pyramid");
		for(int i = row; i >= 1; i--) {
			for(int j = 1; j <= i && j <= column; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	public static void ReverseLeftHalfPyramid(int row, int column) {
		System.out.println("Reverse Left Half Pyramid");
		for(int i = row; i >= 1; i--) {
			for(int j = i; j < row && j < column; j++) {
				System.out.print("  ");
			}
			for(int k = 1; k <= i && k <= column; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}            
	}
}
