package lecture20220503;

public class Dreieck implements GeometrischesObjekt, Comparable {
	private double a, b, c;

	public Dreieck(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public double getA() {
		return a;
	}
	
	public double getB() {
		return b;
	}
	
	public double getC() {
		return c;
	}

	public double berechneUmfang() {
		return a + b + c;
	}

	public int compareTo(Object o) {
		return 0;
	}
	
}
