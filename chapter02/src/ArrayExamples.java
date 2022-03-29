
public class ArrayExamples {

	public static void main(String[] args) {
		// Feld, mit mehreren Elementen
		// Als Syntax-Baustein: []
		// Feldgröße [10]
		// Arrays sind Objekte
		// Werden mit "new" erzeugt, andernfalls null
		// Zugriff über Index, start bei 0 bis Länge

		int abc3[];
		int[] abc = new int[10];
		// Alternative zur Erzeugung
		int[] abc2 = new int[] {1, 2, 3};
		
		// = new int[10];
		abc[0] = 12;
		abc[1] = 13;
		abc[2] = 42;
		abc[9] = 1;
		System.out.println(abc[0]);
//		// abc[10] = 1; <- element existiert nicht
		int anzahl = abc.length;
		
		// Wie kann man alle Elemente verwenden?
		// -> for-Schleife
		for(int i = 0; i < anzahl; i ++) {
			abc[i] = 10;
			System.out.println(abc[i]);
		}
		
		for(int value : abc) {
			// auswahl sprungweite nicht möglich
			// keine Abbruchbedingung
			// Keine Start-Bedingung und End-Bedingung
			System.out.println(value);
		}
		
		Dreieck a = new Dreieck(1);
		
		Dreieck[] dreiecke = new Dreieck[3];
		// initialisierung mit null!
		dreiecke[0] = a;
		dreiecke[1] = new Dreieck(1);
		dreiecke[2] = dreiecke[0];
	}

}





