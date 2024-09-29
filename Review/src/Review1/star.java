package Review1;
import java.util.Scanner;

public class star {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int lines = Integer.valueOf(sc.nextLine());
		stars(lines);
	}
	public static void stars (int lines) {
		String[][]stars = new String[2*lines-1][2*lines-1];
		for (int x = 0; x < stars.length; x++) {
			for (int y = 0; y < stars[0].length; y++) {
				stars[x][y] = " ";
			}
		}
		int middle = (2*lines-1)/2;
		for (int i = 0; i < lines; i++) {
			for (int j = middle; j < (2*lines-1)-middle; j++) {
				stars[i][j] = "*";
			}
			middle--;
		}
		for (int k = lines; k < stars.length; k++) {
			for (int m = middle+2; m <= (stars[0].length)-(middle+2)-1; m++) {
				stars[k][m] = "*";
			}
			middle++;
		}
		for (int a = 0; a < stars.length; a++) {
			for (int b = 0; b < stars[0].length; b++) {
				System.out.print(stars[a][b]);
			}
			System.out.println();
		}
	}
}
