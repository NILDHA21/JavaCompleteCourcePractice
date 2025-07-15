package practiceProgram;
import java.util.Scanner;

/*68. 68. Create a program using recursion to display the Fibonacci series up to a certain number.*/

public class KG68FibonacciSeriesRecursion {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to printing Fibonacci series.\n");
		System.out.print("Enter the number of elements to be printed: ");
		int count = sc.nextInt();
		for(int i = 1; i <= count; i++) {
			System.out.print(fibonacci(i) + " ");
		}
		sc.close();
	}
	
	public static int fibonacci(int position) {
		if (position == 1) {
			return 0;
		}
		if (position == 2) {
			return 1;
		}
		return fibonacci(position - 1) + fibonacci(position - 2);
	}
}
