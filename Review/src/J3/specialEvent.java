package J3;
import java.util.Scanner;

public class specialEvent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int people = Integer.valueOf(sc.nextLine());
		int[] schedule = new int[5];
		for (int i = 0; i < people; i++) {
			String schedule1 = sc.nextLine();
			for (int j = 0; j < 5; j++) {
				if (schedule1.substring(j, j+1).equals("Y")) {
					schedule[j]++;
				}
			}
		}
		int count = 0;
		for (int m = 0; m < schedule.length; m++) {
			if (schedule[m] > count) {
				count = schedule[m];
			}
		}
		boolean a = true;
		for (int k = 0; k < 5; k++) {
			if (schedule[k] == count && a) {
				System.out.print(k+1);
				a = false;
			}
			else if (schedule[k] == count) {
				System.out.print("," + (k+1));
			}
		}
	}

}
