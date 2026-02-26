package BasicPrograms;

import java.util.Scanner;

public class ReadChar {

	public static void main(String[] args) {

		System.out.println("Enter the character");
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);
		System.out.println("Entered char is: " + ch);
	}

}
