package classes;

public class Dog extends Pets implements IBreatheAir{
	public Dog(String name, int age, String color) {
		super(name, age);
		this.color = color;
	}

	private String color; 
	
	public void run() {
	}

	public String speak() {
		return "Hi, my name is";
	}


	public void IBreatheAir() {
	}
	
	public boolean equals(Object other) {
		if (super.equals(other) == false) {
			return false;
		}
		if (getClass() != other.getClass()) {
			return false;
		}
		Dog other1 = (Dog)other;
		if (color == null) {
			if (other1.color != null)
			    return false;
		} 
		else if (!color.equals(other1.color)) {
			return false;
		}
			
		return true;
	}
	public String toString() {
		return String.format("Name: %s, Age: %s, Color: %s", age, color);
	}
}
