package roughSpace;
import java.util.Scanner;

public class Practice {
	public static void main(String[] args) {
		//create main method Ctrl + spacebar + enter
		
		System.out.print("Hello" + " friend\n"); 
		// print statement = Ctrl + spacebar
		// concatination of two strings +
		test(); // method call
		
		int i = 1;
		float l = 2.0f;
		
		Scanner sc = new Scanner(System.in); // we created scanner object to import values from user
		//Ctrl + Shift + O => to remove the red line or import package
		
		System.out.print("Please enter integer value: ");
		int j = sc.nextInt(); //takes value form user in integer format
		System.out.print("Please enter float value: ");
		float k = sc.nextFloat();//takes value form user in float format
		
		int sum = sum(i, j); //called method
		//System.out.print("Sum is: " + sum);
	}
	
	public static void test() { // As there is void used so it is non retun type method
		System.out.println("Hello" + " friend");
	}
	
	public static int sum(int a, int b) {// retun type
		int sum = a + b;
		return sum;
	}
}
