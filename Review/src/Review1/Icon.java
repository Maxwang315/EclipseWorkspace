package Review1;
import java.util.Scanner;

public class Icon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int k = Integer.valueOf(sc.nextLine());
		String[][] original = {{"*", "x", "*"}, {" ", "x", "x"}, {"*", " ", "*"}};
		String[][] newIcon = icon(original, k);
		for (int i = 0; i < newIcon.length; i++) {
			for (int j = 0; j < newIcon[0].length; j++) {
				System.out.print(newIcon[i][j]);
			}
			System.out.println();
		}
	}
	public static String[][] icon(String[][] original, int k) {
		String[][] newIcon = new String[3*k][3*k];
		for (int i = 0; i < k; i++) {
			for (int j = 0; j < newIcon[0].length; j++) {
				if (j < k) {
					newIcon[i][j] = original[0][0];
				}
				else if (j < 2*k) {
					newIcon[i][j] = original[0][1];
				}
				else {
					newIcon[i][j] = original[0][2];
				}
			}
		}
		for (int i = k; i < 2*k; i++) {
			for (int j = 0; j < newIcon[0].length; j++) {
				if (j < k) {
					newIcon[i][j] = original[1][0];
				}
				else if (j < 2*k) {
					newIcon[i][j] = original[1][1];
				}
				else {
					newIcon[i][j] = original[1][2];
				}
			}
		}
		for (int i = 2*k; i < 3*k; i++) {
			for (int j = 0; j < newIcon[0].length; j++) {
				if (j < k) {
					newIcon[i][j] = original[2][0];
				}
				else if (j < 2*k) {
					newIcon[i][j] = original[2][1];
				}
				else {
					newIcon[i][j] = original[2][2];
				}
			}
		}
		return newIcon;
	}
}
