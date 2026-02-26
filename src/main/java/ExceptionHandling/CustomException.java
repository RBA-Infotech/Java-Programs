package ExceptionHandling;

import java.util.Scanner;

class InvalidAgeException extends Exception{
	public InvalidAgeException(String str) {
		super(str);
	}	
}

public class CustomException {

	public static void main(String[] args) {

		System.out.println("Enter your Age");
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		
		try {
			if(age < 18)
				throw new InvalidAgeException("Age must be above 18 to vote");
			else
				System.out.println("Welcome to vote");
		}catch(InvalidAgeException iae) {
			System.out.println("Exception occurred: Age must be abvoe 18 for voting");
		}
	sc.close();
	}

}
