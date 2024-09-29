package main;

import java.util.ArrayList;

/**
 * Main Method 
 * @author Max
 */
public class Main {
/**
 * String Method 
 * @param args input
 */
	public static void main(String[] args) {
	
		/*int result = sum(sum(15,16), sum(12,13));
		System.out.println(result);
		int result1 = largest(30,3,299);
		System.out.println(result1);
		boolean result2 = isEven(3);
		String result3 = info("Bobby","Sunday");
		System.out.println(result3);
		int result4 = year(2007, 2024);
		System.out.println(result4);/
		*/
		System.out.println(3/2);
		
		
//		Chocolate c1 = new Chocolate(5, "brown", "milk chocolate");
//		shirt s1 = new shirt();
//		c1.SpillOnShirt(s1);
		
		ArrayList<Chocolate1> chocolateArrayList = new ArrayList<Chocolate1>();
			for (int i = 0; i < 20; i++) {
				chocolateArrayList.add(new Chocolate1("milk chocolate" + i , i));
			}
			for (int i = 0; i < chocolateArrayList.size(); i++) {
				System.out.println(chocolateArrayList.get(i).type);
			}
			
			
	}
			
			
	
	/**
	 * Method for adding two numbers 
	 * @param a first number 
	 * @param b second number
	 * @return sum
	 */
	public static int smth (int i) {
		i = 2*i +i; 
		i = 2*i +i; 
		return i;
	}
	
	
	public static int sum(int a, int b) {
		return a + b;
	}
	/**
	 * Method for finding the largest number 
	 * @param e first number
	 * @param f second number 
	 * @param g third number 
	 * @return largest number 
	 */
	public static int largest(int e, int f, int g) {
		if(e >= f&&e >= g)
			return e;
		else if(f >= e&&f >= g)
			return f;
		else
			return g;
		}
	/**
	 * Method for finding even numbers 
	 * @param h number 
	 * @return if number is even 
	 */
	public static boolean isEven(int h) {
		if(h % 2 == 0) {
			System.out.println("interger is even");
			return true; 
		}
		else {
			System.out.println("interger is odd");
			return false; 
		}
		
	}
	public static String info(String name, String date) {
		return ("Hello " + name +", "+ "today is " + date);
	}
	public static int year(int birthyear, int currentyear) {
		return currentyear - birthyear;
	}
	public static int product(int n) {
		if(n<=1) {
			return 1;
		}
		else {
			return n*product(n-2);
		}
	}

	public boolean scoresClump(int[] scores) {
		  for (int i = 0; i <= scores.length - 1; i++) {
		    if(scoresLessThanThree(scores[i],scores[i+1],scores[i+2])==true){
		      return true;
		    }
		  }
		  return false;
		}

		public boolean scoresLessThanTwo(int x, int y) {
		  if(x <= y && x + 2 >= y) {
		    return true;
		  }
		  return false;
		}

		public boolean scoresLessThanThree(int x, int y, int z){
		  if(scoresLessThanTwo(x, y) == true && scoresLessThanTwo(x, z) == true && scoresLessThanTwo(y, z) == true) {
		    return true;
		  }
		  return false;
		}
		
		public int firstHalfAverage(int[] scores) {
			int firstHalfsum = 0;
			  for (int i = 0; i <= scores.length/2; i++) {
				  firstHalfsum += scores[i];
			  }
			  int firstHalfAverage = firstHalfsum/(scores.length/2);
			  return firstHalfAverage;
			}
		
		public int secondHalfAverage(int[] scores) {
			int secondHalfsum = 0;
			  for (int i = (scores.length/2)+1; i <= scores.length; i++) {
				  secondHalfsum += scores[i];
			  }
			  int secondHalfAverage = secondHalfsum/(scores.length/2);
			  return secondHalfAverage;
			}
		
		public int scoresAverage(int[] scores) {
			  if (firstHalfAverage(scores) >= secondHalfAverage(scores)) {
			    return firstHalfAverage(scores);
			  }
			  else 
			    return secondHalfAverage(scores);
			}

		public int wordsCount(String[] words, int len) {
			int count = 0;
			  for(String i : words) {
				  if (i.length() == len) {
					  count++;
				  }
			  }
			  return count;
			}
		
		

	/*
	 * Homework
	 * Write a method that takes in an array, returns an arraylist with only the first five values
	 * If the array have less than 5 values, takes whatever there is.
	 * Kenny kennycheung388@gmail.com
	 */
	
} 
