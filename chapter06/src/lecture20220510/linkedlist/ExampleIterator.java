package lecture20220510.linkedlist;

import java.util.Iterator;

public class ExampleIterator implements Iterator<Integer> {
	
	private Example example;
	private int current;

	public ExampleIterator(Example example) {
		this.example = example;
		this.current = 0;
	}

	public boolean hasNext() {
		return this.current < this.example.getN();
	}

	public Integer next() {
		return this.current ++;
	}

}
