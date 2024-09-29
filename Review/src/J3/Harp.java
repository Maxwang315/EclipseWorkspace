package J3;
import java.util.Scanner;
import java.util.ArrayList;

public class Harp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		ArrayList<String> outputs = new ArrayList<String>();
		int i = 0;
		while (i <= input.length()-2) {
			if (Character.isDigit(input.charAt(i))&&(!Character.isDigit(input.charAt(i+1)))) {
				outputs.add(input.substring(0, i+1));
				input = input.substring(i+1);
				i = 0;
			}
			else if (i == input.length()-2) {
				outputs.add(input);
			}
			i++;
		}
		String[] a = new String[2];
		for (int k = 0; k < outputs.size(); k++) {
			if (outputs.get(k).contains("+")) {
				a = outputs.get(k).split("\\+");
				outputs.set(k, a[0] + " tighten " + a[1]);
			}
			else if (outputs.get(k).contains("-")) {
				String c = outputs.get(k).substring(0,outputs.get(k).indexOf("-"));
				String b = outputs.get(k).substring(outputs.get(k).indexOf("-")+1, outputs.get(k).length());
				outputs.set(k, c + " loosen " + b);
			}
		}
		for (int m = 0; m < outputs.size(); m++) {
			System.out.println(outputs.get(m));
		}
	}
	
}
