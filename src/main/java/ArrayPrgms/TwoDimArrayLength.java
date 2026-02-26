package ArrayPrgms;

public class TwoDimArrayLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] intArray = {
				{10,42,64},
				{64,21,96,75},
				{45}
};
		
		System.out.println("Array Elements: " + intArray[2][0]);
		System.out.println("Array Length (no of rows): " + intArray.length);
		System.out.println("Array Length of specific row): " + intArray[1].length);
	}
}
		
