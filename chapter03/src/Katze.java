
public class Katze extends Tier {
	private String other;
	
	public Katze() {
		super("Katze!");
		System.out.println("Katze initialisiert");
	}
	public Katze(String name) {
		super(name);
		System.out.println("Katze initialisiert");
	}
	
	
	public void doSomething() {
		
	}
	
	public static void main(String[] args) {
//		Tier tier = new Tier("SomeTier");
//		tier.gibTon();
		// tier.doSomething(); existiert nicht!
		
		Katze katze = new Katze();
		katze.gibTon();
		katze.doSomething();
		
		
		Loewe loewe = new Loewe();
		loewe.doSomething();
		loewe.gibTon();
	}
}
