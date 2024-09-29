package Review1;
import java.util.Scanner;
public class Speeding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int limit = Integer.valueOf(sc.nextLine());
		int speed = Integer.valueOf(sc.nextLine());
		System.out.println(Speeding(limit, speed));
	}
	public static String Speeding(int limit, int speed) {
		int x = speed - limit;
		if (x <= 0) {
			return ("Congratulations, you are within the speed limit!");
		}
		else if (x <= 20) {
			return ("You are speeding and your fine is $100.");
		}
		else if (x <= 30) {
			return ("You are speeding and your fine is $270.");
		}
		else {
			return ("You are speeding and your fine is $500.");
		}
	}
}
