package main;

public class Codingbat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	public int diff21(int n) {
		if (n < 21)
			return 21 - n;
		else 
			return (n-21)*2;
	}
	public boolean parrotTrouble(boolean talking, int hour) {
		if (talking == true && hour > 20)
			return true;
		if (talking == true && hour < 7)
			return true;
		else 
			return false;
		
	}
	public boolean makes10(int a, int b) {
		if (a == 10 || b == 10 || a + b == 10)
			return true;
		else 
			return false;
	}
	public boolean nearHundred(int n) {
		return (100 - n <= Math.abs(10)|| 200 - n <= Math.abs(10));  
	}
	public String everyNth(String str, int n) {
		String pattern = "";
		for (int i = 0; i < str.length(); i+=n) {
			pattern += str.substring(i, i+1);
		}
		return pattern;
	}
	public int countEvens(int[] nums) {
		int counter = 0;
		for (int number : nums) {
			if (number % 2 == 0)
				counter += 1;
		}
		return counter;
	}
	public int bigDiff(int[] nums) {
		int difference = 0;
		int greatest = nums[0];
		int least = nums[0];
		for (int number : nums) {
			if (number > greatest) 
				greatest = number;
			least = Math.min(number, least);
		} 
		difference = greatest - least;
		return difference;
	}
	public int centeredAverage(int[] nums) {
		int greatest = nums[0];
		int least = nums[0];
		int value = 0;
		int sum = 0;
		int mean = 0;
		for (int number : nums) {
			greatest = Math.max(number, greatest);
			least = Math.min(number, least);
			value += number;
			sum = value - greatest - least;
		} 
		mean = sum / (nums.length - 2);
		return mean;
	}
}
