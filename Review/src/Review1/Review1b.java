package Review1;

import java.util.ArrayList;
import java.util.Scanner;

public class Review1b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> armstrongs = armstrongNumbers(1, 1000);
		for (int i = 0; i < armstrongs.size(); i++) {
			System.out.println(armstrongs.get(i));
		}
		
		System.out.println(reverse(1999));
		
		System.out.println("ABC" + " DEF" + " " + "GHI");	
		
		// String.format with %s or %d or others
		System.out.println(String.format("%s %s", "ABC", "DEF"));
		
		// StringBuilder
		StringBuilder sb = new StringBuilder();
		sb.append("ABC");
		sb.append(" ");
		sb.append("CDE");
		System.out.println(sb.toString());
		sb.setLength(0);
	}
	public static ArrayList<Integer> armstrongNumbers(int a, int b) {
		ArrayList<Integer>armstrong = new ArrayList<Integer>();
		for (int i = a; i <= b; i++) {
			int k = 0;
			int power = String.valueOf(i).length();
			int constant = power;
			
			int num = i;
			// while(power >= 1) {
			//	k += Math.pow((int)((i/Math.pow(10, power-1))%10), constant);
			//	power--;
			//}
			while (num > 0) {
				int digit = num % 10;
				k += Math.pow(digit, constant);
				num /= 10;
			}
			
			if (i == k) {
				armstrong.add(k);
			}
		}
		return armstrong;
	}
	
	public static int reverse(int a) {
		String b = "";
		while (a > 0) {
			int digit = a % 10;
			b += String.valueOf(digit);
			a /= 10;
		}
		return Integer.valueOf(b);
	}
	
	public static String BMI (double weight, double height) {
		if (weight/(height*height) > 25) {
			return "Overweight";
		}
		else if (weight/(height*height) < 18.5) {
			return "Underweight";
		}
		else {
			return "Normal weight";
		}
	}
	
	public static String ISBN (int x, int y, int z) {
		int ISBN = 0;
		String constant = "9780921418";
		for (int i = 0; i < 10; i += 2) {
			ISBN += Integer.valueOf(constant.substring(i, i+1));
		}
		for (int i = 1; i < 11; i += 2) {
			ISBN += Integer.valueOf(constant.substring(i, i+1))*3;
		}
		ISBN += (x + z);
		ISBN += 3*y;
		return ("The 1-3-sum is " + ISBN);
	}
}
