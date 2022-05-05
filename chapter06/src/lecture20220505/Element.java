package lecture20220505;

public class Element<T> {
	private T value;
	private Element<T> next;
	private Element<T> previous;

	public Element(T value) {
		super();
		this.value = value;
	}

	public Element<T> getNext() {
		return next;
	}

	public void setNext(Element<T> next) {
		this.next = next;
	}

	public Element<T> getPrevious() {
		return previous;
	}

	public void setPrevious(Element<T> previous) {
		this.previous = previous;
	}

	public T getValue() {
		return value;
	}

}
