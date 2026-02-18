package JavaIO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class URLDemo {
	public static void main(String[] args) throws IOException {
		URL url = new URL("https://www.example.com");
		try (BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()))) {
			String inputLine;
			while ((inputLine = in.readLine()) != null) {
				System.out.println(inputLine);
			}
		}
	}
}
