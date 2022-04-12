package lecutre20220412;

public class Unterkunft {
	protected Zimmer[] zimmer;
	protected Adresse adresse;
	protected String name;

	// Konstruktor zur initialisierung?
	public Unterkunft(Adresse adresse, String name, 
			Zimmer[] zimmer) {
				this.adresse = adresse;
				this.name = name;
				this.zimmer = zimmer;
	}
	
	public Adresse getAdresse() {
		return adresse;
	}
	
	public Zimmer[] getZimmer() {
		return zimmer;
	}
	
	// Überladen
	void doSomething(int x) {}
	void doSomething(int x, int y) {}
	
	// Überschreiben
	public String toString() {
		return "Kein Klassenname!";
	}

	public boolean equals(Object obj) {
		// equals(super); <- kann nicht genutzt werden,
		// da super keine Referenz im herkömmlichen Sinn!
		return false;
	}
	
	// Überladen der equals-Methode, nicht zwingend 
	// korrekt!
//	public boolean equals(Unterkunft obj) {
//		return false;
//	}
	
}
