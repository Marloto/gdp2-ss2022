package lecture20220503;

public class Something<T> {
	private T value;

	public void doSomething(T other) {
		System.out.println(other);
	}
	public T doOtherthing() {
		return null;
	}
	
	public static void main(String[] args) {
		Something something1 = new Something();
		Something<String> something2 = new Something<>();
		Something<Integer> something3 = new Something<>();
		// Something<int> something4 = new Something<>(); -> klappt nicht
		
		something3.doSomething(1);
		int x = something3.doOtherthing();
	}
}






