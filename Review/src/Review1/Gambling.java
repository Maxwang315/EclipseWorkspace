package Review1;
import java.util.Scanner;
public class Gambling {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int money = Integer.valueOf(sc.nextLine());
        int a = Integer.valueOf(sc.nextLine());
        int b = Integer.valueOf(sc.nextLine());
        int c = Integer.valueOf(sc.nextLine());
        System.out.println(count(money, a, b, c));
	}
	public static String count (int money, int a, int b, int c) {
		int count = 0;
		int i = 1;
		while (money > 0) {
			money--;
			if (i == 1) {
				a++;
			}
			if (i == 2) {
				b++;
			}
			if (i == 3) {
				c++;
			}
			if (a == 35) {
				a = 0;
				money += 30;
			}
			if (b == 100) {
				b = 0;
				money += 60;
			}
			if (c == 10) {
				c = 0;
				money += 9;
			}
			if (i != 3) {
				i++;
			}
			else if (i == 3) {
				i = 1;
			}
			count++;
		}
		return "Martha plays " + count + " times before going broke.";
	}
}
