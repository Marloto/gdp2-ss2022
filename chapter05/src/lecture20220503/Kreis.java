package lecture20220503;

public class Kreis implements GeometrischesObjekt, Comparable {

	private double durchmesser;

	public Kreis(double d) {
		durchmesser = d;
	}
	
	public double getDurchmesser() {
		return durchmesser;
	}

	public double berechneUmfang() {
		return Math.PI * durchmesser;
	}

	public int compareTo(Object o) {
		return 0;
	}
}
