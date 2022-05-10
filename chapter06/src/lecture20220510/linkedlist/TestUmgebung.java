package lecture20220510.linkedlist;

import java.util.Iterator;
import java.util.List;

public class TestUmgebung {
	public static void main(String[] args) {
		// SimpleLinkedList list = new SimpleLinkedList();
		
		
		List<String> list = new SimpleLinkedList<>();
		list.add("Test1");
		list.add("Test2");
		list.add("Test3");
//		
//		list.remove("Test2");
		
		// Iterable<E> und Iterator<E>!
//		for(String value : list) {
//			System.out.println(value);
//		}
		Iterator<String> iterator2 = list.iterator();
		while(iterator2.hasNext()) {
			String value = iterator2.next();
			System.out.println(value);
		}
		
		Example example = new Example(10);
		Iterable<Integer> example2 = new Example(10);
//		for(Integer value : example) {
//			System.out.println(value);
//		}
//		for(Integer value : example2) {}
//		
		Iterator<Integer> iterator = example.iterator();
		while(iterator.hasNext()) {
			Integer value = iterator.next();
			System.out.println(value);
		}
	}
}
