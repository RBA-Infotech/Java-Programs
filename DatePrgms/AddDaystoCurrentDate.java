package DatePrgms;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class AddDaystoCurrentDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//  current date - Fri Mar 05 2021
		// going to add 3 dates
		// future date - Mon Mar 08 2021
		
		Calendar cal = Calendar.getInstance();
		Date date = new Date();
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd");
		
		System.out.println("Current Date using Calender: "+ sdf.format(cal.getTime()));
		
		System.out.println("Current Date using Date: "+ sdf.format(date));
		
		cal.add(Calendar.DAY_OF_MONTH, 3);	
		String futureDate = sdf.format(cal.getTime());
		System.out.println("3 days from Current Date: "+ futureDate);
		
		//driver.findElements(By.xpath("//*[@aria-label='+futureDate+']"))
		
		//*[@aria-label='Mon Mar 08 2021']
		
	}

}
