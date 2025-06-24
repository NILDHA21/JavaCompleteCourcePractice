package practiceProgram;
import java.util.Scanner;

// 25. Create a program that shows use of left shift operator.

public class KG25LeftShiftOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Display purpose of the program
        System.out.println("Program that shows use of left shift operator.");

        // Take user input
        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        // Left shift the number by 2 positions (num * 2^2 = num * 4)
        int leftShift = num << 2;

        // Display result
        System.out.println("Result after left shift by 3 positions: " + leftShift);

        // Close the scanner
        sc.close();
    }
}