package DemoExamples;
import java.util.Scanner;

public class next_nextLine_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter input for next function");
		String s1 = scanner.next();
		scanner.nextLine();
		System.out.println(s1);
		
		System.out.println("Enter input for nextLine function");
		String s2 = scanner.nextLine();
		System.out.println(s2);
	}

}
