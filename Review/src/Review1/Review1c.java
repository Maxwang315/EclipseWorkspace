package Review1;

import java.security.KeyException;
import java.util.Scanner;
public class Review1c {

	public static void main(String[] args) {
		/*
		 * Format a paragraph into an html paragraph
		 * Input:
		 * n (number of lines)
		 * Line|tag1,tag2,tag3...
		 * Example:
		 * 2
		 * This ia a header|h1
		 * This is a paragraph|p,strong,a
		 * Output:
		 * <h1>This is a header</h1><br><p><strong><a>This is a paragraph</a></strong></p>
		 */
		Dictionary dict = new Dictionary();
		try {
			dict.addDefinition("Burger", "Two buns one meat");
			dict.addDefinition("Fries", "2 dollars");
			System.out.println(dict.getExplanation("Burger")); // print Two buns one meat
			dict.addDefinition("Burger", "Fake Explanation"); // Throw KeyError exception
		} catch (KeyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		String html = "";
		int lines = Integer.valueOf(sc.nextLine());
		for (int i = 0; i < lines; i++) {
			String line = sc.nextLine();
			sb.append(line(line));
			if (i != lines -1) {
				sb.append("<br>");
			}
		}
		html = sb.toString();
		sb.setLength(0);
		System.out.println(html);
		
//		Integer[] arr = new Integer[] { 3, 4, 2, 1};
//		  String[] strArr = new String[] {"g", "d", "c"};
//		  List<Integer> arrList = Arrays.asList(arr);
//		  List<String> strArrList = Arrays.asList(strArr);
//		  arrList.sort(null);
//		  strArrList.sort(null);
//		  System.out.println(arrList.get(0));
//		  System.out.println(strArrList.get(0));
//		
	}
	public static String line(String s) {
		String tag = s.substring(s.indexOf("|")+1, s.length());
		String text = s.substring(0, s.indexOf("|"));
		String[] tags = tag.split(",");
		for (int i = tags.length-1; i >= 0; i--) {
			text = String.format("<%s>%s</%s>", tags[i], text, tags[i]);
		}
		return text;
	}
}
