package J3;

import java.util.Scanner;


public class secretInstruction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Boolean a = true;
		String previous = " ";
		while (a) {
			String instruction = sc.nextLine();
			if (Integer.valueOf(instruction) == 99999) {
				a = false;
			}
			else {
				if (((Integer.valueOf(instruction.substring(0, 1)) + Integer.valueOf(instruction.substring(1, 2)))== 0)) {
					System.out.println(previous + instruction.substring(2, 5));
				}
				else if (((Integer.valueOf(instruction.substring(0, 1)) + Integer.valueOf(instruction.substring(1, 2))) % 2 == 0)) {
					System.out.println("right " + instruction.substring(2, 5));
					previous = "right ";
				}
				else if (((Integer.valueOf(instruction.substring(0, 1)) + Integer.valueOf(instruction.substring(1, 2))) % 2 != 0)) {
					System.out.println("left " + instruction.substring(2, 5));
					previous = "left ";
				}
			}
		}
	}
}
