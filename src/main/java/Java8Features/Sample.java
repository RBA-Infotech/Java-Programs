package Java8Features;

@FunctionalInterface
interface messageable{
	public int display(int a, int b);
}


//class implementClass implements showable{
//
//	public void display() {
//		System.out.println("print");
//	}
//	
//	
//}

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		messageable i1;
		
		i1 = (a,b) ->  a+b; 
		
		int result = i1.display(5, 6);
		
		//System.out.println(result);
		
		System.out::;
		
	}

}
