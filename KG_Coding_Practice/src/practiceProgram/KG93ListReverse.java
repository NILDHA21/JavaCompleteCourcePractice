package practiceProgram;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//93. Create a program that reverses the elements of a List and prints the reversed list.

public class KG93ListReverse {
	public static void main(String[] args) {
		//We created the array list
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7);
		System.out.println(list);
		reverse(list);
		System.out.println(list);
	}
	public static void reverse(List<Integer> list) {
		Collections.reverse(list);
		for(int i = 0; i< list.size()/2; i++) {
		KG92ListSwapping.swap(list, i, list.size() - 1 - i);
		
//		public class ListSwapping {
//		public static void swap(List<Integer> list, int x, int y) {
//			int swap = list.get(x);
//			list.set(x, list.get(y));
//			list.set(y, swap);
//		}
//	}
		}
	}
}
