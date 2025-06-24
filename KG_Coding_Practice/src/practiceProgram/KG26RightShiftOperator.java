package practiceProgram;
import java.util.Scanner;

// 26. Create a program that shows use of right shift operator.

public class KG26RightShiftOperator {
    public static void main(String[] args) {

        // Display program purpose
        System.out.println("Program that shows use of right shift operator.");

        // Create Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Prompt user to enter a number
        System.out.print("Please enter a number: ");
        int num = sc.nextInt(); // Read the input number

        // Perform right shift operation by 2 positions
        int rightShift = num >> 2;

        // Display the result
        System.out.println("Result after right shift by 2 positions: " + rightShift);

        // Close the Scanner to free resources
        sc.close();
    }
}
