import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Scanner;

public class PlayList {
	// private LinkedList audioFiles; // Aggregation, diese wollen wir nicht!
	
	public static void main(String[] args) {
	
		
		
		// PlayList erstellen
		// -> verwendung von Datenstrukturen als Aggregation vs. Vererbung
		// -> parametrisierbare Klassen verwenden
		// -> LinkedList, als Vererbung mit passenden Typ
		// -> Verwendung von LinkedList später wichtig
		LinkedList<AudioFile> linkedList = new LinkedList<>();
		// vgl. PlayList extends LinkedList...
		
		// Zufallssortierung -> Collections.shuffle();
		
		// Exceptions
		// -> try-catch-block für die Behandlung notwendig, wenn mit Dateien
		//    gearbeitet wird
		
		// Dateien schreiben mittels FileWriter
		FileWriter fileWriter = null;
		try {
			fileWriter = new FileWriter("playlist.m3u");
			fileWriter.write("Hello, World!\n"); // <- implementierung des Algo.
			fileWriter.write("Hello, World!\n");
			fileWriter.write("Hello, World!");
		} catch (IOException e) {
			throw new RuntimeException("Datei nicht schreibbar");
		} finally {
			try {
				fileWriter.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		// Dateien schreiben mittels FileWriter in einem try-catch-ressource-block
		try (FileWriter fileWriter2 = new FileWriter("playlist2.m3u")) {
			fileWriter2.write("Hello, World!"); // <- implementierung des Algo.
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// Dateien lesen mittels Scanner
		Scanner scanner = null;
		try {
			scanner = new Scanner(new File("playlist.m3u"));
			
			while(scanner.hasNextLine()) {				
				String nextLine = scanner.nextLine();
				System.out.println(nextLine); // <- erzeugen von AudioFile-Instanzen
			}
		} catch (IOException e) {
			throw new RuntimeException("...");
		} finally {
			scanner.close();
		}
		
		// Dateien lesen mittels Scanner in einem try-catch-close-block
		try(Scanner scanner2 = new Scanner(new File("playlist.m3u"))) {
			while(scanner.hasNextLine()) {				
				String nextLine = scanner.nextLine();
				System.out.println(nextLine); // <- erzeugen von AudioFile-Instanzen
			}
		} catch (IOException e) {
			throw new RuntimeException("...");
		}
	}
}
