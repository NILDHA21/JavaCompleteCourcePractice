package practiceProgram;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*91. Use the Collections class to count the frequency of a particular element in an 
 * ArrayList.*/

public class KG91Frequency {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 5, 7, 9, 2, 4);
		System.out.println(Collections.frequency(list, 1));
		System.out.println(Collections.frequency(list, 2));
		System.out.println(Collections.frequency(list, 6));
	}
}
