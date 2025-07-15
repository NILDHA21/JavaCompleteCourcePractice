package practiceProgram;
import java.util.Scanner;

//67. Create a program using continue to print only even numbers using continue for odd numbers.

public class KG67EvenWithContinue {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Program using continue to print only even numbers using continue for odd numbers.");
	System.out.print("Please enter the number: ");
	int num = sc.nextInt();
	
	for(int i = 0; i <= num; i++) {
		if(i % 2 == 1) {
			continue;
		}
		System.out.println(i);
	}
	sc.close();
}
}
