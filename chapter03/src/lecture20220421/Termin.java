package lecture20220421;

public class Termin {
	// Undefiniert, Praesenz, Online, Telefon
	
	/*private static final byte UNDEFINIERT = 0;
	private static final byte PRAESENZ = 1;
	private static final byte ONLINE = 2;
	private static final byte TELEFON = 3;*/
	
	private TerminTyp typ;
	
	public Termin(TerminTyp typ) {
		this.typ = typ;
	}
	
	public static void main(String[] args) {
		TerminTyp ref1 = TerminTyp.UNDEFINIERT;
		Termin termin = new Termin(ref1);
		
		if(ref1.equals(TerminTyp.ONLINE)) {
			
		}
		TerminTyp.ONLINE.doSomething();
		String erg = TerminTyp.ONLINE.doOtherthing();
		
		String name = TerminTyp.ONLINE.name();
		System.out.println(name);
		TerminTyp ref2 = TerminTyp.valueOf("ONLINE");
		if(ref2 == TerminTyp.ONLINE) {
			System.out.println("Identisch!");
		}
		
		int ordinal = TerminTyp.ONLINE.ordinal();
		System.out.println(ordinal);
		
		TerminTyp[] values = TerminTyp.values();
		for(TerminTyp typ: values) {
			System.out.println(typ.ordinal() + ":  " + typ.name());
		}
		
		if(TerminTyp.ONLINE instanceof Object) {
			System.out.println("ist object");
		}
		
		TerminTyp.ONLINE.toString();
		TerminTyp.ONLINE.equals(TerminTyp.ONLINE);
		TerminTyp.ONLINE.hashCode();
	}
}






