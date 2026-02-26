package Java8Features;

public class EnumDemo {

	enum day {MON, TUE, WED, THU, FRI, SAT, SUN}  // Static and Final
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// we cannot modify the enum value since it is final
//		int a;
//		a = 10;
//		a = 20;
//		
//		day.MON = day.TUE;
		
	System.out.println(day.MON);
	
	}

}
