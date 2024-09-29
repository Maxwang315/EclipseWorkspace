package Review1;

import java.util.Scanner;

public class Decode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int lines = Integer.valueOf(sc.nextLine());
		int i = 0;
		while (i < lines) {
			String a = sc.nextLine();
			for (int k = 0; k < Integer.valueOf(a.substring(0, a.indexOf(" "))); k++) {
				System.out.print(a.substring(a.indexOf(" ")+1, a.length()));
			}
			System.out.println();
			i++;
		}
	}

}
