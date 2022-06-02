package lecture20220602;

// "Funktionale Schnittstellen"
interface AddOperation {
	int add(int a, int b);
	// int sub(int a, int b); <- nur eine Methode möglich!
}
class MoreStuff implements AddOperation {
	public int add(int a, int b) {
		return a + b;
	}
}

public class SomeExample {
	public static void main(String[] args) {
		AddOperation foo = new MoreStuff();
		int add = foo.add(5, 10);
		System.out.println(add);
		
		AddOperation bar = (x, y) -> {
			return x + y;
		};
		int add2 = bar.add(5, 10);
		System.out.println(add2);
		
		AddOperation bar2 = (x, y) -> x + y;
		int add3 = bar2.add(5, 10);
		System.out.println(add3);
	}
}
