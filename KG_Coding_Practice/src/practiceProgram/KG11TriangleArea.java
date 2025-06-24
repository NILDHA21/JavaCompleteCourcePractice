package practiceProgram;
import java.util.Scanner;

// Create a program to calculate the Area of a Triangle.
//Area of triangle = 1/2*B*H

public class KG11TriangleArea {
	public static void main(String[] args) {
		System.out.println("Enter the base and height of a triangle.");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the base of the triangle: ");
		int base = sc.nextInt();
		System.out.print("Enter the height of a triangle: ");
		int height = sc.nextInt();
		System.out.print("The area of triangle is " + ((base * height)/2));
	}
}
