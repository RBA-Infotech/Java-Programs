package ArraysClass;

import java.util.Arrays;

public class ParallelSort {
	public static void main(String[] args) {
		int[] numbers = { 5, 2, 8, 1, 3 };
		Arrays.parallelSort(numbers);
		System.out.println("Parallel sorted array: " + Arrays.toString(numbers));
	}
}
