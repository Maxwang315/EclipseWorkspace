package J3;
import java.util.Scanner;

public class coldCompress {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int lines = Integer.valueOf(sc.nextLine());
		int x = 0;
		while (x < lines) {
			String a = sc.nextLine();
			String b = " ";
			int count = 1;
			for (int i = 0; i < a.length()-1; i++) {
				if ((!(a.substring(i, i+1)).equals(a.substring(i+1, i+2)))) {
					b += String.valueOf(count);
					b += " ";
					b += a.substring(i, i+1);
					b += " ";
					count = 0;
				}
				if (i+2 == a.length()) {
					count++;
					b += String.valueOf(count);
					b += " ";
					b += a.substring(i+1, i+2);
					b += " ";
				}
				else {
					count++;
				}
			}
			System.out.println(b);
			x++;
		}
	}

}
