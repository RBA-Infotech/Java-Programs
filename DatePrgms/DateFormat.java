package DatePrgms;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Date date = new Date();
		System.out.println("Date: " + date);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy_HH_mm_ss"); //yyyy-MM-dd
		String printDate = sdf.format(date);
		System.out.println(printDate);
	
	// another way to write the above code
		
		System.out.println(new SimpleDateFormat("dd-MMM-yyyy").format(new Date()));
		
	}

}
