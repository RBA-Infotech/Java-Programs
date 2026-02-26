package ArrayPrgms;

import java.util.Scanner;

public class ArrayReverse {

	public static void main(String[] args) {

		
		System.out.println("Enter the size of array");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		
		int[] intArray = new int[size]; // 5

		System.out.println("Enter the numbers"); // 1 2 3 4 5  ,  8 
		
		for(int i = 0; i < size; i++) {
			intArray[i] = sc.nextInt();
		}
		
		System.out.println("The numbers in the array are: ");
		
		for(int i = 0; i < size; i++) {
			System.out.print(intArray[i] + " ");
		}
		
		
		
		
 	}

}
