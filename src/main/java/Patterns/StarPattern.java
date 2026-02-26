package Patterns;

import java.util.Scanner;

public class StarPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 *       *      star = 5, 3, 1
		 *     * * *
		 *   * * * * *
		 * 
		 */
		
		System.out.println("Enter the no of rows of stars");
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {   // 3<=3 
			
			int space = (n - i) * 2 ;  //
			
			for(int k=1; k<=space; k++)
				System.out.print(" ");
			
			for(int j = 1; j <= i*2-1; j++) {  // 1<=3
		
			System.out.print(" *");
			}
			System.out.println();
		}
	}

}
