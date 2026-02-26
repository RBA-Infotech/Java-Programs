package CodeChallenge;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/**************
 * 
 * 
 * @author senth
 *
 *         intput = AADABBCEDDADC 
 *         output = A4B2C2D4E1
 */
class StringEncoding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter the string");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String encodStr = "";
		char[] chArr = input.toCharArray();
		char c = 'A' + 4;
		Arrays.sort(chArr);
		int count = 1;
		for (int i = 0; i < chArr.length - 1; i++) {
			if (chArr[i] == chArr[i + 1]) {
				count++;
			} else {
				System.out.print(chArr[i] + "" + count);
				if (chArr.length - i == 2)
					count = 0;
				else
					count = 1;
			}

		}
		System.out.print(chArr[chArr.length - 1] + "" + (count+1));
	}

}
