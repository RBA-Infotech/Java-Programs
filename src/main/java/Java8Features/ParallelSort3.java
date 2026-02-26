package Java8Features;

import java.util.Arrays;

public class ParallelSort3 {

	public static void main(String[] args) {
		
		String[] names = {"Alice", "Eve", "Bob", "Charlie"};
		Arrays.parallelSort(names);
		System.out.println(Arrays.toString(names));
	}
}
