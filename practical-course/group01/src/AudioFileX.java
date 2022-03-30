import java.io.InputStream;
import java.util.Scanner;

public class AudioFileX {

	private String path;

	public AudioFileX(String path) {
		this.path = path;

	}

	public AudioFileX() {
	}

	public static void main(String[] args) {
		// Content-Assist
		// Strg + Leertaste, Cmd + Leerzeichen
		new AudioFileX();

		// Quick-Fix
		// Strg + 1, Cmd + 1
		AudioFileX audioFile = new AudioFileX();

		example();

		System.out.println("Hello, World!");

		// Source im Kontext-Menü zur Generierung

		// Kommentare
		// Strg + 7, Cmd + 7
		int y = 1;

		// Autoformatierung
		// Source -> Format
		// Strg + Shift + F, Cmd + Shift + F

		// Verschieben
		// Alt-halten + Pfeiltasten
		// Löschen
		// Strg + D, Cmd + D
		// Duplicate Line
		// Alt + Strg + Pfeil up / down

		int z = 1;
		int z1 = 1;
		
		
		// Move to Line
		// Strg + L, Cmd + L
		
		// Quick Outline
		// Strg + O, Cmd + O
		// CamelCase möglich
		
		// Navigation
		// -> Hyperlinks: strg oder cmd gedrückt halten + Click
		// -> call hierarchy per kontextmenü, Strg + Alt + H
		// -> history (wie im browser) in Menü, Strg + [, Strg + ]
		
		// Refactoring
		
	}

	private static void example() {
		int i = 3 * 4;
		int x = 1 + 2 + i;
		InputStream abc = System.in;
		Scanner scanner = new Scanner(abc);
	}
}
