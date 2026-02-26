package ArraysClass;

import java.util.Arrays;

public class ArraysCopy {

	public static void main(String[] args) {

		int[] srcArr = { 1, 3, 2, 6, 8, 7 };

		// coping entire array
		int[] copyArr = Arrays.copyOf(srcArr, srcArr.length);

		for (int i : copyArr) {
			System.out.print(i + "\t");
		}

		System.out.println("\nCopying part of Array:");
		copyArr = Arrays.copyOf(srcArr, 4);

		for (int i : copyArr) {
			System.out.print(i + "\t");
		}
		
		System.out.println("\nPart of Array using CopyRange() method");
		copyArr = Arrays.copyOfRange(srcArr, 2, 5);
		for (int i : copyArr) {
			System.out.print(i + " ");
		}
	}

}
