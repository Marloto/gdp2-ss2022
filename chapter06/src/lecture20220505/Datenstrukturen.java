package lecture20220505;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Datenstrukturen {
	public static void main(String[] args) {
		Collection<String> arr = new ArrayList<>();
		
		arr.add("Hello, World!");
		arr.size();
		arr.remove("Hello, World!");
		
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "Test1");
		map.put(2, "Test2");
		map.put(3, "Test3");
		
		String exampleValue = map.get(1);
		Set<Integer> keySet = map.keySet();
		for(Integer i : keySet) {
			System.out.println(i + ": " + map.get(i));
		}
		
		Map<Integer, String> map2 = new TreeMap<>();
		map2.put(1, "Test2_1");
		
		// TakeAway:
		// -> Maps sind anders als Listen / Sets
		// -> Vergleiche mittels equals in den Datenstrukturen
		// -> ggf. hashCode-Methoden
		// -> für Tree-Strukturen sind Comparables und Comparatoren wichtig
		
	}
}
