package main;

public class Chocolate {
	private int sweetLevel = 5;
	private String colour = "brown";
	private String type = "milk chocolate";
	
	public Chocolate(int sweetLevel, String colour, String type) {
		this.sweetLevel = sweetLevel;
		this.colour = colour;
		this.type = type;
	}
	
	public Chocolate() {
		this(5, "brown", "milk chocolate");
	}
	
	public void SpillOnShirt(shirt s) {
		s.chocolateSpilledOnShirt(this);
	}
	
	public void BeBroken() {
		System.out.println("crack");
	}
	
	public void eaten() {
		System.out.println("Yummy");
	}
	
	public String getType() {
		return type;
	}
	
	public int getSweetLevel() {
		return sweetLevel;
	}
	public String getColour() {
		return colour;
	}
	
}

