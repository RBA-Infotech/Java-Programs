package BasicPrograms;

import java.util.Scanner;

public class NextvsNextLine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the data");
		String s2 = sc.nextLine();
		System.out.println(s2);
		
		
		System.out.println("Enter the data");
		String s1 = sc.next();
		//sc.nextLine();
		System.out.println(s1);
		
		
		
	}

}
