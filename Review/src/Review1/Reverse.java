package Review1;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] nums = {{1, 2, 3},{4, 5, 6},{7, 8, 9}};
		int[][] newNums = reverse2D(nums);
		for (int i = 0; i < newNums.length; i++) {
			for (int j = 0; j < newNums[0].length; j++) {
				System.out.print(newNums[i][j]);
			}
		}
	}
	public static int[] reverse(int[] nums) {
		int[] newNums = new int[nums.length];
		int m = 0;
		for (int i = nums.length-1; i >= 0; i--) {
			newNums[m] = nums[i];
			m++;
		}
		return newNums;
	}
	public static int[][] reverse2D(int[][] nums) {
		int[][] newNums = new int[nums.length][nums[0].length];
		for (int i = 0; i < nums.length; i++) {
			newNums[newNums.length - i - 1] = reverse(nums[i]);
		}
		return newNums;	
	}
}
