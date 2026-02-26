package CodeChallenge;

import java.util.Scanner;

class PerConcatStr {

	Scanner sc = new Scanner(System.in);
	String[] words;
	
	public void getInput() {

		System.out.println("Enter the String");
		sc.nextLine();

		System.out.println("Enter the total no of Strings");
		int n = sc.nextInt();

		words = new String[n];
		int strLen = 0;

		System.out.println("Enter the list of string");
		// sc.nextLine();
		for (int i = 0; i < n; i++) {
			words[i] = sc.next();
			// for first string we are taking string lenth
			if (i == 0) {
				strLen = words[i].length(); // 3
				System.out.println("***** inside for loop  = " + strLen);
			}
			if (strLen == words[i].length())
				continue;
			else {
				System.out.println(
						"The string length is not = " + strLen + " , please enter the string with proper length ");
				words[i] = sc.next();

				}
			}
		}
	
	
	public void output() {
		
		System.out.println(words[0] + words[1] + words[2]);
		
	}
	
	//storing permutation of concatenation of world
	
	public void perContctString() {
		
	}
	
	// to get the index position if words match in the String s
	 public void getIndexPosition(){
	
	
	}
}

public class PermutationConcatenationStrings {

	public static void main(String[] args) {

		PerConcatStr p = new PerConcatStr();

		p.getInput();
		p.perContctString();
		p.getIndexPosition();
		p.output();
		
	}

}
