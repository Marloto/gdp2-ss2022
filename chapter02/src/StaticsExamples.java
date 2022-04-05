import java.util.Arrays;

public class StaticsExamples {
	private static int a;
	
	static {
		// initialisieren der Klasse
		// wird beim erstmaligen Nutzen
		// der Klasse ausgeführt
	}
	
	public static StaticsExamples doSomething() {
		// Schlüsselwort this?
		a ++;
		System.out.println("done...");
		
		// können hier neue Objekte der Klasse
		// StaticsExample erzeugt werden?
		return new StaticsExamples();
	}
	
	public static void main(String[] args) {
		StaticsExamples o1 = new StaticsExamples();
		
		o1.a = 2;
//		StaticsExamples o2 = new StaticsExamples();
		
		a = 1;
		System.out.println(StaticsExamples.a);
		StaticsExamples o3 = doSomething();
	}
}
