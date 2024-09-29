package main;

import java.util.ArrayList;

import java.util.Scanner; 

public class KnightHop {
	
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String userinput = sc.nextLine();
		String[] knightposition = userinput.split(" ");
		int[] knightposition1 = new int[2];
		for (int i = 0; i < 2; i++) {
			knightposition1[i] = Integer.valueOf(knightposition[i]);
		}
		String userinput1 = sc.nextLine();
		String[] destination = userinput1.split(" ");
		int[] destination1 = new int[2];
		for (int i = 0; i < 2; i++) {
			destination1[i] = Integer.valueOf(destination[i]);
		}
		System.out.println(knightmovement(knightposition1, destination1, 0, new ArrayList<int[]>()));
	}
	public static int knightmovement (int[] knightposition, int[]coords, int depth, ArrayList<int[]> previousPos) {
//		ArrayList<ArrayList<Integer>> board = new ArrayList<ArrayList<Integer>>();
//		ArrayList<Integer> row =  new ArrayList<Integer>();
//			row.add(0);
		
		//Base Case
		if (knightposition[0] == coords[0] && knightposition[1] == coords[1])
			return depth;
		if (OutOfBoard(knightposition))
			return -1;
		//Extra base case not handled
		
		//8 Directions
		int[] dX = new int[] {-2, -1, 1, 2, 1, 2, -1, -2};
		int[] dY = new int[] {-1, -2, -2, -1, 2, 1, 2, 1};
		int expandX, expandY;
		int smallestStep = Integer.MAX_VALUE;
		for (int i = 0; i < 8; i++) {
			expandX = knightposition[0] + dX[i];
			expandY = knightposition[1] + dY[i];
//			if (expandX == previousPos[0] && expandY == previousPos	[1])
			if (InPreviousPos = true) {
				return -1;
			}
			ArrayList<int[]>expand = new ArrayList <int[]>();
			
			int pathResult = knightmovement(new ArrayList<int[]{expandX, expandY}>(), coords, depth + 1, knightposition);
			if (pathResult > 0 && pathResult < smallestStep) {
				smallestStep = pathResult;
			}
		}
		return smallestStep;
	}
	
	public static boolean OutOfBoard(int[] knightposition) {
		return (knightposition[0] < 0 ||
				knightposition[0] > 7 ||
				knightposition[1] < 0 ||
				knightposition[1] > 7);
	}
	
	public static boolean InPreviousPos(int x, int y, ArrayList<int[]> previous) {
		for (int i = 0; i < previous.size(); i++) {
			if (x == previous.get(i)[0] &&
					y == previous.get(i)[1])
				return true;
		}
		return false;
	}

}
