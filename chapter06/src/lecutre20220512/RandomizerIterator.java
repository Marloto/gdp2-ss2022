package lecutre20220512;

import java.util.Iterator;

public class RandomizerIterator implements Iterator<Double> {
	private Randomizer rand;
	private int anzahl;
	private int current;

	public RandomizerIterator(Randomizer rand, int anzahl) {
		this.rand = rand;
		this.anzahl = anzahl;
	}
	
	public RandomizerIterator(Randomizer rand) {
		this(rand, 0);
	}
	
	public boolean hasNext() {
		return this.anzahl == 0 || this.current < this.anzahl;
	}

	public Double next() {
		this.current ++;
		return Math.random() * (rand.getMax() - rand.getMin()) + rand.getMin();
	}
}
