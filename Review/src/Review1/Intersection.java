package Review1;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

public class Intersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr1 = {"a", "b", "c", "e"};
		String[] arr2 = {"b", "c", "e", "f"};
		intersection(arr1, arr2);
	}
	public static void intersection(String[] arr1, String[] arr2) {
		ArrayList<String> arr2a = new ArrayList<String>();
		for (int m = 0; m < arr2.length; m++) {
			arr2a.add(arr2[m]);
		}
		for (int i = 0; i < arr1.length; i++) {
			if (arr2a.contains(arr1[i])) {
				System.out.println(arr1[i]);
			}
		}
	}
}
