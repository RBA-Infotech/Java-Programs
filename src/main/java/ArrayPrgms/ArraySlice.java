package ArrayPrgms;

import java.util.Scanner;

public class ArraySlice {

	public static void main(String[] args) {

		//int[] intArray = new int[10];
		
		System.out.println("Enter the size of array");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		
		int[] intArray = new int[size]; // 5, start_ind and ending_ind, 1, 3, -> 2,3,4,

		System.out.println("Enter the numbers"); // 1 2 3 4 5  , 
		
		for(int i = 0; i < size; i++) {
			intArray[i] = sc.nextInt();
		}
		
		System.out.println("Enter starting index");
		int startIndex = sc.nextInt(); //1
		
		System.out.println("Enter Ending index");
		int endIndex = sc.nextInt(); //3


		for( int i = startIndex; i<=endIndex; i++) {
			System.out.print(intArray[i] + " ");
		}
		
 	}

}
