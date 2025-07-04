package practiceProgram;
import java.util.Scanner;

// 34. Create a program to check whether a given number is prime.

public class KG34PrimeNumber {

    public static void main(String[] args) {
        // Create Scanner object to take input from user
        Scanner sc = new Scanner(System.in);
        System.out.println("Program for Prime check.");
        
        // Prompt user to enter a number
        System.out.print("Please enter the number: ");
        int num = sc.nextInt();  // Read the number
        
        // Call the isPrime method to check if number is prime
        boolean isPrime = isPrime(num);
        
        // Display result based on return value
        if(isPrime) {
            System.out.println("Number is Prime.");
        } else {
            System.out.println("Number is not prime.");
        }

        sc.close(); // Close the Scanner to avoid resource leak
    }

    // Method to check if a number is prime
    public static boolean isPrime(int num) {
        // Prime numbers are greater than 1
        if (num <= 1) {
            return false;
        }

        int i = 2;  // Start checking from 2
        // Loop until i is less than num
        while(i < num) {
            // If num is divisible by i, then it's not prime
            if (num % i == 0) {
                return false;
            }
            i++;  // Move to next number
        }

        // If no divisor is found, number is prime
        return true;
    }
}