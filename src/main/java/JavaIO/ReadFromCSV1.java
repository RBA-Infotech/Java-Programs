package JavaIO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFromCSV1 {
	public static void main(String[] args) {
		String csvFile = "src\\JavaIO\\csvinput.csv"; // path to your CSV file
		String line = "";
		String splitBy = ","; // delimiter, usually comma

		try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
			while ((line = br.readLine()) != null) {
				// split the line into values
				String[] values = line.split(splitBy);

				// print each value
				for (String value : values) {
					System.out.print(value + " | ");
				}
				System.out.println();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
