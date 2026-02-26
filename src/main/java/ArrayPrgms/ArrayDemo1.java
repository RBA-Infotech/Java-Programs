package ArrayPrgms;

import java.util.Scanner;

public class ArrayDemo1 {

	public static void main(String[] args) {

		/*
		 * 1. input n 
		 * 2. read n number of integers 
		 * 3. print n number of integers
		 */

		System.out.println("Enter value for n");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // 5

		int[] intArray = new int[n];
		
		System.out.println("Enter Array elements");
		for (int i=0; i < n; i++) {
			intArray[i] = sc.nextInt();
		}
		
		System.out.println("The entered array elements are: ");
		
		for(int i=0; i<n; i++) {
			System.out.println(intArray[i]);
		}
	}

}
