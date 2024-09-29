package Review1;

public class rabbit_chicken {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		rabbit_chicken();
	}
	public static void rabbit_chicken() {
		for (int r = 0; r < 36; r++) {
			for (int c = 0; c < 36; c++) {
				if (r*4 + c*2 == 94 && r+c == 35) {
					System.out.println("There are " + r + " rabbits and " + c + " chickens.");
				}
			}
		}
		
	}
}
