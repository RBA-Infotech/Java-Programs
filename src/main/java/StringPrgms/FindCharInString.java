package StringPrgms;
import java.util.Scanner;

/*
 *  case 1:
 *  input 1
 *  Enter the string: selenium
 *  Enter the char to find: l
 *  output:
 *  the char l is found at 3 position.
 *  
 *  case 2:
 *  Enter the string: selenium
 *  Enter the char to find: o
 *  output:
 *  the char o is not found
 * 
 */


public class FindCharInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean check = false;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String s1 = sc.nextLine();
		
	int i = 10;
		
		System.out.println("Ente the char to find out");
		char findChar = sc.next().charAt(0);
	
		for(int i=0; i< s1.length(); i++)  //selenium  l , o
		{
			if(Character.compare(s1.charAt(i), findChar)==0) {
				System.out.println("The char " + findChar+" is found at position "+ (i+1));
				check = true;
			}
				
		}
		
		if(check == false)
			System.out.println("the Char is not found");
	}

}
