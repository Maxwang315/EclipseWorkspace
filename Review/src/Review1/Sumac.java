package Review1;

public class Sumac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static int sumac (int t1, int t2) {
		int count = 2;
		while (t1 - t2 <= t2) {
			int i = t1;
			t1 = t2;
			t2 = (i - t2);
			count++;
		}
		return count+1;
	}
}
