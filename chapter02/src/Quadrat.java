public class Quadrat {
	double seitenLaenge;
	
	// nicht nach Konvention:
//	double _seiten_laenge;
//	double SEITEN_LAENGE;
//	double SEITEN_laenge_12345;
//
//	void _seiten_1234(double p) {
//		seitenLaenge = p;
//	}
//	
//	void SEITEN_LAENGE(double p) {
//		seitenLaenge = p;
//	}
	
	// Default-Konstruktor:
	// -> hat keine Parameter
	// -> existiert, solange kein anderer Konstruktor existiert automatisch
	Quadrat() {
		seitenLaenge = 0;
	}
	
	// Konstruktoren
	Quadrat(double initialSeitenLaenge) {
		// ...
		seitenLaenge = initialSeitenLaenge;
		System.out.println("Neues Quadrat erzeugt, mit sl = " + seitenLaenge);
	}
	
	Quadrat(int initialSeitenLaenge) {
	
	}
	
	Quadrat(int initialSeitenLaenge, int seitenLaenge) {
	
	}
	
	void seitenLaenge(double p) {
		seitenLaenge = p;
	}
	
	double berechneFlaeche() {
		return seitenLaenge * seitenLaenge;
	}
	
	public static void main(String[] args) {
		//new Quadrat().seitenLaenge(12);
		// kein Zugriff mehr auf das Quadrat
		Quadrat quadrat1 = new Quadrat(1);
		Quadrat quadrat2 = new Quadrat();
		quadrat1.seitenLaenge(42);
		quadrat2.seitenLaenge(21);
		double res = quadrat1.berechneFlaeche();
		System.out.println(res);
		
	}
}
