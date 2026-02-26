package CodeChallenge;

import java.util.Scanner;

public class NumbiyarNumGeneration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 1. accept the ph no in 10 digit 2. read first digit and check if it is odd or
		 * even 3. keep adding subsequent digit until the state of sum is opposite to
		 * state of first digit 4. if opposite, sum this digit until the first pass, 5.
		 * then start the second pass repeat the step 2 to 4 6. once it is done until
		 * last digit, contatenate of sum of all the pass result
		 * 
		 * input = 9094018902 fist pass = 9+0+9 = 18 second pass = 4+0+1 = 5 third pass
		 * = 8+9 = 17 forth pass = 0+2=2 output = 185172
		 */

		System.out.println("Enter the ph no in 10 digit");
		Scanner sc = new Scanner(System.in);
		String phNo = sc.next(); // 9094018902

		int pass = Integer.valueOf(String.valueOf(phNo.charAt(0))); // 9
		int state = pass % 2; // 1
		String result = "";
		for (int phNoPosition = 1; phNoPosition < phNo.length(); phNoPosition++) {
			pass = pass + Integer.valueOf(String.valueOf(phNo.charAt(phNoPosition)));

			if (pass % 2 == state && phNoPosition != 9)
				continue;
			else {
				result = result + String.valueOf(pass);
				if (phNoPosition != 9) 
					phNoPosition++;
				pass = Integer.valueOf(String.valueOf(phNo.charAt(phNoPosition)));
				state = pass % 2;
			}
		}

		System.out.println("The result is: " + result);
	}

}
