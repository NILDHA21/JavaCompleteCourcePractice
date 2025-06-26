package practiceProgram;
import java.util.Scanner;

/*
 * Program #28: Develop a program that prints the multiplication table
 * for a given number.
 */

public class KG28MultiplicationTable {

    public static void main(String[] args) {
        // Create Scanner object to take input from user
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Program for multiplication table.");
        System.out.print("Please enter the number: ");
        
        // Read the number from user input
        int num = sc.nextInt();
        
        // Call method to print multiplication table
        calculator(num);
        
        // Close the Scanner object to prevent memory leak
        sc.close();
    }

    // Method to print multiplication table of given number
    public static void calculator(int num) {
        int i = 1;  // Starting multiplier

        // Loop to print table from 1 to 10
        while(i <= 10) {
            System.out.println(num + " x " + i + " = " + (num * i));
            i++;  // Increment multiplier
        }
    }
}
