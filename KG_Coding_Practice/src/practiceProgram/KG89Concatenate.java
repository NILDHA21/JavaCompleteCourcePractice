package practiceProgram;

// 89. Write a method concatenate Strings that takes variable arguments of String type and concatenates them into a single string.

public class KG89Concatenate {
	public static void main(String[] args) {
		// Calling the concatenate method with two string arguments
		System.out.println(concatenate("Nilesh", "Dhage"));
	}
	
	// Method that takes variable number of string arguments using varargs
	public static String concatenate(String... strs) {
		// StringBuilder is used for efficient string concatenation
		StringBuilder sb = new StringBuilder();
		
		// Loop through each string passed in varargs
		for (String str : strs) {
			sb.append(str).append(" "); // Append each string followed by a space
		}
		
		// Convert StringBuilder to string and return the final result with trim spaces from end
		return sb.toString().trim();
	}
}
