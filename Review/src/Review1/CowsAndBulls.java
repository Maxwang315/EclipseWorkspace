package Review1;

public class CowsAndBulls {

	/*
	 * You are playing the following Bulls and Cows game with your friend:
	 * You write a 4-digit secret number and ask your friend to guess it
	 * Each time your friend guesses a number, you give a hint
	 * The hint tells your friend how many digits are in the correct position (called "bulls")
	 * and how many digits are in the wrong positions (called "cows"
	 * Your friend will use those hints to find out the secret number
	 * Input:
	 * 1807
	 * 7801
	 * Output:
	 * 1 bull and 3 cows 
	 * Explanation:
	 * 1807 is the secret number
	 * 7810 is the guess
	 * The bull is the 8, the other 3 digits are cows
	 */
	public static void main(String[] args) {
		System.out.println(cowBull("1807", "0034"));
	}
	public static String cowBull(String secret, String guess) {
		int cowCount = 0; 
		int bullCount = 0;
		String secret1 = String.valueOf(secret);
		String guess1 = String.valueOf(guess);
		for (int i = 0; i < secret1.length(); i++) {
			if (secret1.substring(i, i+1).equals(guess1.substring(i, i+1))) {
				bullCount++;
			}
			else if (secret1.contains(guess1.substring(i, i+1))) {
				cowCount++;
			}
		}
		return (bullCount + " bulls and " + cowCount + " cows");
	}
}
