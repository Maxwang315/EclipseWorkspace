package classes;
import java.util.List;
import java.util.ArrayList;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog one = new Dog("April", 6, "white");
		Dog two = new Dog("April", 6, "white");
		System.out.println(one.equals(two));

		System.out.println(one);
		String[]words = new String[4];
		words[0] = "aaa";
		words[1] = "aa";
		words[2] = "a";
		words[3] = "aaa";
		
		
		
		System.out.println(wordsWithoutList(words, 3));
		
		System.out.println(128/10);
		
		//Generics1<Integer> Numbers = new Generics1<Integer>();
		
		//Dog dog = new Dog("a", 8, "a");
		
		int[] list = new int[6];
		list[0] = 19;
		list[1] = 35;
		list[2] = 10;
		list[3] = 2;
		list[4] = 40;
		list[5] = 4;
		
		String[] word = toMorseCode("a");
		for (int i = 0; i < word.length; i++) {
			System.out.println(word[i]);
		}
		
	}
		
	public static List wordsWithoutList(String[] words, int len) {
		ArrayList<String> words1 = new ArrayList<String>();
		for (String word : words) {
			if (word.length() != len) {
				words1.add(word);
			}
		}
		return words1;
	}
	public boolean dividesSelf(int n) {
		if (n <= 9) {
			if(n/n==0) {
				return true;
			}
			return false;
		}
		if (n%(n/10) == 0) {
			return dividesSelf(n/10);
		}
		else 
			return false;
	}
	
	public int[] copyEndy(int[] nums, int count) {
		int[] Endy = new int[count];
		int endyCount = 0; 
		for (int i = 0; i < nums.length; i++) {
			if ((isEndy(nums[i])== true)&& endyCount < count) {
				Endy[endyCount] = nums[i];
				endyCount++;
			}
		}
		return Endy;
	}
	
	public boolean isEndy(int n) {
		if ((n >= 0 && n <= 10)||(n >= 90 && n <= 100)) {
			return true;
		}
		return false;
	}
	
	public int matchUp(String[] a, String[] b) {
		int count = 0; 
		for (int i = 0; i < a.length; i++) {
			if (a[i]!= "" && b[i] != "") {
				if (a[i].charAt(0)==b[i].charAt(0)) {
					count++; 
				}
			}
			
		}
		return count; 
	}
	
	public static String[] toMorseCode(String words) {
		String MorseA = ".-";
		String MorseB = "-...";
		String MorseC = "-.-.";
		String MorseD = "-..";
		String MorseE = ".";
		String MorseF = "..-.";
		String MorseG = "--.";
		String MorseH = "....";
		String MorseI = "..";
		String MorseJ = ".---";
		String MorseK = "-.-";
		String MorseL = ".-..";
		String MorseM = "--";
		String MorseN = "-.";
		String MorseO = "---";
		String MorseP = ".--.";
		String MorseQ = "--.-";
		String MorseR = ".-.";
		String MorseS = "...";
		String MorseT = "-";
		String MorseU = "..-";
		String MorseV = "...-";
		String MorseW = ".--";
		String MorseX = "-..-";
		String MorseY = "-.--";
		String MorseZ = "--..";
		String space = "";
		char[] words1 = words.toCharArray();
		String[] words2 = new String[words1.length];
		String[] words3 = new String[words1.length];
		for (int i = 0; i < words.length(); i++) {
			words2[i] = String.valueOf(words1[i]);
		}
		for (int i = 0; i < words.length(); i++) {
			if (words2[i] == "") {
				space = words3[i];
			}
			if (words2[i] == "a") {
				MorseA = words3[i];
			}
			if (words2[i] == "b") {
				MorseB = words3[i];
			}
			if (words2[i] == "c") {
				MorseC = words3[i];
			}
			if (words2[i] == "d") {
				MorseD = words3[i];
			}
			if (words2[i] == "e") {
				MorseE = words3[i];
			}
			if (words2[i] == "f") {
				MorseF = words3[i];
			}
			if (words2[i] == "g") {
				MorseG = words3[i];
			}
			if (words2[i] == "h") {
				MorseH = words3[i];
			}
			if (words2[i] == "i") {
				MorseI = words3[i];
			}
			if (words2[i] == "j") {
				MorseJ = words3[i];
			}
			if (words2[i] == "k") {
				MorseK = words3[i];
			}
			if (words2[i] == "l") {
				MorseL = words3[i];
			}
			if (words2[i] == "m") {
				MorseM = words3[i];
			}
			if (words2[i] == "n") {
				MorseN = words3[i];
			}
			if (words2[i] == "o") {
				MorseO = words3[i];
			}
			if (words2[i] == "p") {
				MorseP = words3[i];
			}
			if (words2[i] == "q") {
				MorseQ = words3[i];
			}
			if (words2[i] == "r") {
				MorseR = words3[i];
			}
			if (words2[i] == "s") {
				MorseS = words3[i];
			}
			if (words2[i] == "t") {
				MorseT = words3[i];
			}
			if (words2[i] == "u") {
				MorseU = words3[i];
			}
			if (words2[i] == "v") {
				MorseV = words3[i];
			}
			if (words2[i] == "w") {
				MorseW = words3[i];
			}
			if (words2[i] == "x") {
				MorseX = words3[i];
			}
			if (words2[i] == "y") {
				MorseY = words3[i];
			}
			if (words2[i] == "z") {
				MorseZ = words3[i];
			}
		}
		return words3;
	}
	
	
				



	
}
