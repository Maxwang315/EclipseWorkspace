package classes;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] list = new int[6];
		list[0] = 19;
		list[1] = 35;
		list[2] = 10;
		list[3] = 2;
		list[4] = 40;
		list[5] = 4;

		sortArray(list);
		System.out.println(list[3]);
	}
	public static void sortArray (int[] a) {
		int tempLowest = 0;
		for (int i = 0; i < a.length; i++) {
			int lowestIndex = i;
			int lowestNumber = a[i];
			for (int j = i; j < a.length; j++) {
				if (a[j] < lowestNumber) {
					lowestNumber = a[j];
					lowestIndex = j;
				}
			}
			tempLowest = a[i];
			a[i] = lowestNumber;
			a[lowestIndex] = tempLowest;
		}
	}
}
