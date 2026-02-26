package BasicPrograms;

import java.util.Scanner;

public class PrimeNo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("enter the first number");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		boolean flag = true;
		for(int i = 2; i < n; i++) { // 7 , 7 % 2, ... 7 % 6
			if(n % i == 0) {
				flag = false;
				break;
			}
		}
		
		if(flag)
			System.out.println(n + " is prime number");
		else
			System.out.println(n + " is not prime no");
	}

}
