package main;

import java.util.ArrayList;

public class ArraysAndLoops {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numberOfFruits = new int[5];
//	
		String[] numberOfApples = new String[5];
//		numberOfApples[0] = "1";
//		numberOfApples[1] = "2";
//		numberOfApples[2] = "3";
//		numberOfApples[3] = "4";
//		numberOfApples[4] = "5";
//		
//		numberOfFruits[0] = Integer.parseInt(numberOfApples[0]); 
		numberOfFruits[1] = Integer.parseInt(numberOfApples[1]); 
//		numberOfFruits[2] = Integer.parseInt(numberOfApples[2]); 
//		numberOfFruits[3] = Integer.parseInt(numberOfApples[3]); 
//		numberOfFruits[4] = Integer.parseInt(numberOfApples[4]); 
//		
//		System.out.println (numberOfFruits[0]);
//		System.out.println (numberOfFruits[1]);
//		System.out.println (numberOfFruits[2]);
//		System.out.println (numberOfFruits[3]);
//		System.out.println (numberOfFruits[4]);
//	
//		int counter = 10;
//		while (counter > 0) {
//			counter--;
//			System.out.println("number is positive");
//		}
//		for (int i = 200; i < 801; i += 2) {
//			System.out.println(i);
//		}
//		int[] numbers = new int [100];
//		for (int i = 100; i < 200; i++) {
//			numbers[i-100] = i;
//			System.out.println(numbers[i-100]);
//		}
		
//		for (int i = 11; i < 21; i++) {
//			int result = i;
//			System.out.println(result);
//		}
		int[] a = new int[10]; 
		for (int i = 0; i < 10; i++) {
			a [i] = i;
		}	
		int[] b = new int[10]; 
		for (int i = 0; i < 10; i++) {
			b[i] = i;
		}
//		amountOfMoney(a,b);
//		
		int[] arr = new int[4];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		
		
		System.out.println(arrayList(arr));
		
		
		ArrayList<ArrayList<String>> result = frame(8);
		
		//Add a blob
		int[][] coords = new int[][] {
			{2, 2},
			{1, 2},
			{2, 1},
			{2, 3},
			{3, 2}
		};
		result = addblob(result, coords);
		deleteblob(result, 2, 3);
		for (int i = 0; i < result.size(); i++) {
			for (int j = 0; j < result.get(i).size(); j++) {
				System.out.print(result.get(i).get(j));
			}
			System.out.println();
			}
		}
		
		
		/*
		 * Next step:
		 * AddBlob Method
		 * Method takes in an arraylist of arraylist of string "frame" and 
		 * an array of array of 2 integers
		 * [[1, 3], [4, 5], [3, 7]]
		 * These would be positions, coordinates of the points you will be adding onto the arraylist
		 * Output the arraylist frame with added blobs
		 * 
		 * Input:
		 * ****
		 * *  *
		 * *  *
		 * ****
		 * [[1, 1], [1, 2]]
		 * 
		 * Output:
		 * ****
		 * ** *
		 * ** *
		 * ****
		 */
	

//		public static void amountOfMoney(int[] arr) {
//			for (int i = 0; i < 10; i++) {
//				System.out.println(arr[i]);
//			}
//		}
//		public static void amountOfMoney(int[] arr1, int[] arr2) {
//			for (int i = 0; i < 10; i++) {
//				System.out.println(arr1[i]);
//				System.out.println(arr2[i]);
//			}
//		}
		public static ArrayList<Integer> arrayList(int[] arr) {
			ArrayList<Integer>starterArray = new ArrayList<Integer>();
			//(arr.length >= 5 ? 5 : arr.length) ternary expression
			for (int i = 0; i < Math.min(5, arr.length); i++) {
				starterArray.add(arr[i]);
			}
			return starterArray;
		}
		
		public static ArrayList<ArrayList<String>> frame (int size) {
			ArrayList<ArrayList<String>> frame = new ArrayList<ArrayList<String>>();
			ArrayList<String> line =  new ArrayList<String>();
			ArrayList<String> line2 =  new ArrayList<String>();
			//first and last line of frame
			for (int i = 0; i < size; i++) {
				line.add("*");
			}
			//middle part of frame
			for (int i = 0; i < size; i++) {
				line2.add(i == 0 || i == size - 1 ?  "*" : " ");
			}
			//putting frame together 
			for (int i = 0; i < size; i++) {
				frame.add(i == 0 || i == size - 1 ? (ArrayList<String>) line.clone() : (ArrayList<String>) line2.clone());
			}
			return frame;
		}
		
		public static ArrayList<ArrayList<String>> addblob (ArrayList<ArrayList<String>> frame, int[][] coords) {
			 for (int i = 0; i < coords.length; i++) {
				 int x = coords[i][0];
				 int y = coords[i][1];
				 frame.get(x).set(y, "*");
			 }
			 return frame;
		}
		
		public static void deleteblob (ArrayList<ArrayList<String>> frame, int x, int y){
			
			if(x <= 0 || y <= 0) {
				return;
			}
			
			String blob = "*";
			if (frame.get(x).get(y).equals(blob)) {
				frame.get(x).set(y, " ");
				int[] dX = new int[] {-1, 0, 1, 0};
				int[] dY = new int[] {0, -1, 0, 1};
				int expandX, expandY;
				for (int i = 0; i < dX.length; i++)	{
					expandX = x + dX[i]; 
					expandY = y + dY[i]; 
					deleteblob(frame, expandX, expandY);
				}
			}	
		}
		
		
	
		
		/*
		 * Create a method that takes in an integer "size"
		 * Create a square image representation of a frame
		 * Input: 3
		 * Output:
		 * ***
		 * * *
		 * ***
		 * 
		 * Input: 4
		 * Output:
		 * ****
		 * *  *
		 * *  *
		 * ****
		 * 
		 * This will be an an ArrayList of ArrayList of String type
		 * The space would be a simple a string " "
		 * 
		 * ArrayList<ArrayList<String>>
		 */
		
		/*
		 * Homework
		 * Delete Blob Question
		 * Write a method that takes in a 2d arraylist of string, an int x, and an int y
		 * the int x and y represents one single coordinates
		 * Assume the coordinates might not exist on your 2d arraylist (check)
		 * If the position on the 2d arraylist does not have any *, do nothing
		 * If the position has a star, remove that star (set to " ") and also the connected nodes
		 * Connected means horizontally or vertically next to.
		 * Hint: You need recursion
		 */
		
				
}

