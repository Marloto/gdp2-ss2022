package lecture20220510.linkedlist;

import java.util.Iterator;

public class Example implements Iterable<Integer> {
	
	private int n;

	public Example(int n) {
		this.n = n;
	}
	
	public int getN() {
		return n;
	}

	@Override
	public Iterator<Integer> iterator() {
		return new ExampleIterator(this);
	}

}
