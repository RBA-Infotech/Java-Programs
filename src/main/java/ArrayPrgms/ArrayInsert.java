package ArrayPrgms;

import java.util.Scanner;

public class ArrayInsert {

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
		
		System.out.println("Enter the index position to insert element");  // 2
		int indexPos = sc.nextInt(); 
		
		System.out.println("Enter the number to be inserted"); // 8
		int newElement = sc.nextInt();
		
		int[] newArray = new int[size+1];
		
		// copy the element from 0 to before indexPos
		
		for(int i=0; i<indexPos; i++) {
			newArray[i] = intArray[i];
		}
		
		newArray[indexPos] = newElement;
		
		for(int i = indexPos+1; i< newArray.length; i++) {
			newArray[i] = intArray[i-1];
		}
		
		
		System.out.println("The new array after inserting the element is: "); 
		
		for(int i = 0; i < newArray.length; i++) {
			System.out.print(newArray[i] + " ");
		}
 	}

}
