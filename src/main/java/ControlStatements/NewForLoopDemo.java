package ControlStatements;
import java.util.Scanner;

public class NewForLoopDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("Enter the no of elements");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] empNo = new int[n];
		
		System.out.println("Enter the emp nos");
		
		for(int i=0; i<n; i++)
			empNo[i] = sc.nextInt();
			
		System.out.println("The emp nos are ");
		for(int i=0; i<n; i++)
			System.out.println(empNo[i]);
		
		System.out.println("Printing elements with New method of For loop");
		for( int i : empNo)
			System.out.println(i);
			
		}
		
	}


