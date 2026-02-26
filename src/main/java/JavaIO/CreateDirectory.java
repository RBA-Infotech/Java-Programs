package JavaIO;

import java.io.File;

public class CreateDirectory {
	public static void main(String[] args) {
		File dir = new File("exampleDir");

		if (dir.mkdir()) {
			System.out.println("Directory created: " + dir.getName());
		} else {
			System.out.println("Directory already exists or failed to create.");
		}
	}
}
