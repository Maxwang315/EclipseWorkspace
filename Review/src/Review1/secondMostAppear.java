package Review1;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map.Entry;

public class secondMostAppear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr = {"a","a", "a", "c", "c", "c", "a", "d"};
		System.out.println(secondMostAppear(arr));
	}
	public static String secondMostAppear(String[] arr) {
		HashMap<String, Integer> items = new HashMap<String, Integer>();
		for (int i = 0; i < arr.length; i++) {
			if (!items.containsKey(arr[i])) {
				items.put(arr[i], 1);
			}
			else {
				items.put(arr[i], items.get(arr[i])+1);
			}
		}
		int most = 0;
		int secondMost = 0;
		String mostKey = " ";
		String secondMostKey = " ";
		for (Entry<String, Integer> entry : items.entrySet()) {
			if (entry.getValue() > secondMost) {
				if (entry.getValue() > most) {
					secondMost = most;
					secondMostKey = mostKey;
					most = entry.getValue();
					mostKey = entry.getKey();
				}
				else {
					secondMost = entry.getValue();
					secondMostKey = entry.getKey();
				}
			}
		}
		return secondMostKey;
	}
}
