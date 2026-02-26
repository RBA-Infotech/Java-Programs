package ArraysClass;

import java.util.Arrays;

public class ArraysEqual {

	public static void main(String[] args) {

		int[] arr1 = { 42, 1, 59, 41, 6, 98, 36 };
		int[] arr2 = { 42, 1, 59, 41, 6, 36, 98 };

		System.out.println("Array 1 is equal to Array 2 = " + Arrays.equals(arr1, arr2));

		
	}
}
