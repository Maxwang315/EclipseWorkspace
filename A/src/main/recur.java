package main;

public class recur {

	public static void main(String[] args) {
		System.out.println(Sentence("Hi, I'm Kenny"));
		
		//System.out.println(Merge(12345));
		
		String[] splittedChunks = "abc de f".split(" ");
		System.out.println(splittedChunks[0]);
		System.out.println(splittedChunks[1]);
		System.out.println(splittedChunks[2]);
		
		System.out.println(12345%10);
		 
	}
	public static int factorial(int n) {
		if (n == 1) {
			return 1;
		}
		return n * factorial(n-1);
	}
	public static int fibonacci(int n) {
		if (n==1) {
			return 0;
		}
		if (n==2) {
			return 1;
		}
		return fibonacci(n-1)+fibonacci(n-2);
	}
	public static boolean P(String a) {
	
		if (a.length() <= 1)
			return true;
		else if ((a.substring(0, 1)).equals(a.substring(a.length()-1,a.length()))) 
			return P(a.substring(1, a.length()-1));  
		else
			return false;
	}
	 
	
	public static int GCDRecur(int num1, int num2) {

		int bigger = Math.max(num1, num2);
		int smaller = Math.min(num1, num2);
		int remainder = bigger % smaller;
		if (remainder == 0)
			return smaller;
		else 
			return GCDRecur(smaller, remainder);
	}
	
	public static String reverse(String a) {
		if(a.length()<2) {
			return a;
		}
		String lastletter = a.substring(a.length()-1, a.length());
		String firstletter = a.substring(0,1);
		String middle = a.substring(1,a.length()-1);
		return lastletter + reverse(middle) + firstletter;
	}
	
	
	public static int Merge(int a) {
		if (a < 10)
			return a;
		String Merge = String.valueOf(a);
		int sum = 0;
		for (int i = 1; i < Merge.length(); i+=2) {
			int tempsum = Integer.valueOf(Merge.substring(i-1,i))+ Integer.valueOf(Merge.substring(i,i+1));
			sum += tempsum;
		}
		if (Merge.length() % 2 == 1) 
			sum += Integer.valueOf(Merge.substring(Merge.length() - 1));
		return Merge(sum);
	}
	
	
	public static boolean Sentence(String a) {
		if (Character.isLowerCase(a.charAt(0))) 
			return false;
		int firstOccurSpace = a.indexOf(" ");
		if (firstOccurSpace == -1)
			return true;
		else
			return Sentence(a.substring(firstOccurSpace + 1));
	}
	
	
}
