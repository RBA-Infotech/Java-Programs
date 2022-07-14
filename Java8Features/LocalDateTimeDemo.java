package Java8Features;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

public class LocalDateTimeDemo {

	public static void main(String[] args) {

		Date d1 = new Date();
		System.out.println(d1);
		
		LocalDate d = LocalDate.now();
		System.out.println(d);
		
		LocalTime t = LocalTime.now();
		System.out.println(t);
		
		System.out.println(LocalDateTime.of(2022, 7, 14, 10,34,23));
		
		
	}

}
