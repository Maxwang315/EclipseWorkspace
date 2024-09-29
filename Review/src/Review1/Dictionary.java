package Review1;

import java.security.KeyException;
import java.util.ArrayList;

public class Dictionary {
	private ArrayList<Definition> dictionary;
	public Dictionary() {
		dictionary = new ArrayList<Definition>();
	}
	public String getExplanation(String keyValue) throws KeyException {
		for (int i = 0; i < dictionary.size(); i++) {
			if ((dictionary.get(i).getkeyValue()).equals(keyValue)) {
				return dictionary.get(i).getExplanation();
			}
		}
		throw new KeyException("Key not in Dictionary");
	}
	
	public void addDefinition (String keyValue, String explanation) throws KeyException {
		for (int i = 0; i < dictionary.size(); i++) {
			if ((dictionary.get(i).getkeyValue()).equals(keyValue)) {
				throw new KeyException("Duplicate Key");
			}
		}
		dictionary.add(new Definition(keyValue, explanation));
	}
}

