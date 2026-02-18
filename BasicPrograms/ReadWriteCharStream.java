package JavaIO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadWriteCharStream {
	public static void main(String[] args) {
		// Specify file paths
		String inputFilePath = "src/JavaIO/input1.txt";
		String outputFilePath = "src/JavaIO/output1.txt";

		// Use try-with-resources to ensure proper resource handling
		
		try (BufferedReader reader = new BufferedReader(new FileReader(inputFilePath));
				BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath))) {
			String line;
			System.out.println("Reading Content from the File: ");
			// Read each line from the input file and write it to the output file
			while ((line = reader.readLine()) != null) {
				System.out.println(line);
				writer.write(line);
			//	writer.newLine(); // Add a new line in the output file
			}
			System.out.println("File content has been written to output file successfully.");
		} catch (IOException e) {
			System.err.println("Error while reading or writing files: " + e.getMessage());
		}
	}
}
