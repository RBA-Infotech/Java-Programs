package ArrayPrgms;

public class PassAndReturnArray {

	public static void findMin(int arrayOne[]) {
		int min = arrayOne[0];  //4, 7, 2, 8, 3 
		
		for(int i = 1; i < arrayOne.length; i++) {
			if(min > arrayOne[i]) {   2 > 8
				min = arrayOne[i];
			}
		}
		System.out.println("the Minimum Element is = " + min);
	}

	public static int[] getArray() {
		
//		int[] a1 = new int[] {32,75,1,53,85,27,83};
//		return a1;
		return new int[] {32,75,1,53,85,27,83};
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arrayTest = {4, 7, 2, 8, 3 };
		
		PassAndReturnArray p1 = new PassAndReturnArray();
		
		PassAndReturnArray.findMin(arrayTest);
		
		int[] arrayThree = PassAndReturnArray.getArray();
		
		System.out.println(arrayThree[2]);
		
	}

}
