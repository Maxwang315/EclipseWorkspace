package main;

public class shirt {

	String size = "XL";
	String color = "black";
	boolean fancy = true;
	
	public void wearing() {
		System.out.println("Swoosh");
	}
	public void examine() {
		System.out.println("nice shirt");
	}
	public void chocolateSpilledOnShirt(Chocolate chocolate) {
		System.out.println("Oh no, I got " + chocolate.type + " on my shirt");
	}
}
