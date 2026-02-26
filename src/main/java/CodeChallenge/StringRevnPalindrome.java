package CodeChallenge;

import java.util.Scanner;

class Output {

	// reverse of string
	String revString(String str) {

		StringBuilder sb = new StringBuilder(str);
		sb.reverse();
		return sb.toString();
	}

	// return palindrom of string

	boolean palindrom(String str) {  //madam

		String revStr = revString(str);

		if (str.equals(revStr))
			return true;
		else
			return false;

	}
}

public class StringRevnPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// int i = 10;

		System.out.println("Enter the no of String");

		Scanner sc = new Scanner(System.in);
		int noOfString = sc.nextInt();
		sc.nextLine();

		String[] allStrings = new String[noOfString];

		for (int i = 0; i < noOfString; i++) {
			allStrings[i] = sc.nextLine();
		}

		System.out.println("The output is ");
		for (int i = 0; i < noOfString; i++) {

			String[] wordsInStr = new String[10];

			wordsInStr = allStrings[i].split(" ");  // i love my country
			// System.out.println("No of Strings are = " + wordsInStr.length);
			Output o1 = new Output();

			for (int j = 0; j < wordsInStr.length; j++) {
				System.out.print(o1.revString(wordsInStr[j] + " "));
			}
			
			System.out.println();
			for (int j = 0; j < wordsInStr.length; j++) {
				if(!o1.palindrom(wordsInStr[j]))
					System.out.print(wordsInStr[j] + " ");
			}

			System.out.println();
		}
	}

}
