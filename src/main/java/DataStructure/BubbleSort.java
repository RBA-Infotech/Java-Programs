package DataStructure;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp;
		int[] arr = { 21, 45, 19, 9,58, 2, 90,1};
		int n = arr.length;
		int i, j;
		for (i = 0; i < n;) {
			for (j = i + 1; j < n;) {
				if (arr[i] > arr[j]) {
					temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
				i++;
				j++;
			}
			i = 0;
			j = i + 1;
			n--;
		}

		
		System.out.println("Elements after bubble sort");
		for (i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
