package lecture20220421;

public class FinalExample {
	
	private final int something = 1;
	private static final int otherthing = 2;
	
	public FinalExample() {
		//something = 1;
	}

	// Schlüsselwort "final"
	// -> class: Verhindert spezialisierung, 
	//    man kann nicht erben
	// -> method: lassen sich nicht weiter überschreiben
	// -> attribut: werden mit der erzeugung von 
	//    objekten einmalig belegt
	// -> parameter: keine zuweisung auf die parameter
	//    in der Methode möglich
	// -> variable: konstante in der methode, 
	//    lässt sich ebenfalls nicht ändern
	
	public final void doSomething() {
		System.out.println("nicht überschreibbar");
	}
	
	public void doSomething(int x) { // überladen möglich
		
	}
	
	public void otherthing(final int x) {
		
	}
	
	public static void main(String[] args) {
		new FinalExample().otherthing(12);
	}
}
