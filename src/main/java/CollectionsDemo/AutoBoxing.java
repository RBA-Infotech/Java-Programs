package CollectionsDemo;

public class AutoBoxing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 12;
		Integer num = a;
		System.out.println("After converting int to Integer wrapper clas : " + num.intValue());
		
		System.out.println("Comparing 12 and 20 is = " + num.compareTo(20));
		
		Integer int1 = new Integer(25);
		int wrapperToDataType = int1.intValue();
		System.out.println(wrapperToDataType);
		
		Float f1 = new Float(3.14f);
		float f2 = f1.floatValue();
		System.out.println("Float to float: " + f2);
	}

}
