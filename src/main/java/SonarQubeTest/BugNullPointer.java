package SonarQubeTest;

public class BugNullPointer {

	public static void main(String[] args) {

		String name = null;
		
		if(name.equals("Senthil")) {
			System.out.println("Match");
		}else
			System.out.println("No Match");
	}

}
