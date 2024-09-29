package J3;

import java.util.Scanner;

public class art {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int dots = Integer.valueOf(sc.nextLine());
		int i = 0;
		int top = -1;
		int bottom = 101;
		int left = 101; 
		int right = -1;
		while (i < dots) {
			String dot = sc.nextLine();
			if (Integer.valueOf(dot.substring(0, dot.indexOf(",")))>=right) {
				right = Integer.valueOf(dot.substring(0, dot.indexOf(","))) +1;
			}
			if (Integer.valueOf(dot.substring(0, dot.indexOf(",")))<=left) {
				left = Integer.valueOf(dot.substring(0, dot.indexOf(","))) -1;
			}
			if (Integer.valueOf(dot.substring(dot.indexOf(",")+1, dot.length()))>=top) {
				top = Integer.valueOf(dot.substring(dot.indexOf(",")+1, dot.length())) +1;
			}
			if (Integer.valueOf(dot.substring(dot.indexOf(",")+1, dot.length()))<=bottom) {
				bottom = Integer.valueOf(dot.substring(dot.indexOf(",")+1, dot.length())) -1;
			}
			i++;
		}
		System.out.println(left + "," + bottom);
		System.out.println(right + "," + top);
	}

}
