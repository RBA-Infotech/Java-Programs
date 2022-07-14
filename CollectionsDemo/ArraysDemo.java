package CollectionsDemo;

import java.util.Arrays;

public class ArraysDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = new int[] { 43, 12, 87, 27, 90, 61 };

		System.out.println("\nArray Elements before sorting");
		for (int a : array)
			System.out.println(a);

		Arrays.sort(array);

		System.out.println("\nArray Elements after sorting");

		for (int a : array)
			System.out.println(a);

	}

}
