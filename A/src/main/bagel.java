package main;

public class bagel {
	private int size; 
	private String flavour;
	public boolean isGood; 
	public bagel(int size, String flavour, boolean isGood) {
		this.size = size;
		this.flavour = flavour; 
		this.isGood = isGood;
	}	
	
	public static String biteOnBagel() {
		return "crunch";
	}
	
	public String isBagelGood(boolean isGood) {
		if(isGood == true) {
			return "it's a good bagel";
		}
		else 
			return "this bagel sucks";
	}
	
	public int GetSize() {
		return size;
	}
	
	public void SetFlavour(String flavour) {
		this.flavour = flavour;
	}
}
