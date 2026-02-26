package ArrayPrgms;

import java.util.Scanner;

public class ArrayAccess{

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
		
		System.out.println("The reverse of numbers in the array are: "); 
		
		for(int i = size -1; i >= 0; i--) {
			System.out.print(intArray[i] + " ");
		}
		
		
 	}

}
