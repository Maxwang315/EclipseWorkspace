package Review1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Review1a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char a = 'A';
		String b = "Apple";
		char[] chars = b.toCharArray();
		String[] sa = new String[] {"a", "b", "c", "d"};
		char[] ca = new char[] {'a', 'b', 'c'};
//		for (int i = 0; i < chars.length; i++) {
//			System.out.println(chars[i]);
//		}
		List<String> Chars1 = Arrays.asList(sa);
		
//		System.out.println(Chars1.getClass().getName());
		
//		for (int i = 0; i < Chars1.size(); i++) {
//			System.out.println(Chars1.get(i));
//		}
		
		long l = 10291031;
		
//		System.out.println(leapYear(3));
//		
		
		
		Scanner sc = new Scanner(System.in);
		  int x = Integer.valueOf(sc.nextLine());
		  int y = Integer.valueOf(sc.nextLine());		  
		  int z = Integer.valueOf(sc.nextLine());		
		  
		System.out.println(cellCost(x, y, z));
//		  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		  try {
//		   System.out.println(br.readLine());
//		   
//		   
//		  }
//		  catch (IOException e) {
//		   System.out.println(e.toString());
//		  }
		
		/*
		 * The year that is a multiple of 4 is usually a leap year.
		 * Note that for those multiple of hundreds, it has to be a multiple of 400 to be a leap year.
		 * For example, 1900 is not a leap year, 2000 is a leap year.
		 * Write a method to determine whether a year is a leap year, takes in an integer value, return boolean value
		 */
		
		/*
		 * Input two number, find all prime numbers within that range
		 * Prime number: only have 2 divisor, 1 and itself
		 */
		
//		outerLoop:
//		for (int i = 0; i < 5; i++) {
//			for (int j = 0; j < 5; j++) {
//				System.out.println("s");
//				continue outerLoop;
//			}
//		}
		
		/*
		 * An armstrong number is an n-digit number that is equal to the sum of the nth powers of its digits. 
		 * e.g. 1^3 + 5^3 + 3^3 = 153
		 * The Armstrong number smaller than 1000: 1, 2, 3, 4, 5, 6, 7, 8, 9, 153, 370, 371, 407
		 * Write a method that takes inclusive range, returns an ArrayList of Integers that are Armstrong Numbers
		 */
		
//		ArrayList<Integer> armstrongs = armstrongNumbers(1, 1000);
//		for (int i = 0; i < armstrongs.size(); i++) {
//			System.out.println(armstrongs.get(i));
//		}
		
	}
	public static boolean leapYear(int year) {
		if (year%100 == 0) {
			if (year%4 == 0 && year%400 == 0) {
				return true;
			}
		}
		else if (year%4 == 0) {
			return true;
		}
		return false;
	}
	
	public static int[] primeNumber(int a, int b) {
		ArrayList<Integer> primes = new ArrayList<Integer>();
		for (int i = a; i <= b; i++) {
			boolean prime = true;
			if (i == 1) {
				prime = false;
			}
			for (int j = 2; j < i; j++){
				if (i%j == 0) {
					prime = false;
				}
			}
			if (prime == true) {
				primes.add(i);
			}
		}
		int[]primes1 = new int[primes.size()];
		for (int k = 0; k < primes.size(); k++) {
			primes1[k] = primes.get(k);
		}
		return primes1;
	}
	
	public static ArrayList<Integer> armstrongNumbers(int a, int b) {
		ArrayList<Integer>armstrong = new ArrayList<Integer>();
		for (int i = a; i <= b; i++) {
			int k = 0;
			int power = String.valueOf(i).length();
			int constant = power;
			while(power >= 1) {
				k += Math.pow((int)((i/Math.pow(10, power-1))%10), constant);
				power--;
			}
			if (i == k) {
				armstrong.add(k);
			}
		}
		return armstrong;
	}
	
	public static String cellCost(int dayTime, int evening, int weekend) {
		double planACost = 0;
		double planBCost = 0;
		if (dayTime - 100 > 0) {
			double planACost1 = (dayTime-100)*0.25 + evening*0.15 + weekend*0.20;
			planACost = planACost1;
		}
		else {
			double planACost1 = evening*0.15 + weekend*0.20;
			planACost = planACost1;
		}
		if (dayTime - 250 > 0) {
			double planBCost1 = (dayTime-250)*0.45 + evening*0.35 + weekend*0.25;
			planBCost = planBCost1;
		}
		else {
			double planBCost1 = evening*0.35 + weekend*0.25;
			planBCost = planBCost1;
		}
		planACost = (Math.round(planACost*100))/100.00;
		planBCost = (Math.round(planBCost*100))/100.00;
		
		String planACostStr = String.format("%.2f", planACost);
		String planBCostStr = String.format("%.2f", planBCost);

		if (planACost < planBCost) {
			return "Plan A costs " + planACostStr + "\n" + "Plan B costs " + planBCostStr + "\n" + "Plan A is cheapest.";
		}
		else if (planBCost < planACost) {
			return "Plan A costs " + planACostStr + "\n" + "Plan B costs " + planBCostStr + "\n" + "Plan B is cheapest.";
		}
		else {
			return "Plan A costs " + planACostStr + "\n" + "Plan B costs " + planBCostStr + "\n" + "Plan A and B are the same price.";

		}
	}
	

}
