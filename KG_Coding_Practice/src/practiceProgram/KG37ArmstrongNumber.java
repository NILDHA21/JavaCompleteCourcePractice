package practiceProgram;
import java.util.Scanner;

// 37. Create a program to check if a number is an Armstrong number.

public class KG37ArmstrongNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Display program info
		System.out.println("Program to check if a number is an Armstrong number.");
		System.out.print("Enter the number: ");
		int num = sc.nextInt();  // Take input from user
		boolean isArmstrong = isArmstrong(num);
		if(isArmstrong) {
			System.out.println("Your number is Armstrong.");
		}else {
			System.out.println("Your number is not Armstorng.");
		}
		sc.close();
	}
	
	public static boolean isArmstrong(int num) {
		int noOfDigits = noOfDigits(num);
		int numCopy = num;
		int finalNumber = 0;
		while(num >0) {
			int lastDigit = num % 10;
			num /=10;
			finalNumber += pow(lastDigit, noOfDigits);
		}
		return finalNumber == numCopy;
	}
	
	public static int pow(int num1, int num2) {
		int result = 1;
		int i = 0;
		while(i<num2) {
			result *=num1;
			i++;
		}
		return result;
	}
	
	public static int noOfDigits(int num) {
		int digits = 0;
		while (num> 0) {
			digits++;
			num /=10;
		}
		
		return digits;
	}
}
/*
public class KG37ArmstrongNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Display program info
		System.out.println("Program to check if a number is an Armstrong number.");
		System.out.print("Enter the number: ");
		int num = sc.nextInt();  // Take input from user

		// Call method and display result
		if (isArm(num)) {
			System.out.println("Number is an Armstrong number");
		} else {
			System.out.println("Number is NOT an Armstrong number");
		}

		sc.close();  // Close scanner
	}

	// Method to check whether a number is an Armstrong number
	public static boolean isArm(int num) {
		// Negative numbers are not considered Armstrong
		if (num < 0) {
			System.out.println("Please enter positive number.");
			return false;
		}

		int digits = 0;
		int original = num;

		// Count number of digits
		while (original > 0) {
			original = original / 10;
			digits++;
		}

		double arm = 0;
		original = num;  // Reset original value for calculation

		// Calculate sum of digits raised to the power of total digits
		while (original > 0) {
			int digit = original % 10;  // Get last digit
			arm = arm + Math.pow(digit, digits);  // Add power to total
			original = original / 10;  // Remove last digit
		}

		// Check if the calculated sum equals the original number
		return (int) arm == num;
	}
}
*/