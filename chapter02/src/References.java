
public class References {
	private References attr;
	
	public void doSomething(References r) {
		this.attr = r;
	}
	
	public static void main(String[] args) {
		//new References().doSomething();;
		References r1 = new References();
		References r2 = new References();
		r1.doSomething(r2);
		
	}
}
