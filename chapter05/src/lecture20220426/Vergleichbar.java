package lecture20220426;

public interface Vergleichbar {
	// if (studenten[i].getMatrikelnummer() > studenten[i + 1].getMatrikelnummer()) {
	// if (quadrate[i].getSeitenlaenge() > quadrate[i + 1].getSeitenlaenge()) {
	
	
	// verallgemeinerte
	// public void vergleiche(int i); -> wie wird der passende getter aufgerufen?
	
	
	// public int getSomething();
	// -> if (any[i].getSomething() > any[i + 1].getSomething()) {
	
	public boolean istGroesserAls(Vergleichbar other);
}



