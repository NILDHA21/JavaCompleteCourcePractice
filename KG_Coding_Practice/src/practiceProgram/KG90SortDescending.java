package practiceProgram;
import java.util.*;

// 90. Sort a list of String objects in descending order using a custom Comparator

public class KG90SortDescending {
	public static void main(String[] args) {
		// Create a list of strings
		List<String> names = new ArrayList<>();
		names.add("Nilesh");
		names.add("Amit");
		names.add("Sneha");
		names.add("Rahul");

		System.out.println("Original List: " + names);

		// Sort using a custom Comparator for descending order
		Collections.sort(names, new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				return s2.compareTo(s1); // Reverse order
			}
		});

		System.out.println("Sorted in Descending Order: " + names);
	}
}