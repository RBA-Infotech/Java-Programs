package ArrayPrgms;

import java.util.Scanner;

public class SecondLargestNo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Input: Size of the array
		System.out.print("Enter the number of elements in the array: ");
		int n = scanner.nextInt();

		// Check if the array has at least two elements
		if (n < 2) {
			System.out.println("Array must have at least two elements.");
			return;
		}

		// Input: Array elements
		int[] array = new int[n];
		System.out.println("Enter the elements of the array:");
		for (int i = 0; i < n; i++) {
			array[i] = scanner.nextInt();
		}

		// Initialize the largest and second largest to minimum possible values
		int largest = Integer.MIN_VALUE;
		System.out.println("*************  largest No: " + largest);
		int secondLargest = Integer.MIN_VALUE;
		System.out.println("************* Second largest No: " + secondLargest);
		

		// Find the largest and second largest elements in the array
		for (int i = 0; i < n; i++) {
			if (array[i] > largest) {
				secondLargest = largest;
				largest = array[i];
			} else if (array[i] > secondLargest && array[i] != largest) {
				secondLargest = array[i];
			}
		}

		// Check if a second largest element exists
		if (secondLargest == Integer.MIN_VALUE) {
			System.out.println("There is no second largest element in the array.");
		} else {
			System.out.println("The second largest element in the array is: " + secondLargest);
		}
	}

}
