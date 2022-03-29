
public class ZweiteKlasse {
	public static void main(String[] args) {
		References r = new References();
		r.doSomething(r);
		// r.attr ist nicht sichtbar! existiert jedoch
	}
}
