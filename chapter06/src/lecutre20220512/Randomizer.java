package lecutre20220512;

import java.util.Iterator;

public class Randomizer implements Iterable<Double> {
	private double min;
	private double max;
	public Randomizer(double min, double max) {
		this.min = min;
		this.max = max;
	}
	
	public double getMax() {
		return max;
	}
	
	public double getMin() {
		return min;
	}
	
	public Iterator<Double> iterator() {
		return new RandomizerIterator(this);
	}
	
	public Iterable<Double> iteratorMitAnzahl(int anzahl) {
		return new Iterable<Double>() {
			public Iterator<Double> iterator() {
				return new RandomizerIterator(Randomizer.this, anzahl);
			}
		};
	}
	
	public static void main(String[] args) {
		for(double d : new Randomizer(0.1, 0.3).iteratorMitAnzahl(10)) {
			System.out.println(d);
		}
	}
	
}
