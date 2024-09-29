package Review1;

public class multiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		table();
	}
		public static void table() {
			for (int i = 1; i < 10; i++) {
				for (int j = 1; j < 10; j++) {
					if (j != 9) {
						System.out.print(i + " * " + j + " = " + i*j + " | ");
					}
					else {
						System.out.print(i + " * " + j + " = " + i*j);

					}
				}
				System.out.println();
			}
		}

}
