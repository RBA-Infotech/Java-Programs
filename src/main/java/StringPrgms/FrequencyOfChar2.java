package StringPrgms;

import java.util.Scanner;

public class FrequencyOfChar2 {

	public static void countFrequencyUsingArray(String str) {
		int[] charFrequencyArray = new int[256]; // For Extended ASCII

		for (char c : str.toCharArray()) {
			charFrequencyArray[c]++;
		}

		for (int i = 0; i < charFrequencyArray.length; i++) {
			if (charFrequencyArray[i] > 0) {
				System.out.println("Character '" + (char) i + "': " + charFrequencyArray[i]);
			}
		}
	}

	public static void main(String[] args) {
		System.out.println("Enter the String");
		String inputString = new Scanner(System.in).nextLine();
		countFrequencyUsingArray(inputString);
	}
}
