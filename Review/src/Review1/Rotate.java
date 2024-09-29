package Review1;

import java.util.ArrayList;
import java.util.Scanner;

public class Rotate {
	
//	Input:
//		1 2 3 4 5
//		L 2
//		R 3
//		S 0
//		Process:
//		1 2 3 4 5 -> 3 4 5 1 2 -> 5 1 2 3 4
//		Output:
//		5 1 2 3 4

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String arr = sc.nextLine();
		String[] arr1 = arr.split(" ");
		ArrayList<Integer> arr2 = new ArrayList<Integer>();
		for (int i = 0; i < arr1.length; i++) {
			arr2.add(Integer.valueOf(arr1[i]));
		}
		boolean a = true;
		while (a) {
			String direction = sc.nextLine();
			ArrayList<Integer> rotated = rotate(arr2, direction);
			arr2 = rotated;
			if (direction.equals("S 0")) {
				a = false;
			}
		}
		String finalWord = "";
		for (int b = 0; b < arr2.size(); b++) {
			finalWord += (String.valueOf(arr2.get(b))+ " ");
		}
		System.out.print(finalWord);
		
	}
	public static ArrayList<Integer> rotate(ArrayList<Integer> arr, String direction) {
		int steps = (Integer.valueOf(direction.substring(direction.indexOf(" ")+1, direction.length())))%arr.size();
		String turn = direction.substring(0, direction.indexOf(" "));
		ArrayList<Integer> newArray = new ArrayList<Integer>();
		if (turn.equals("L")) {
			for (int i = steps; i < arr.size(); i++) {
				newArray.add(arr.get(i));
			}
			for (int j = 0; j < steps; j++) {
				newArray.add(arr.get(j));
			}
			return newArray;
		}
		else if (turn.equals("R")) {
			for (int k = arr.size()-steps; k < arr.size(); k++) {
				newArray.add(arr.get(k));
			}
			for (int l = 0; l < arr.size()-steps; l++) {
				newArray.add(arr.get(l));
			}
			return newArray;
		}
		else {
			return arr;
		}
	}
}
