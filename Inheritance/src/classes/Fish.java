package classes;

public class Fish extends Pets{
	private int speed;
	
	public Fish(String name, int age, int speed) {
		super(name, age);
		this.speed = speed;
	}
	
	public void swim() {
		
	}
	public String fishSpeak() {
		return "blub";
	}
	public String speak() {
		return "blub";
	}
}
