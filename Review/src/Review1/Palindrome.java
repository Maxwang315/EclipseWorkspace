package Review1;
import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
		 String word = sc.nextLine();
		 System.out.println(palindrome(word));
	}
	public static int palindrome(String word) {
		int count = 1; 
		for (int frontdelete = 0; frontdelete < word.length(); frontdelete++) {
			outerloop:
			for (int backdelete = 0; backdelete < word.length()-frontdelete; backdelete++) {
				String newWord = word.substring(frontdelete, word.length()-backdelete);
				for (int i = 0; i < newWord.length()/2; i++) {
					if (!newWord.substring(i, i+1).equals(newWord.substring(newWord.length()-i-1, newWord.length()-i))) {
						continue outerloop;
					}
				}
				if (newWord.length() > count) {
					count = newWord.length();
				}
			}
		}
		return count;
	}
}
