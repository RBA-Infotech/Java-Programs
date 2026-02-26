package BasicPrograms;

import java.util.Scanner;

public class PrimeNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/***************8
		 * n1=100 - n2=200
		 *******************/
		
		System.out.println("enter the first number");
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();

		System.out.println("Enter the secone number");
		int n2 = sc.nextInt();

		System.out.println("The prime nos from " + n1 +" to " + n2 + " are ");
		for (int j = n1; j <= n2; j++) {
			int count = 0;
			for (int i = 1; i <= j; i++) { // n = 7

				if (j % i == 0) {
					count++; //
				}
			}

			if (count == 2) {
				System.out.println(j);
			}
		}
	}
}
