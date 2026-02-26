package DataStructure;

import java.util.Scanner;

/**************
 * input n
 * input array of integers
 * input search element
 * low=0, high=n-1, mid=low+high/2
 * for low <= high 
 * if(s = a[mid])
 * Element found
 * else if(s < a[mid])
 *  high = mid
 *  else if ( s > a[mid])
 *  low = mid
 *  
 *  2 5 8 14 19 21 27
 */


public class BinarySearch {

	public static void main(String[] args) {

		System.out.println("Enter total no of elements");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[] intArray = new int[n];

		System.out.println("Enter the array elements");
		for(int i=0; i<n; i++) {
			intArray[i] = sc.nextInt();
		}
		
		System.out.println("Enter the elements to be searched for");
		int search = sc.nextInt();
		
		int low=0, high=n-1; 
		
		while (low <= high) {
			int mid = (low + high)/2;
			
			if(search == intArray[mid]) {
				System.out.println("Element found at position: " + (mid +1) );
				break;
			}
			else if(search < intArray[mid])
				high = mid -1;
			else if( search > intArray[mid])
				low = mid + 1;
				
			
		}
	}

}
