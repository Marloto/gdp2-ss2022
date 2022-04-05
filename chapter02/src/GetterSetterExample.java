
public class GetterSetterExample {
	private int other;
	private int y;
	private boolean rate;
	
	public GetterSetterExample(int other) {
		this.other = other;
		// ... oder ...
		this.setOther(other);
	}
	
	// private T attr
	// <sichtbarkeit> T get<Attr>() { ... }
	public int getOther() {
		return this.other;
	}
	
	public int getY() {
		return y;
	}
	
	// Nur für Booleans
	// <sichtbarkeit> T is<Attr>() { ... }
	public boolean isRate() {
		return this.rate;
	}
	
	// <sichtbarkeit> void set<Attr>(T value) { ... }
	public GetterSetterExample setOther(int value) {
		other = value;
		return this;
	}
	
	public GetterSetterExample setY(int y) {
		this.y = y;
		return this;
	}
	
	public static void main(String[] args) {
		// Vergleich Setter mit Kette vs. einzelne Aufrufe
		GetterSetterExample example1 = new GetterSetterExample(1).
				setOther(12).setY(42);
		
		GetterSetterExample example2 = new GetterSetterExample(1); 
		example2.setOther(12);
		example2.setOther(42);
	}
	
	
	
	
	
	
	
	// Brauch ich immer Getter und Setter?
	// -> je nach bedarf zu entscheiden
	
	
}
