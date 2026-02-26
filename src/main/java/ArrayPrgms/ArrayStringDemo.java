package ArrayPrgms;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ArrayStringDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		String[] s1 = new String[10];
		
		System.out.println("Enter total no of Strings");
		Scanner sc = new Scanner(System.in);
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//System.out.println("Total No of Strings: " + s1.length);
		
		int n = sc.nextInt();
		sc.nextLine();
		System.out.println("n = " + n);
		
		for(int i=0; i<n; i++) {
			s1[i] = sc.nextLine();
			//sc.next();
		}
		
		System.out.println("The Strings you entered are: ");
		
		for (int i=0; i<n; i++)
			System.out.println(s1[i]);
		
	}

}
