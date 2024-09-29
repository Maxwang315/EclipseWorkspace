package Review1;

public class modInverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	public static String mod (int x, int m) {
		for (int n = 1; n <= 100; n++) {
			if ((x*n)%m == 1) {
				return String.valueOf(n);
			}
		}
		return "No such integer exists.";
	}
}
