package lecture20220510.linkedlist;

public class TestUmgebung {
	public static void main(String[] args) {
		// SimpleLinkedList list = new SimpleLinkedList();
		
		
		SimpleLinkedList<String> list = new SimpleLinkedList<>();
		list.add("Test1");
		list.add("Test2");
		list.add("Test3");
		
		list.remove("Test2");
		
		// Iterable<E> und Iterator<E>!
		for(String wert : list) {
		}
	}
}
