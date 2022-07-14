package DatePrgms;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class DateComparison {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		String curDate = sdf.format(d);
		
		Date d1 = sdf.parse(curDate);
				
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the date");
		String strDate = sc.nextLine();
		Date d2 = sdf.parse(strDate);
		
		if(d2.compareTo(d1)==0)
			System.out.println("Entered date is same as today date");
		else if(d2.compareTo(d1) > 0)
			System.out.println("Entered date is greater than today date");

		else
			System.out.println("Entered date is less than today date");
		
		//System.out.println("Date Comprasion: " + currDate.compareTo(strDate));
	
		// code snippet to check 6 month
		Calendar calendar = Calendar.getInstance();
		//calendar.setTime(new Date());
		calendar.add(Calendar.DATE, 180);
		String withinSixMonth = sdf.format(calendar.getTime());
		System.out.println("with in 6 month: " + withinSixMonth);
		System.out.println();
		 
		
	}
	

}
