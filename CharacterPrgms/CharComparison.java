package CharacterPrgms;
import java.util.Scanner;

public class CharComparison {

	public static void main(String[] args) {
		// TOa - DO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the character between a - z");
		char alphabet = sc.next().charAt(0);
		
		sc.nextInt()   // read Integer
		sc.nextLine()  // reads String
		sc.next() 
		
		if (alphabet >= 'a' && alphabet <= 'z')
			System.out.println("it is in alphabet");
		else
			System.out.println("it is not valid alphabet");
	}

}
