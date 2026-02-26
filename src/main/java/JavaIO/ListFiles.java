package JavaIO;

import java.io.File;

public class ListFiles {
	public static void main(String[] args) {
		File dir = new File("./src/JavaIO");

		if (dir.mkdir()) {
            System.out.println("Directory created: " + dir.getName());
        } else {
            System.out.println("Directory already exists or failed to create.");
        }
		
		if (dir.exists() && dir.isDirectory()) {
			String[] files = dir.list();
			System.out.println("Files in directory:");
			for (String file : files) {
				System.out.println(file);
			}
		} else {
			System.out.println("Directory does not exist.");
		}
	}
}
