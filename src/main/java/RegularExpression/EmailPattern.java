package RegularExpression;

import java.util.Scanner;

public class EmailPattern {

	public static void main(String[] args) {

		String emailPattern = "^[a-z][a-z0-9-_+.]+@[a-z]+\\.[a-z]{2,7}$";
		char check;
		
		do {
		System.out.println("Enter the email id");
		Scanner sc = new Scanner(System.in);
		String email = sc.nextLine();
		
		if(email.matches(emailPattern))
			System.out.println("Valid Email");
		else
			System.out.println("Invalid Email");
		
		System.out.println("Do you want to continue (y/n)");
		check = sc.next().charAt(0);
		
	}while(check!='n');

}
}
