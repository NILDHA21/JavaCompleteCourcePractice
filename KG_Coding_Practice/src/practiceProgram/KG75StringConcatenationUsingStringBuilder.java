package practiceProgram;

// 75. Take an array of words and concatenate them into a single string using StringBuilder.

public class KG75StringConcatenationUsingStringBuilder {
    public static void main(String[] args) {

        // Display a welcome message
        System.out.println("Welcome to the String Concatenation Program using StringBuilder.\n");

        // Step 1: Define an array of words
        String[] arr = new String[] {"This", "is", "the", "practice", "program", "for", "StringBuilder."};

        // Step 2: Create a StringBuilder object for efficient string concatenation
        StringBuilder sb = new StringBuilder();

        // Step 3: Loop through each word in the array
        for (String str : arr) {
            // Append each word followed by a space
            sb.append(str).append(" ");
        }

        // Step 4: Print the final concatenated string
        System.out.println(sb.toString()); // toString() is optional here as println can handle StringBuilder
    }
}
