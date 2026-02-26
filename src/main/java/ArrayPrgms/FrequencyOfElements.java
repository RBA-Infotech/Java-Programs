package ArrayPrgms;

import java.util.HashMap;

public class FrequencyOfElements {

	public static void main(String[] args) {
		int[] array = { 1, 2, 2, 3, 4, 4, 4, 5, 6, 6 };

		// Create a HashMap to store the frequency of elements
		HashMap<Integer, Integer> frequencyMap = new HashMap<>();

		// Iterate over the array
		for (int i = 0; i < array.length; i++) {
			int element = array[i];

			// If element is already in the map, increment its count
			if (frequencyMap.containsKey(element)) {
				frequencyMap.put(element, frequencyMap.get(element) + 1);
			} else {
				// Otherwise, add it to the map with a count of 1
				frequencyMap.put(element, 1);
			}
		}
		

		// Print the frequency of each element
		for (int key : frequencyMap.keySet()) {
			System.out.println("Element " + key + " occurs " + frequencyMap.get(key) + " times.");
		}
	}
}
