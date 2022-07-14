package BasicPrograms;

import java.util.Scanner;

public class ReadInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("Enter first no");
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		
		
		System.out.println("Enter second no");
		int num2 = sc.nextInt();
	
		int sum = num1 + num2;
		
		System.out.println("The addition of " + num1 + " and " + num2 + " is = " + sum);
	}

}
