public class AudioFile {
	String filename;
	String pathname;
	
	AudioFile() {
	}
	
	void parsePathname(String path) {
		pathname = path;
	}
	
	String getPathname() {
		return pathname;
	}
	
	String getFilename() {
		return filename;
	}
	
	public static void main(String[] args) {
		// Aufgabe: Objekt / Instanz erzeugen, parsePathname aufrufen, 
		// mittels getPathname abrufen, Ergebnis ausgeben!
		
		AudioFile file1 = new AudioFile();
		file1.parsePathname("file.mp3");
		System.out.println(file1.getPathname());
		

		AudioFile file2 = new AudioFile();
		file2.parsePathname("");
		System.out.println(file2.getPathname());
		
		// String var = file1.getPathname()
		// System.out.println(var);
	}
}






