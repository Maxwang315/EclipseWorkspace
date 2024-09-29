package classes;

public abstract class Pets {
	private String name; 
	protected int age; 

	public Pets(String name, int age) {
		this.name = name;
		this.age = age; 
	}
	public abstract String speak();
	

	public boolean equals(Object other) {
		if (other == null) {
			return false;
		}
		if (getClass() != other.getClass())
			return false;
		Pets other1 = (Pets)other;
		if (name == null) {
			if (other1.name != null)
			    return false;
		} else if (!name.equals(other1.name))
			return false;
		if (age != other1.age) {
			return false;
		}
		return true;
	}
	
}


