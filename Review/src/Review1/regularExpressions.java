package Review1;

import java.util.regex.*;

public class regularExpressions {

	public static void main(String[] args) {
		// example@gmail.com
		String email = "eXample,2@gmail.com";
		
		String regex = "([A-Za-z0-9,]+)@([A-Za-z0-9,]+).[A-Za-z0-9,]+";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(email);
		
		if (matcher.matches()) {
			System.out.println("Matched");
			System.out.println(matcher.group(1));
			System.out.println(matcher.group(2));
		} else {
			System.out.println("Not matching");
		}
	}

}
