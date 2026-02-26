package ArraysClass;

import java.util.Arrays;

public class ArraysMisMatch {

	public static void main(String[] args) {

		int[] arr1 = {3,5,1,23,8,56};
		int[] arr2 = {3,5,1,24,8,56};
		
		System.out.println("Arrays mismatch at index position: " + Arrays.mismatch(arr1, arr2));
	}

}
