
public class WrapperFragen {
	public static void main(String[] args) {
		// primitiver Datentyp, Speicher
		// auspacken bei variable
		int x = 42; // 32 bit
		
		// Problem: in Java gibt es int und Integer!
		// -> Integer ist eine Klasse, aus der Objekte erzeugt werden
		// -> 32bit für wert + 64bit für Klassen-Instanz
		Integer y = 42; // Autoboxing 
		// -> Integer.valueOf(42);
		Integer z = Integer.valueOf(42); 
		
		int a = Integer.valueOf(42);
		int b = z; // Autounboxing
		// -> Integer.valueOf(42).intValue();
		int c = z.intValue();
		
		// Autoboxing / Autounboxing nur auf Ebene der primt. Datentypen
		// nicht für gesamte Arrays!
		
		// selbes objekt, da irgendwo im speicher vor erzeugt
		if(Integer.valueOf(1) == Integer.valueOf(1)) {
			System.out.println("geht!");
		}
		// zwei neue Objekte mit wert 128
		if(Integer.valueOf(128) == Integer.valueOf(128)) {
			System.out.println("geht!");
		} else {
			System.out.println("geht nicht!");
		}
		// -> besser equals verwenden!
		
		if((int)Integer.valueOf(128) == (int)Integer.valueOf(128)) {
			System.out.println("geht!");
		}
		
		
		
		// Reihung vom primitiven Datentyp int
		int[] list1 = new int[] {1, 2, 3, 4, 128}; 
		// Reihung vom Datentyp Integer (Wrapper-Klasse zu int)
		Integer[] list2 = new Integer[list1.length]; 
		
		// list2 = list1; geht nicht!
		 
		for(int i = 0; i < list1.length; i ++) {
		    list2[i] = list1[i]; // funktioniert das?
		    // Integer = int
		    // verpacken eines primt. Wertes in ein passendes Wrapper-Objekt
		    // -> Autoboxing
		    list1[i] = list2[i];
		    // -> Autounboxing
		}
		
//	X 	Die Zuweisung list2[i] = list1[i]; geht, da hier über Autoboxing ein int in ein Integer-Wrapper-Objekt überführt wird 
//
//	X	Die Zuweisung list2 = list1; geht nicht, da es keine Wrapper-Funktionalität auf Array-Ebene gibt
//
//		Die Zuweisung list2 = list1; geht, da hier über Autoboxing ein int-Array in ein Wrapper-Klassen-Array überführt wird
//
//		Die Zuweisung list2[i] = list1[i]; in der Schleife geht nicht
//
//		Die Zuweisung list2[i] = list1[i]; geht, da hier über Autounboxing ein int in ein Integer-Wrapper-Objekt überführt wird
	
	}
}
