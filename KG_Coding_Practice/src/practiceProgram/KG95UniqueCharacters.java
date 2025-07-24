package practiceProgram;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/*95. Write a program that takes a string and returns the number of unique 
 * characters using a Set.*/

public class KG95UniqueCharacters {
	public static void main(String[] args) {
		Set<Character> unique = new HashSet<>();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your string: ");
		String userStr = sc.next();
		
		for(char ch : userStr.toCharArray()) {
			unique.add(ch);
		}
		System.out.printf("Your string has %d unique chars.", unique.size());
		sc.close();
	}
}
