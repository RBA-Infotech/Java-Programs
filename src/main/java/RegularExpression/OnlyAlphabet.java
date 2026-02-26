package RegularExpression;

import java.util.Scanner;

/*
 * 
 * 		Count occurrence of a character
		
		Raji wants to count the no of occurrences of the given character.Write a program to accept a word from the user. Get a character from the user and find the no of occurrences . 
		
		Check whether the given character and word is valid
		
		The word is valid if it contains only alphabets and no space or any special characters or numbers.
		
		The character is valid if it is an alphabet alone.
		
		Sample Input 1:
		Enter a word:
		programming
		Enter the character:
		m
		
		Sample Output 1:
		
		No of 'm' present in the given word is 2.
		
		Sample Input 2:
		Enter a word:
		programming
		Enter the character:
		s
		
		Sample Output 2:
		
		The given character 's' not present in the given word.
		
		Sample Input 3:
		Enter a word:
		56
		Sample Output 3:
		
		Not a valid string
		
		Sample Input 4:
		Enter a word:
		Hello
		Enter the character:
		6
		
		Sample Output 4:
		
		Given character is not an alphabet
 * 
 * 
 */


public class OnlyAlphabet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String msg = "^[A-Za-z]$+";
		
		System.out.println("Enter the word");
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		
		if(word.matches(msg))
		{
			System.out.println("Not valid String");
		}else {
			System.out.println("match");
		}
		
	}

}
