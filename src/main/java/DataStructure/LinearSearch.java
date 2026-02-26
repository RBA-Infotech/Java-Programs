package DataStructure;

import java.util.Scanner;

/*************8
 * 1. Input n
 * 2. Input n number of integers
 * 3. Input the element to be searched for
 * 4. For i 0 to n, search the element in the array one after other,
 *  if found, display "Element found at position", if not, display 
 *  "Element not found"
 * 
 * **************/


public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter the total no of elements");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[] a = new int[n];
		
		System.out.println("Enter the elemennts");
		for(int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
	
		System.out.println("Enter the elements to be searched for");
		int search = sc.nextInt();
		int i;
		for(i=0; i<a.length; i++) {
			if(a[i]==search) {
				System.out.println("Element found at position: " + (i+1));
				break;
			}
		}
		
		if(i==n)
			System.out.println("Element not found");
	}

}
