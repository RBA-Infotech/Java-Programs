package ArrayPrgms;

import java.util.Scanner;

public class TwoDimentionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the no of Rows");
		int row = sc.nextInt();

		System.out.println("Enter the no of columns");
		int column = sc.nextInt();
		sc.nextLine();

		String[][] tda = new String[row][column];

		System.out.println("Enter the list of strings");
		for (int i = 0; i < row; i++) {			//2
			for (int j = 0; j < column; j++) {  //3
				//System.out.println("i = " +  i + "\t j = " + j);
				tda[i][j] = sc.nextLine();
			}
		}
	
		System.out.println("\nThe list of strings you entered are: ");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				System.out.print(tda[i][j] + "\t");
			}
			System.out.println();
		}
	}

}
