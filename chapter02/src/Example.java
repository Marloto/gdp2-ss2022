
public class Example {
	private int value;
	
	public Example(int value) {
		this.value = value;
	}
	
	public boolean equals(Object o) {
		Example example = (Example) o;
		return example.value == this.value;
	}
	
	public static void main(String[] args) {
		Example a = new Example(1);
		Example b = new Example(1);
		Example c = b;
		
		int x = 1;
		int y = 1;
		int z = y;
		
		if(x == y) {
			System.out.println("x == y");
		}
		
		if(a.value == b.value) {
			System.out.println("a == b");
		}
		if(a.equals(b)) {
			System.out.println("a == b");
		}
		if(b == c) {
			System.out.println("b == c");
		}
	}
}
