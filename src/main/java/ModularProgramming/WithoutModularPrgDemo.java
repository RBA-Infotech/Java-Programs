package ModularProgramming;

import java.util.Scanner;

public class WithoutModularPrgDemo {

	public static void main(String[] args) {

		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		// finding the factorial
		int fact = 1;

		for (int i = 1; i <= n; i++) {
			fact = fact * i;
		}

		System.out.println("Factorial of " + n + " is: " + fact);

		// summation of n natural numbers

		int sum = 1;
		for (int i = 1; i <= n; i++) {
			sum = sum + i;
		}
		System.out.println("Summation of " + n + " is: " + sum);

		// if n is odd or even

		if (n % 2 == 0)
			System.out.println(n + " is Even number");
		else
			System.out.println(n + " is Odd number");

		

	}

}
