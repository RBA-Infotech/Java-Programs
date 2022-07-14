package ArrayPrgms;

import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter total no of numbers");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		System.out.println("Enter the numbers");
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("The numbers you entered are : ");
	
		for(int i =0; i < n; i++) {
			System.out.println();
		}
	}

}
