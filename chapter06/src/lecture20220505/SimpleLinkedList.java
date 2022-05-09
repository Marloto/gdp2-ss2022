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
        Element<K> cur = first;
        while(cur != null) {
            if(cur.getValue().equals(value)) {
                return cur;
            }
            cur = cur.getNext();
        }
        return null;
    }
    
    private Element<K> find(int index) {
        Element<K> cur = first;
        int i = 0;
        while(cur != null) {
            if(i == index) {
                return cur;
            }
            cur = cur.getNext();
        }
        return null;
    }
	
	public boolean remove(Object value) {
		Element<K> find = find(value);
    	if(find != null) {
    		remove(find);
    	}
		return true;
	}

    private void remove(Element<K> find) {
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

	public boolean containsAll(Collection<?> c) {
	    for(Object o : c) {
	        if(!this.contains(o)) {
	            return false;
	        }
	    }
		return true;
	}

	public boolean addAll(Collection<? extends K> c) {
	    boolean added = true;
	    for(K element : c) {
	        added = this.add(element) && added;
	    }
		return added;
	}

	public boolean addAll(int index, Collection<? extends K> c) {
	    return false;
	}

	public boolean removeAll(Collection<?> c) {
        boolean removed = true;
        for(Object element : c) {
            removed = this.remove(element) && removed;
        }
        return removed;
	}

	public boolean retainAll(Collection<?> c) {
	    boolean removed = true;
        for(Object element : c) {
            if(!this.contains(element)) {
                this.remove(element);
            }
        }
        return removed;
	}

	public void clear() {
		first = null;
		last = null;
		size = 0;
	}

	public K get(int index) {
	    Element<K> find = this.find(index);
		return find != null ? find.getValue() : null;
	}

	public K set(int index, K element) {
	    Element<K> old = this.find(index);
	    this.add(index, element);
	    this.remove(old);
	    return old != null ? old.getValue() : null;
	}

	public void add(int index, K element) {
        Element<K> newElement = new Element<K>(element);
        Element<K> find = this.find(index); // gets previous
        if(find != null) {
            Element<K> previous = find.getPrevious();
            newElement.setNext(find);
            find.setPrevious(newElement);
            newElement.setPrevious(previous);
            if(previous != null) {
                previous.setNext(newElement);
            }
            if(first == find) {
                first = newElement;
            }
        } else if(last != null) {
            newElement.setPrevious(last);
            last.setNext(newElement);
            last = newElement;
        } else {
            first = newElement;
            last = newElement;
        }
	}

	public K remove(int index) {
	    Element<K> find = this.find(index);
	    if(find != null) {
	        this.remove(find);
	        return find.getValue();
	    }
		return null;
	}

	public int indexOf(Object value) {
	    Element<K> cur = first;
	    int i = 0;
        while(cur != null) {
            if(cur.getValue().equals(value)) {
                return i;
            }
            cur = cur.getNext();
            i ++;
        }
        return -1;
	}

	public int lastIndexOf(Object value) {
        Element<K> cur = last;
        int i = 0;
        while(cur != null) {
            if(cur.getValue().equals(value)) {
                return i;
            }
            cur = cur.getPrevious();
            i ++;
        }
        return -1;
	}

	public List<K> subList(int fromIndex, int toIndex) {
	    Element<K> cur = this.find(fromIndex);
	    Element<K> end = this.find(toIndex);
	    SimpleLinkedList<K> list = new SimpleLinkedList<>();
	    while(cur != null) {
	        list.add(cur.getValue());
	        if(cur == end) {
	            break;
	        }
	        cur = cur.getNext();
	    }
		return list;
	}

    public ListIterator<K> listIterator() {
        throw new RuntimeException("Not implemented yet...");
    }

    public ListIterator<K> listIterator(int index) {
        throw new RuntimeException("Not implemented yet...");
    }
}









