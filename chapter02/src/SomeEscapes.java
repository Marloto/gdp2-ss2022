
public class SomeEscapes {
	public static void main(String[] args) {
		// Ein \ hat einen Einfluss auf das nachfolgende Zeichen, damit lässt sich z.B.
		// ein doppeltes Anführungszeichen oder Zeilenumbrüche ausgeben, daraus folgt,
		// dass es nicht direkt als „Zeichen“ genutzt werden kann. Um das
		// Backslash-Zeichen zu nutzen sind zwei Backslashs notwendig: „\\“
		// System.out.println("\"); -> geht nicht
		System.out.println("\\");
		System.out.println('\\');
		// Kann auch genutzt werden, um ein doppeltes Anführungszeichen
		// auszugeben:
		System.out.println("\"");
	}
}
