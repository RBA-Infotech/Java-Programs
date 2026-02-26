package ExceptionHandling;

import java.util.Scanner;

class InvalidBookException extends Exception {
	public InvalidBookException(String str) {
		super(str);
	}
}

public class UserDefinedException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter the book title");
		Scanner sc = new Scanner(System.in);
		String bookName = sc.nextLine();
  // java34
		if (bookName.matches("^[a-zA-Z]*$") && (bookName != null) && (!bookName.equals(""))) {
			System.out.println("Correct Book Title");
		} else {
			try {
				throw new InvalidBookException("Invalid Book Exception");
			} catch (InvalidBookException ibe) {

				System.out.println(ibe);  //object.toString();
			}
		}
	}
}
