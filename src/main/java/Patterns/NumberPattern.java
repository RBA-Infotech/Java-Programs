package Patterns;

import java.util.Scanner;

public class NumberPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 *       0      star = 5, 3, 1
		 *     0 1 2
		 *   0 1 2 3 4
		 * 
		 */
		
		System.out.println("Enter the no of rows of stars");
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {   // 3<=3 
			
			int space = (n - i) * 2 ;  //
			
			for(int k=1; k<=space; k++)
				System.out.print(" ");
			
			for(int j = 0; j <= i*2; j++) {  // 1<=3
		
			System.out.print(" " + j);
			}
			System.out.println();
		}
	}
		
}

