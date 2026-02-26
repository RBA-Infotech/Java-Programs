package StringPrgms;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class FrequencyOfChar1 {

	public static void countFrequencyUsingHashMap(String str) {
		Map<Character, Integer> charFrequencyMap = new TreeMap<>();

		for (char c : str.toCharArray()) {
			// Use getOrDefault to handle cases where the character is not yet in the map
			charFrequencyMap.put(c, charFrequencyMap.getOrDefault(c, 0) + 1);
		}

			
		// Print the frequencies
		for (Map.Entry<Character, Integer> entry : charFrequencyMap.entrySet()) {
			System.out.println("Character '" + entry.getKey() + "': " + entry.getValue());
		}
	}

	public static void main(String[] args) {
		System.out.println("Enter the String"); // i am the trainer of SDET good people team
		Scanner sc = new Scanner(System.in);
		String inputString = sc.nextLine();
		countFrequencyUsingHashMap(inputString);
	}
}



