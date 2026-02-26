package ArrayPrgms;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// Example array with duplicates
		int[] array = { 1, 2, 3, 4, 3, 2, 1, 5, 6 };

		// Removing duplicates
		int[] uniqueArray = removeDuplicates(array);

		// Displaying the result
		System.out.println("Array after removing duplicates: " + Arrays.toString(uniqueArray));
	}

	public static int[] removeDuplicates(int[] array) {
		// Use a HashSet to store unique elements
		Set<Integer> set = new HashSet<>();

		// Add elements to the set (duplicates will be ignored)
		for (int i : array) {
			set.add(i);
		}

		// Convert the set back to an array
		int[] result = new int[set.size()];
		int index = 0;
		for (int value : set) {
			result[index++] = value;
		}

		return result;

	}
}
