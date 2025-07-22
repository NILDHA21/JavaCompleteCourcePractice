package kG82ArrayStatistics;
import java.util.Arrays;

public class ArrayOperations {

	public static void main(String[] args) {
		int[] arr = {4, 2, 7, 1, 9};
		
		double mean = ArrayOperations.Statistics.mean(arr);
		double median = ArrayOperations.Statistics.median(arr);
		
		System.out.println("Array: " + Arrays.toString(arr));
		System.out.println("Mean: " + mean);
		System.out.println("Median: " + median);
	}
	
	public static class Statistics
	{
		public static double mean(int[] array) {
			if(array == null || array.length == 0) return 0;
			
			double sum = 0;
			for(int num: array) {
				sum += num;
			}
			return sum / array.length;
		}
		
		public static double median(int[] array) {
			if(array == null || array.length == 0) return 0;
			int[] sorted = array.clone();
			Arrays.sort(sorted);
			int n = sorted.length;
			
			if(n % 2 == 1) {
				return sorted[n/2];
			} else {
				return (sorted[n / 2 - 1] + sorted[n / 2]) / 2.0;
			}
		}
	}
	

}
