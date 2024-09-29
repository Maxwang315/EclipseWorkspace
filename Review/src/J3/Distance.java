package J3;

import java.util.Scanner;

public class Distance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String d = sc.nextLine();
		String[] distances = new String[4];
		distances = (d.split(" "));
		int d1 = Integer.valueOf(distances[0]);
		int d2 = Integer.valueOf(distances[1]);
		int d3 = Integer.valueOf(distances[2]);
		int d4 = Integer.valueOf(distances[3]);
		System.out.println(0 + " " + d1 + " " + (d1+d2) + " " + (d1+d2+d3) + " " + (d1+d2+d3+d4));
		System.out.println(d1 + " " + 0 + " " + (d2) + " " + (d2+d3) + " " + (d2+d3+d4));
		System.out.println((d1+d2) + " " + d2 + " " + 0 + " " + (d3) + " " + (d3+d4));
		System.out.println((d1+d2+d3) + " " + (d2+d3) + " " + (d3) + " " + 0 + " " + (d4));
		System.out.println((d1+d2+d3+d4) + " " + (d2+d3+d4) + " " + (d3+d4) + " " + (d4) + " " + 0);
	}

}
