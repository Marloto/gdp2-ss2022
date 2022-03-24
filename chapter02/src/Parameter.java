
public class Parameter {
	int value;
	
	void doSomething1(int i) {
		i = 4;
	}
	
	int doSomething2(int i) {
		return i + 1;
	}
	
	void doSomething3(Parameter p) {
		p = new Parameter();
		p.value = 10;
	}
	
	void doSomething4(Parameter p) {
		p.value = 10;
	}
	
	public static void main(String[] args) {
		int value = 1; // <-
		Parameter p1 = new Parameter(); // <-
		Parameter p2 = new Parameter();
		
		// Beispiel 1
		p1.doSomething1(value); // <-
		System.out.println(value); // 1
		
		// Beispiel 2
		value = p1.doSomething2(1);
		System.out.println(value); // 2
		
		// Beispiel 3
		p1.doSomething3(p2);
		System.out.println(p2.value); // unbekannt... 0 weil default
		
		// Beispiel 4
		p1.doSomething4(p2);
		System.out.println(p2.value);
	}
}
