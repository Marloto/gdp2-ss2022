package lecture20220512;

import java.io.Closeable;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ToMuchErrors {
	public static void doOtherthing() throws IOException {
		new FileWriter(new File(""));
	}
	
	public static void main(String[] args) {
		
		// Was sind Ausnahmen?
		// siehe notizen zu beginn :) (im Stream)
		
		// Unchecked vs. Checked
		// => RuntimeException
		// => Exception muss verarbeitet werden
		// => RuntimeException / unchecked kann verarbeitet werden
		// throw new RuntimeException("...");
//		try {
//			throw new Exception("...");
//		} catch(Exception e) {
//			
//		}
		
		// Stacktraces -> Call-Stack
		// => weg durch die Methodenaufrufe
		// => ohne Objektbezug, nur die Methoden + Zeilen
		
		// Wie können Ausnahmen erzeugt werden?
//		"".substring(1, 2);
//		RuntimeException exception = new RuntimeException("...");
//		throw exception;
		
		// Wie können Ausnahmen abgefangen werden?
		// mittels try-catch
		// catch kann mehrfach existieren
		// reihenfolge entscheidend, vom speziellen zum generellen
		// multi-catches
		// weiterwerfen mittels throw möglich
//		try {
//			"".substring(1, 2);
//			new FileWriter(new File(""));
//			System.out.println("Kommt nicht!");
//		} catch(StringIndexOutOfBoundsException exc) {
//			exc.printStackTrace();
//			throw exc;
//		} catch(NumberFormatException | IOException exc) {
//			exc.printStackTrace();
//		} catch(RuntimeException exc) {
//			exc.printStackTrace();
//		} catch(Exception exc) {
//			exc.printStackTrace();
//		} catch(Throwable exc) { // nach möglichkeit nicht
//			exc.printStackTrace();
//		}
		
		// Throws
//		try {
//		doOtherthing();
//	} catch (IOException e) {
//		e.printStackTrace();
//	}
		
		// Was passiert über verschiedene Methoden hinweg
		// => verändert den Stacktrace, kann mittels throws weitergereicht werden
		
		// Wie können eigene Ausnahmen definiert werden
		// => Angabe von Ausnahmegründen möglich
//		try {
//			extracted();
//		} catch (AnyException e) {
//			e.printStackTrace();
//		}
		
		// Finally
		FileWriter writer = null;
		try {
			"".substring(1, 2);
			writer = new FileWriter(new File(""));
		} catch(IOException exc) {
			exc.printStackTrace();
		} finally {
			// Exceptions, die in finally auftreten, müssen noch einmal mittels
			// try-catch oder throws verarbeitet werden
			System.out.println("Ausnahmebehandlung kommt davor");
			try {
				writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		// Try-Catch-Ressource
		// -> Interface Closable
		try (FileWriter writer2 = new FileWriter(new File(""))) {
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void extracted() throws AnyException {
		try {
			"".substring(1, 2);
		} catch(Exception exc) {
			throw new AnyException("Test1", "Test2", exc);
		}
	}
}
