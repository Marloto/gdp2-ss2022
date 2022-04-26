
public class AudioFile {
	// 1. Attribut path vom Typ String
	String path;
	// 2. Methode parsePathname(String)
	void parsePathname(String p) {
		path = p;
		// Verarbeitungsalgo. siehe Aufgabe
	}
	// 3. Methode getPathname() liefert String
	String getPathname() {
		return path;
	}
	public static void main(String[] args) {
		// Instanz erzeugen
		AudioFile musik1 = new AudioFile();
		// Pfad vorgeben
		musik1.parsePathname("file.mp3");
		// Vergleichen mit get überprüfen
		String res1 = musik1.getPathname();
		if("file.mp3".equals(res1)) {			
			System.out.println("Passt!");
		}
		// ---
		// Instanz erzeugen
		AudioFile musik2 = new AudioFile();
		// Pfad vorgeben
		musik2.parsePathname("/my-tmp/file.mp3");
		// Vergleichen mit get überprüfen
		String res2 = musik2.getPathname();
		if("/my-tmp/file.mp3".equals(res2)) {			
			System.out.println("Passt!");
		}
	}
}
