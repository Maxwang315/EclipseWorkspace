package classes;
import java.util.ArrayList;

public class Generics1<T> {
	ArrayList<T> GenericsList = new ArrayList<T>();
	
	
	public ArrayList<T> return10() {
		ArrayList<T> tenValuesList = new ArrayList<T>();
		for (int i = 0; i <= 9; i++) {
			tenValuesList.add(GenericsList.get(i));
		}
		return tenValuesList;
	}
	
	public void swapfirst(T n) {
		GenericsList.remove(0);
		GenericsList.add(0, n); 
	}
}


