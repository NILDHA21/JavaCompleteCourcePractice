package practiceProgram;
import java.util.Scanner;

// 27. Write a program to check if a given number is even or odd using bitwise operators.

public class KG27CheckEvenOddUsingBitwiseOperators {

    public static void main(String[] args) {
        // Create Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Print program info
        System.out.println("Even/Odd number checker using Bitwise Operator");

        // Prompt user to enter a number
        System.out.print("Enter the number: ");
        int num = sc.nextInt(); // Read the input

        /*
         * Bitwise AND with 1 checks the least significant bit (LSB)
         * If LSB is 1 -> number is odd
         * If LSB is 0 -> number is even
         */
        
        /* Logic
         * 5 + 1 -> 0101 + 0001 => 0001 -> 1 => odd
         * 4 + 1 -> 0100 + 0001 => 0000 -> 0 => even
         * */
        
        if ((num & 1) == 1) {
            System.out.println("The number is odd.");
        } else {
            System.out.println("The number is even.");
        }

        // Close the Scanner object
        sc.close();
    }
}


