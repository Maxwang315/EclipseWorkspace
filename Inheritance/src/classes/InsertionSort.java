package classes;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] list = new int[6];
		list[0] = 19;
		list[1] = 10;
		list[2] = 1;
		list[3] = 2;
		list[4] = 40;
		list[5] = 4;

		sortArray(list);
		for (int i = 0; i < list.length; i++) {
			System.out.println(list[i]);
			
			String returned = " ";
			returned += "a";
		}
	}
	public static void sortArray(int[] a) {
		for (int i = 1; i < a.length; i++) {
			int current = a[i];
			int j = i-1;
			while (j >= 0 && a[j] > current) {
				a[j+1] = a[j];
				j--;
			}	
			a[j+1] = current;
		}	
	}	
}

