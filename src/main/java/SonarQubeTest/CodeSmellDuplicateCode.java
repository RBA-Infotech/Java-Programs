package SonarQubeTest;

public class CodeSmellDuplicateCode {

	public static void main(String[] args) {

		System.out.println("printing for loop first time");
		for (int i = 0; i <= 10; i++) {
			System.out.println(i);
		}

		System.out.println("duplicating the for loop again");
		for (int i = 0; i <= 10; i++) {
			System.out.println(i);
		}
	}
}
