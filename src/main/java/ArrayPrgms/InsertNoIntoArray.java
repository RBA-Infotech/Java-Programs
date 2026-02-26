package ArrayPrgms;

import java.util.Scanner;

public class InsertNoIntoArray {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Input: Original array size and elements
		System.out.print("Enter the size of the array: ");
		int size = scanner.nextInt();

		int[] array = new int[size];
		System.out.println("Enter " + size + " elements:");
		for (int i = 0; i < size; i++) {
			array[i] = scanner.nextInt();
		}

		// Input: Element to insert and position
		System.out.print("Enter the number to insert: ");
		int number = scanner.nextInt();

		System.out.print("Enter the position (0 to " + size + "): ");
		int position = scanner.nextInt();

		if (position < 0 || position > size) {
			System.out.println("Invalid position! Please try again.");
			return;
		}

		// Create a new array with one additional slot
		int[] newArray = new int[size + 1];

		// Copy elements before the position
		for (int i = 0; i < position; i++) {
			newArray[i] = array[i];
		}

		// Insert the new number
		newArray[position] = number;

		// Copy the remaining elements
		for (int i = position; i < size; i++) {
			newArray[i + 1] = array[i];
		}

		// Output: New array
		System.out.println("Array after insertion:");
		for (int i = 0; i < newArray.length; i++) {
			System.out.print(newArray[i] + " ");
		}
	}
}
