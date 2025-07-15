package practiceProgram;
import java.util.Locale;

//71. Concatenate and Convert: Take two strings, concatenate them, and convert the result to uppercase.

public class KG71ConcatenateStrings {
	public static void main(String[] args) {
		String firstName = "Nilesh";
		String lastName = "Dhage";
//		String fullName = firstName + " " + lastName;
		String fullName = firstName.concat(" ").concat(lastName);
		System.out.println(fullName.toUpperCase());
		System.out.println(fullName.toUpperCase(Locale.FRANCE));
	}
}
