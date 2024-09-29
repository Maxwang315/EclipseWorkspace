package main;
import java.util.Scanner;

public class StringArray {

	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "December"; 
		for (int i = 0; i < a.length()-2; i++) {
			System.out.println(a.substring(i, i+3));
		}
		//int result = b("November", "x");
		//System.out.println(result);
		
		c("October");
		
		String[] wordArray = new String [3];
		wordArray[0] = "Monday";
		wordArray[1] = "Tuesday";
		wordArray[2] = "Wednesday";
		String[] result = ReplaceVowels(wordArray, "o", "aeiou");
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
		
	System.out.println("Please enter your message you want to encryipt:");
	String userInput = sc.nextLine();
		
		System.out.println("Please enter your encryiption key in integer:");
		int key = 0;
		boolean keyAccepted = false;
		while (!keyAccepted) {
			try {
				key = Integer.parseInt(sc.nextLine());
				keyAccepted = true;
			} catch (Exception e) {
				System.out.println("Please enter a number! Retry:");
			}
		}
		String result1 = encryption(userInput, key);
		System.out.println(result1);
	}
		
	public static int b(String word, String pattern) {
		return word.indexOf(pattern);
	}
	public static void c(String x) {
		for(int i = 0; i < x.length(); i+=2) {
			System.out.print(x.substring(i, i+1));
		}
		System.out.println();
	}
	public static String[] ReplaceVowels(String[] b, String replacement, String pattern) {
		String[] result = new String[3];
		for(int i = 0; i < b.length; i++) {
			String tempResult = "";
			for(int j = 0; j < b[i].length(); j++) {
				if (pattern.indexOf(b[i].substring(j,j+1))!= -1) {
					tempResult += replacement;
				} else {
					tempResult += b[i].substring(j,j+1);
				}
			}
			result[i] = tempResult;
		}
		return result;
	}
	public static String encryption(String originalWord, int key) {
		String letters = "abcdefghijklmnopqrstuvwxyz";
		String tempResult = "";
		char[] wordInChars = originalWord.toCharArray();
		for(int i = 0; i < originalWord.length(); i++) {
			if (!Character.isLetter(wordInChars[i])) {
				tempResult += wordInChars[i];
				continue;
			}
			String originalLetter = originalWord.substring(i, i+1);
			boolean isUpper = false;
			
			if (Character.isUpperCase(wordInChars[i]))
				isUpper = true;
			
			originalLetter = originalLetter.toLowerCase();
			
			int originalPos = letters.indexOf(originalLetter);
			int targetPos = originalPos + key;
			while(targetPos < 0) {
				targetPos += 26;
			}
			String targetLetter = letters.substring(targetPos, targetPos+1);
			if (isUpper) 
				targetLetter = targetLetter.toUpperCase();
			tempResult += targetLetter;
		}
		return tempResult;
	}
	/*
	 * In-Class:
	 * Build a method that takes in an array of strings and a string replacement
	 * 1) process and return the new array
	 * 2) For each strings inside the array, replace all the vowels with replacement
	 * Example:
	 * {"Kenny", "Max"}, "o"
	 * => {"Konny", "Mox"}
	 * Hint:
	 * 1) You cannot change a string's value, can only create a new string with the letters you need
	 * 
	 */
	
	
}
