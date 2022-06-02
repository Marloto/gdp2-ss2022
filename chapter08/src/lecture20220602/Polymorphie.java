package lecture20220602;

interface SomeInterface {
	void doSomething();
}

class A implements SomeInterface {
	public void doSomething() {
		System.out.println("Jene");
	}
}

class B implements SomeInterface {
	public void doSomething() {
		System.out.println("Diese");
	}
}

class C extends B {
	public void doSomething() {
		// ...
	}
}

public class Polymorphie {
	public static void doSomething() {
		System.out.println("Hello!");
	}

	public static void main(String[] args) {
		// Statische Binden
		Polymorphie.doSomething();
		// Dynamische Binden
		SomeInterface abc = new C();
		abc.doSomething();
	}
}
