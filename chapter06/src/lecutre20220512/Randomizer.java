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
		return null;
	}
}
