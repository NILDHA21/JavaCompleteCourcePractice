package practiceProgram;
import java.util.Scanner;

// Create a program that shows the bitwise complement of a number.

public class KG24BitwiseCompliment {
    public static void main(String[] args) {
        // Create Scanner object for taking input from user
        Scanner sc = new Scanner(System.in);
        
        // Inform user about the program
        System.out.println("Program for Bitwise Compliment.");
        
        // Prompt user to enter a number
        System.out.println("Please enter one number: ");
        int num = sc.nextInt(); // Read integer input from user

        // Calculate bitwise complement using ~ operator
        int com = ~num;

        // Display the result
        System.out.println("Bitwise Compliment number is " + com);

        // Close the Scanner to avoid resource leak
        sc.close();
    }
}

/*
 * Explaination: 
 * 5  = 00000000 00000000 00000000 00000101
 * ~5 = 11111111 11111111 11111111 11111010
 * int com = ~5;  // com = -6
 * */
