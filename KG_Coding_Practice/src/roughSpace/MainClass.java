package roughSpace;
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	System.out.print("Please enter your number: ");
    	int i = sc.nextInt();
    	for(i = 1; i<= 100; i++) {
    		System.out.println(i);
    	}
    	//for(int )
    	
//    	System.out.print("enter your age: ");
//    	int age = sc.nextInt();
//    	while(age < 0 || age > 100) {
//    		System.out.print("enter your age: ");
//        	age = sc.nextInt();	
//    	}
//    	int age;
//    	do {
//    		System.out.print("enter your age: ");
//        	age = sc.nextInt();	
//    	} while(age < 0 || age > 100);
//    	System.out.println("Your age is " + age);
    	sc.close();
    }
}
