package lecture20220608;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Sortieren {
	public static void main(String[] args) {
		// Wie haben wir Arrays und Collections
		// sortiert?
		// bzw. Reihenfolge
		// -> Comperator
		// -> Comparable
		
		List<String> example = new ArrayList<>();
		
		example.add("C");
		example.add("A");
		example.add("D");
		example.add("B");
		
		// Comparator<String> someThing = (a, b) -> a.compareTo(b);
		Comparator<String> someThing = (a, b) -> {
			if(a == null && b == null) {
				return 0;
			}
			// ...
			return a.compareTo(b); 
		};
		
		 
		
		// irgend eine sort
		Collections.sort(example, someThing);
		System.out.println(example.toString());
	}
}
