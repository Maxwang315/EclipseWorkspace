package Review1;
import java.util.Scanner;
public class Deal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int count = Integer.valueOf(sc.nextLine());
		int [] out = new int[count];
		for (int i = 0; i < count; i++) {
			out[i] = Integer.valueOf(sc.nextLine());
		}
		int offer = Integer.valueOf(sc.nextLine());
		System.out.println(deal(out, offer));
	}
	public static String deal (int[] out, int offer) {
		int total = 1691600;
		for (int i = 0; i < out.length; i++) {
			if (out[i] == 1) {
				total -= 100;
			}
			if (out[i] == 2) {
				total -= 500;
			}
			if (out[i] == 3) {
				total -= 1000;
			}
			if (out[i] == 4) {
				total -= 5000;
			}
			if (out[i] == 5) {
				total -= 10000;
			}
			if (out[i] == 6) {
				total -= 25000;
			}
			if (out[i] == 7) {
				total -= 50000;
			}
			if (out[i] == 8) {
				total -= 100000;
			}
			if (out[i] == 9) {
				total -= 500000;
			}
			if (out[i] == 10) {
				total -= 1000000;
			}
		}
		int average = total / (10 - out.length);
		if (average >= offer) {
			return "no deal";
		}
		else {
			return "deal";
		}
	}
}
