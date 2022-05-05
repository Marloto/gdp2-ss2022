package lecture20220505;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class SimpleLinkedList<K> implements List<K> {
	private Element<K> first;
	private Element<K> last;
	private int size;
	
	public boolean add(K value) {
		Element<K> e = new Element<>(value);
		if(first == null && last == null) {
			first = e;
			last = e;
		} else {
			last.setNext(e);
			e.setPrevious(last);
			last = e;
		}
		size ++;
		return true;
	}
	
	private Element<K> find(Object value) {
		
		// wie finden wir das Element ausgehend von first oder last?
		// -> iteration über die Elemente
		// -> while solange next != null
		Element<K> cur = first; // falls leere liste, ist first null
		while(cur != null) {
			if(cur.getValue().equals(value)) {
				return cur;
			}
			cur = cur.getNext();
		}
		return null;
	}
	
	public boolean remove(Object value) {
		Element<K> find = find(value);
		
		// was wäre notwendig?
		// -> referenz finden
		// -> next und previous korrigieren
		// gibt es sonderfälle?
		// -> liste leer
		// -> letztes Objekt
		// -> ersten Objekt
		
    	if(find != null) {
    		size --;
    		// Element is first -or- Element is first and last 
    		if(first == find) {
    			Element<K> next = first.getNext();
    			// Remove reference to old previous
    			if(next != null) {    				
    				next.setPrevious(null);
    			}
    			first = next;
    			if(last == find) {
    				last = next;
    			}
    		// Element is last
    		} else if(last == find) {
    			Element<K> previous = last.getPrevious();
    			previous.setNext(null);
    			last = previous;
    		// Somewhere inbetween
    		} else {
    			Element<K> previous = find.getPrevious(); //should be != null, because not root
    			Element<K> next = find.getNext(); //should be != null, because not last
    			previous.setNext(next);
    			next.setPrevious(previous);
    		}
    	}
		
		return true;
	}
	
	public K getFirst() {
		return first.getValue();
	}
	
	public K getLast() {
		return last.getValue();
	}
	
	public int size() {
		// schleife durch die Elemente wie bei find, zählen! performance ggf. nicht optimal
		// Alternative bei add remove zählen
		return size;
	}
	
	public boolean isEmpty() {
		return first == null;
		// od. return size() == 0;
	}

	public boolean contains(Object o) {
		return find(o) != null;
	}

	public Iterator<K> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object[] toArray() {
		// Array erzeugen, jedes Element hineinplatzieren
		Object[] list = new Object[this.size];
		addToList(list);
		return list;
	}

	private void addToList(Object[] list) {
		int i = 0;
		Element<K> cur = first; // falls leere liste, ist first null
		while(cur != null) {
			list[i ++] = cur.getValue();
			cur = cur.getNext();
		}
	}

	public <T> T[] toArray(T[] a) {
		T[] list = Arrays.copyOf(a, this.size);
		addToList(list);
		return list;
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		return false;
	}

	@Override
	public boolean addAll(Collection<? extends K> c) {
		return false;
	}

	@Override
	public boolean addAll(int index, Collection<? extends K> c) {
		return false;
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		first = null;
		last = null;
		size = 0;
	}

	@Override
	public K get(int index) {
		return null;
	}

	@Override
	public K set(int index, K element) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void add(int index, K element) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public K remove(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int indexOf(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int lastIndexOf(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ListIterator<K> listIterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ListIterator<K> listIterator(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<K> subList(int fromIndex, int toIndex) {
		// TODO Auto-generated method stub
		return null;
	}
}









