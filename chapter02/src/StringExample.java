
public class StringExample {
	public static void main(String[] args) {
		// Zeichenketten?
		// -> Array aus Characters, 
		//    eigentlich aus Bytes
		// -> ""
		// -> Zeichenketten mittels 
		//    Klassen beschrieben sind
		// -> Zeichenketten sind Objekte
		// -> Immutable
		String example = "Hello, World!";
		String example2 = example;
		String example3 = new String();
		String example4 = new String("Hello");
		String example5 = new String(new byte[] {});
		String example6 = new String(new char[] {'a', 'b', 'c'});
		
		//example.charAt(0);
		//example.length();
		String res = example.substring(0, 2);
		example.contains("");
		example.replace('a', 'b');
		
		
		
		
		
	}
}





