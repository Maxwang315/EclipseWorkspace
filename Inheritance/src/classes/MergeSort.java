package classes;

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {
		int[] a = new int[] {1,34,5,78,9,65};
		
		
		int[] sortedArr = MergeSort(a);
		
		for (int i = 0; i < a.length; i++) {
			System.out.println(sortedArr[i]);
		}
		
	}
	
	public static int[] MergeSort(int[] arr) {
		// Split to two part
		// Run MergeSort on both part
		// Merge the two parts back
		// Return the merged one array
		if (arr.length == 1 ) {
			return arr; 
		}
		int midIndex = (arr.length - 1)/2;
		int[] a = Arrays.copyOfRange(arr, 0, arr.length/2);
		int[] b = Arrays.copyOfRange(arr, arr.length/2, arr.length);
		a = MergeSort(a);
		b = MergeSort(b);
		return Merge(a, b); 
	}
	
	public static int[] Merge(int[] a, int[] b) {
		// Merge by looking at the first number of a and b
		// manage and increment the indexes for indicating each of the first item in a and b
		int i = 0;
		int j = 0;
		int[] merged = new int[a.length + b.length];
		for (int k = 0; k < merged.length; k++) {
			if (i > a.length-1) {
				merged[k] = b[j];
				j++;
			}
			else if (j > b.length-1){
				merged[k] = a[i]; 
				i++; 
			}
			else if (a[i] <= b[j]) {
				merged[k] = a[i];
				i++;
			}
			else {
				merged[k] = b[j];
				j++;
			}
		}
		return merged;
	}
}
