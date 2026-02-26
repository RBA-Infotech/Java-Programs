package DateTimeAPI;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

public class LocalDateTimeDemo {

	public static void main(String[] args) {

		Date d1 = new Date();
		System.out.println("Date and Time displayed before Java 8: " + d1);
		
		LocalDate d = LocalDate.now();
		System.out.println("Date alone after Java 8: " + d);
		
		LocalTime t = LocalTime.now();
		System.out.println("Time alone after Java 8: " + t);
		
		System.out.println(LocalDateTime.of(2022, 7, 14, 10,34,23));
		
		
	}

}
