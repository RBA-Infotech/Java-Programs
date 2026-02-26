package BasicPrograms;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numbers = { 1, 2, 3, 2, 4, 3, 5, 1 };
		
		int[] uniqueNumber= new int[10];
		int k = 0;
		uniqueNumber[k++] = numbers[0];
		for (int i = 0; i < numbers.length; i++) {
			for (int j = i + 1; j < numbers.length - 1; j++) {
				if ((numbers[i]) != numbers[j])
					uniqueNumber[k++] = numbers[i];
				
			}
		}
	}

}
