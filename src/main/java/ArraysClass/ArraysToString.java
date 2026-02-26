package ArraysClass;

import java.util.Arrays;

public class ArraysToString {

	public static void main(String[] args) {

		int[] arr = {3,5,1,23,8,56};
		
		System.out.println(Arrays.toString(arr));
		
		String s1 = Arrays.toString(arr);
		
		for (int i=0; i<s1.length(); i++) {
			System.out.println(i + " -> " + s1.charAt(i));
		}
	}

}
