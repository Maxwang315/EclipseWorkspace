package main;
import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		double s = 1.1;
		double a = 1.2;
		
		
		System.out.println(404/10);
		
	whatsItDo("WATCH");
	
	String x = "abcde";
	String y = "b";
	System.out.println(x.substring(3));

	}
	public static void whatsItDo (String str) {
		int len = str.length();
		if (len > 1) {
			String temp = str.substring(0, len -1);
			whatsItDo(temp);
			System.out.println(temp);
		}
	}

}
