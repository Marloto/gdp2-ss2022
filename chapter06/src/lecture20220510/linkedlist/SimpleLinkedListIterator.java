package lecture20220510.linkedlist;

import java.util.Iterator;

public class SimpleLinkedListIterator<K> implements Iterator<K> {
	
	private Element<K> current;
	
	public SimpleLinkedListIterator(Element<K> start) {
		this.current = start;
	}

	public boolean hasNext() {
		return current != null;
	}

	public K next() {
		K value = current.getValue();
		current = current.getNext();
		return value;
	}

}
