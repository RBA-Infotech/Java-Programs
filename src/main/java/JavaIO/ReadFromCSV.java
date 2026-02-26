package JavaIO;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

import java.io.FileReader;
import java.io.IOException;

public class ReadFromCSV {
	public static void main(String[] args) throws CsvValidationException {
		String csvFile = "src\\JavaIO\\csvinput.csv"; // path to CSV file

		try (CSVReader reader = new CSVReader(new FileReader(csvFile))) {
			String[] line;
			while ((line = reader.readNext()) != null) {
				// line[] contains one row of values
				for (String value : line) {
					System.out.print(value + " \t ");
				}
				System.out.println();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
