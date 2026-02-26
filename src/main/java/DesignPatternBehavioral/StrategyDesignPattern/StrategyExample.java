package DesignPatternBehavioral.StrategyDesignPattern;

import java.util.Arrays;

//Strategy Interface
interface SortingStrategy {
	void sort(int[] array);
}

//Concrete Strategies
class BubbleSort implements SortingStrategy {
	@Override
	public void sort(int[] array) {
		System.out.println("Sorting using Bubble Sort");
		int n = array.length;
		for (int i = 0; i < n - 1; i++)
			for (int j = 0; j < n - i - 1; j++)
				if (array[j] > array[j + 1]) {
					// swap arr[j] and arr[j+1]
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
		for (int i : array) {
			System.out.print(i + " ");
		}
	}
}

class QuickSort implements SortingStrategy {
	@Override
	public void sort(int[] array) {
		System.out.println("\nSorting using Quick Sort");
		Arrays.sort(array); // Using Java's built-in quicksort for simplicity
	
		for (int i : array) {
			System.out.print(i + " ");
		}
	}
}

//Context
class Sorter {
	private SortingStrategy strategy;

	public Sorter(SortingStrategy strategy) {
		this.strategy = strategy;
	}

	public void setStrategy(SortingStrategy strategy) {
		this.strategy = strategy;
	}

	public void performSort(int[] array) {
		strategy.sort(array);
	}
}

//Client Code
public class StrategyExample {
	public static void main(String[] args) {
		int[] data = { 5, 2, 8, 1, 9, 4 };

		// Using Bubble Sort
		Sorter sorter = new Sorter(new BubbleSort());
		sorter.performSort(Arrays.copyOf(data, data.length)); // Create a copy to avoid modifying original

		// Using Quick Sort
		sorter.setStrategy(new QuickSort());
		sorter.performSort(Arrays.copyOf(data, data.length)); // Create a copy to avoid modifying original
	}
}