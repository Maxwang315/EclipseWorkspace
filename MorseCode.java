
import java.util.Scanner;

import java.util.ArrayList;
import java.util.Arrays;

public class MorseCode {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Input morse code or English, upper case only!");
		String input = sc.nextLine();
		System.out.println(morseCodeConverter(input));
	}
	
	static String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
	static String english = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890?!.,;:+-/=";
	static String[] morseCode = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..", ".----", "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----.", "-----", "..--..", "-.-.--", ".-.-.-", "--..--", "-.-.-.", "---...", ".-.-.", "-....-", "-..-.", "-...-"};
	
	public static String morseCodeConverter(String input) {
		boolean ifEnglish = false;
		StringBuilder stb = new StringBuilder();
		String[] input1 = input.split("");
		for (int i = 0; i < input1.length; i++) {
			if (letters.indexOf(input1[i]) != -1) {
				ifEnglish = true;
				break;
			}
		}
		if (ifEnglish) {
			for (int i = 0; i < input1.length; i++) {
				if (input1[i].equals(" ")) {
					stb.append("/");
					stb.append(" ");
				}
				else if ((english.indexOf(input1[i]) != -1) && !(input1[i].equals(" "))) {
					stb.append(morseCode[english.indexOf(input1[i])]);
					stb.append(" ");
				}
				else {
					return("This character is not in the code");
				}
			}
			String morse = stb.toString();
			return morse;
		}
		else {
			String[] input2 = input.split(" ");
			for (int i = 0; i < input2.length; i++) {
				if (input2[i].equals("/")) {
					stb.append(" ");
				}
				else if (Arrays.asList(morseCode).contains(input2[i])) {
					stb.append(english.substring(Arrays.asList(morseCode).indexOf(input2[i]), Arrays.asList(morseCode).indexOf(input2[i])+1));
				}
				else {
					return("This character is not in the code");
				}
			}
			String eng = stb.toString();
			return eng;
		}
	}
	
}
