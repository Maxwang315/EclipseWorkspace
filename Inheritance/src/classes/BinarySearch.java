package classes;
import java.util.ArrayList;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] list = new int[6];
		list[0] = 10;
		list[1] = 19;
		list[2] = 27;
		list[3] = 35;
		list[4] = 40;
		list[5] = 41;
		System.out.println(search(list,10,0,5));
	}
	public static int search(int[] list, int n, int start, int end) {
		
		if (start > end) {
			return -1;
		}
		else if (list[((start) + (end))/2] == n) {
			return ((start) + (end))/2;
		}
		else if (list[((start) + (end))/2] < n) {
			start = ((((start) + (end))/2)+1);
			return search(list, n, start, end);
		}
		else if (list[((start) + (end))/2] > n) {
			end = ((((start) + (end))/2)-1);
			return search(list, n, start, end);
		}
		else
		return -1;
	}
	public static int advancedseaarch(ArrayList<Integer>list, int n) {
		if (list.contains(n)) {
			return list.indexOf(n);
		}
		else 
			return -1;
	}
	
	// not binary search how do we binary this
	//implement binary search with an ArraytList, without start and end index
}
