package Review1;

import java.util.Scanner;

public class Squares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int tiles = Integer.valueOf(sc.nextLine());
		System.out.println(squares(tiles));
	}
	public static String squares (int tiles) {
		int sideLength = (int)Math.sqrt(tiles);
		return ("The largest square has side length " + sideLength + ".");
	}
}
