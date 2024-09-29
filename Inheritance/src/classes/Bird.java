package classes;

public class Bird extends Pets implements IBreatheAir  {
	public Bird(String name, int age, int wingspan) {
		super(name, age);
		this.wingspan = wingspan;
		// TODO Auto-generated constructor stub
	}

	private int wingspan; 
	
	public void fly() {
		
	}

	@Override
	public String speak() {
		// TODO Auto-generated method stub
		return null;
	}

	
	public void IBreatheAir() {
	}
}
