package Review1;

public class OneToFiveBricks {

	/*
	 * We want to make a row of bricks that is goal inches long. We have a number of small bricks (1 inch each)
	 * and big bricks (5 inches each). Return True if possible to make the goal by choosing from the given bricks.
	 * Input: 
	 * NumSmallBrick NumBigBrick Goal
	 * 3 1 8
	 * Output:
	 * True
	 * 
	 * Input:
	 * 3 1 9
	 * Output:
	 * False
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(bricks(4, 4, 25));
	}
	public static boolean bricks(int small, int large, int goal) {
		int largeNeeded = goal/5;
		int smallNeeded = goal%5;
		if (large >= largeNeeded) {
			if (small >= smallNeeded) {
				return true;
			}
			else {
				return false;
			}
		}
		else {
			if (small >= (largeNeeded - large)*5) {
				return true;
			}
			else {
				return false;
			}
		}
	}
}
