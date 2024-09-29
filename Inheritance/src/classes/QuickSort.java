package classes;

import java.util.ArrayList;
import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(1);
		arr.add(6);
		arr.add(3);
		arr.add(8);
		arr.add(2);
		arr.add(6);
		arr.add(8);
		arr.add(5);
		arr.add(9);
		arr.add(10);
		arr.add(22);
		ArrayList<Integer> sortedArr = QuickSort(arr);
		for (int i = 0; i < sortedArr.size(); i++) {
			System.out.println(sortedArr.get(i));
		}
	}
		
		
		public static ArrayList<Integer> QuickSort(ArrayList<Integer> arr) {
			if (arr.size() <= 1) {
				return arr; 
			}
			ArrayList<Integer> front = new ArrayList<Integer>();
			ArrayList<Integer> back = new ArrayList<Integer>();
			int pivot = arr.remove(0); 
			while (arr.size()>0) {
				int tempNum = arr.remove(0); 
				if (tempNum <= pivot) {
					front.add(tempNum);
				}
				else {
					back.add(tempNum);
				}
			}
			front = QuickSort(front);
			back = QuickSort(back);
			return Merge(pivot, front, back);
		}
		
		public static ArrayList<Integer> Merge(int pivot, ArrayList<Integer> front, ArrayList<Integer> back) {
			ArrayList<Integer> sorted = new ArrayList<Integer>();
			sorted.addAll(front); 
			sorted.add(pivot); 
			sorted.addAll(back); 
			return sorted;
		}
}

