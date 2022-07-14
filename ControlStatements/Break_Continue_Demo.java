package ControlStatements;

public class Break_Continue_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Break Explanation");
	for(int i=0; i<10; i++) {
		
		if(i==5) 
			break;
		
		System.out.println(i);
		}
	
	System.out.println("Continue Explanation");
	for(int j=0; j<10; j++) {	
		if(j==5)
			continue;
		System.out.println(j);
		}	
	}

	
}
