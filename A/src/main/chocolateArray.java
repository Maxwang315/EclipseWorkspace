package main;

public class chocolateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] type = new String[6];
		type[0] = "milk chocolate";
		type[1] = "dark chocolate";
		type[2] = "almond chocolate";
		type[3] = "orange chocolate";
		type[4] = "caramel chocolate";
		type[5] = "Oreo chocolate";
		
		int[] sweetLevel = new int[6];
		sweetLevel[0] = 5;
		sweetLevel[1] = 2;
		sweetLevel[2] = 4;
		sweetLevel[3] = 3;
		sweetLevel[4] = 7;
		sweetLevel[5] = 6;
		
		Chocolate1[] testResult = chocolateArray(type, sweetLevel);
		for (int i = 0; i < testResult.length; i++) {
			System.out.println(testResult[i].type + " chocolate with a sweet level of " + testResult[i].sweetLevel);
		}
	}
	
	public static Chocolate1[] chocolateArray(String[] type, int[] sweetLevel) {
		Chocolate1[] chocolate = new Chocolate1[type.length];
		for (int i = 0; i < type.length; i++) {
			chocolate[i] = new Chocolate1(type[i], sweetLevel[i]);
		}
		return chocolate;
	}

}
