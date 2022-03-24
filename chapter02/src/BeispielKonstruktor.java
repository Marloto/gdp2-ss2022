
public class BeispielKonstruktor {
	int value;
	public BeispielKonstruktor() {
		this(42);
		System.out.println("A");
	}
	
	public BeispielKonstruktor(int x) {
		value = x;
		System.out.println("B");
	}
	
	void doSomething() {
		System.out.println("DA");
	}
	
	void doSomething(int x) {
		System.out.println("DB");
		doSomething();
		doSomething(42);
	}
	
	public static void main(String[] args) {
		BeispielKonstruktor b = 
				new BeispielKonstruktor(42);
		b.doSomething(42);
	}
}
