package J3;
import java.util.Map;
import java.util.NavigableSet;
import java.util.TreeMap;
import java.util.Scanner;

public class Bronze {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int people = Integer.valueOf(sc.nextLine());
		int[] scores = new int[people];
		for (int i = 0; i < people; i++) {
			scores[i] = Integer.valueOf(sc.nextLine());
		}
		int[] bronze = Bronze(people, scores);
		System.out.print(bronze[0]);
		System.out.print(" ");
		System.out.print(bronze[1]);

	}
	public static int[] Bronze (int people, int[] scores) {
		TreeMap<Integer, Integer> scoreCount = new TreeMap<Integer, Integer>();
		for (int i = 0; i < scores.length; i++) {
			if (!scoreCount.containsKey(scores[i])) {
				scoreCount.put(scores[i], 1);
			}
			else {
				scoreCount.put(scores[i], scoreCount.get(scores[i])+1);
			}
		}
		int[] Bronze = new int[2];
		
		NavigableSet<Integer> a = scoreCount.descendingKeySet();
		int keyCounter = 0;
		for (Integer key : a) {
			if (keyCounter == 2) {
				Bronze[0] = key;
				Bronze[1] = scoreCount.get(key);
				break;
			}
			keyCounter++;
		}
		return Bronze;
	}
}
