package Review1;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.Map.Entry;
public class Hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Basic Functions*/
		/* Hashmap does not retain order, for that use a LinkedHashMap, to receive a order based on integer value or alphabet, use treemap*/
		HashMap<String, Integer> mcdPriceTable = new HashMap<String, Integer>();
		  mcdPriceTable.put("Burger", 5);
		  mcdPriceTable.put("Fries", 3);
		  mcdPriceTable.remove("BigMac");
		  System.out.println(mcdPriceTable.remove("Fries"));
		  System.out.println(mcdPriceTable.get("Burger"));
		  System.out.println(mcdPriceTable.size());
		  
		  for (Entry<String, Integer> entry : mcdPriceTable.entrySet()) {
		   System.out.println(entry.getKey());
		   System.out.println(entry.getValue());
		  }
		  HashMap<String, String> hm = new HashMap<String, String>();
		  hm.put("def", "wef");
		  hm.put("hijl", "wef");
		  hm.put("abc", "wef");
		  for (Map.Entry<String, String> entry : hm.entrySet()) {
		   System.out.println(entry.getKey() + " : " + entry.getValue());
		  }
		  
		  LinkedHashMap<String, String> lhm = new LinkedHashMap<String, String>();
		  lhm.put("def", "wef");
		  lhm.put("hijl", "wef");
		  lhm.put("abc", "wef");
		  for (Map.Entry<String, String> entry : lhm.entrySet()) {
		   System.out.println(entry.getKey() + " : " + entry.getValue());
		  }
		  
		  TreeMap<String, String> tm = new TreeMap<String, String>();
		  tm.put("def", "wef");
		  tm.put("hijl", "wef");
		  tm.put("abc", "wef");
		  for (Map.Entry<String, String> entry : tm.entrySet()) {
		   System.out.println(entry.getKey() + " : " + entry.getValue());
		  }
	}
	
}
