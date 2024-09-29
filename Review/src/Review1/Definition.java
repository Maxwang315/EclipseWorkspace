package Review1;

public class Definition {
	/*
	   * Requirement 1: Contains multiple kvps
	   * Requirement 2: Extract value with given key
	   * Requirement 3: No duplicate key
	   */
	private String keyValue;
	private String explanation;
	public Definition(String keyValue, String explanation) {
		this.keyValue = keyValue;
		this.explanation = explanation;
	}
	
	public String getExplanation() {
		return explanation;
	}
	
	public String getkeyValue() {
		return keyValue;
	}
}


//Main {
//	Dictionary dict = new Dictionary();
//	dict.add("Burger", "Two buns one meat");
//	dict.add("Fries", "2 doollars");
//	System.out.println(dict.get("Burger")); // print Two buns one meat
//	dict.add("Burger", "Fake Explanation"); // Throw KeyError exception
//	
//	
