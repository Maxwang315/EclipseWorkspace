package Review1;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class MapPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		HashMap<Integer, Integer> nums = new HashMap<Integer, Integer>();
		int sum = Integer.valueOf(sc.nextLine());
		String nums1 = sc.nextLine();
		String[] nums2 = nums1.split(" ");
		for (int i = 0; i < nums2.length; i++) {
			nums.put(Integer.valueOf(nums2[i]), i);
		}
		addTo(sum, nums);
		
		
	}
	public static void addTo (int sum, HashMap<Integer, Integer> nums) {
		for (Entry<Integer, Integer>entry : nums.entrySet()) {
			if (nums.containsKey(sum-(entry.getKey()))) {
				System.out.print(entry.getValue());
				System.out.print(" ");
				System.out.print(nums.get(sum-(entry.getKey())));
				return;
			}
		}
	}
}
