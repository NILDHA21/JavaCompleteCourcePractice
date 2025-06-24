package practiceProgram;
import java.util.Scanner;

//Create a program to calculate Perimeter of a rectangle.
//Perimeter of rectangle ABCD = A+B+C+D

public class KG10Perimeter {
	public static void main(String[] args) {
		System.out.println("Enter four sides of the rectangle.");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first side of rectangle: ");
		int side1 = sc.nextInt();
		System.out.print("Enter second side of rectangle: ");
		int side2 = sc.nextInt();
		int Perimeter = 2 * (side1 + side2);
		System.out.printf("Perimeter of rectangle ABCD is %d.", Perimeter);
	}
}
