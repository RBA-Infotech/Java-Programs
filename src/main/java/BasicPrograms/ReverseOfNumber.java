package BasicPrograms;

import java.util.Scanner;

public class ReverseOfNumber {

	public static void main(String[] args) {

		//n=454 -454  -> 654 % 10 --> 6
		
		System.out.println("Enthe the number");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int rem=0, revNo=0;
		int n1 = n;
		
		while (n>0) {
			rem=n%10;   // 4%10 -> 4
			revNo = revNo * 10 + rem; //654
			n=n/10;    // 0
		}
	
		System.out.println("The reverse no of " + n1 +" is = " + revNo);
		
		if(n1==revNo) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not Palindrome");
		}
		// the reverse no of 456 is 654
	
		sc.close();
	}

}
