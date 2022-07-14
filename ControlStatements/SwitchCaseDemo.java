package ControlStatements;

import java.util.Scanner;

public class SwitchCaseDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a, b, c;
		a=10;
		b=6;
		
		System.out.println("1-> Division");
		System.out.println("2-> Multiplicaiton");
		
		System.out.println("please Enter the options");
		Scanner sc = new Scanner(System.in);
		int option = sc.nextInt();
		//sc.next().charAt(0);

		switch(option) {
		case 1:
			c=a/b;
			System.out.println("the output is = " + c);
			break;
		case 2:
			c=a*b;
			System.out.println("the output is = " + c);
			break;
		default:
			System.out.println("Invalid input");
		}
			
	}

}
