package DemoExamples;

public class Logical_Opr_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=10, b=20, c=30;
		
		if((a>b) && (a>c))
			System.out.println(a + " is greater than " + b + " and " + c);
		else if((b>c) && (b>a)) {
			System.out.println(b + " is greater than " + a + " and " + c);
		}
		else
			System.out.println(c + " is greater than " + a  + " and " + b);
	}

}
