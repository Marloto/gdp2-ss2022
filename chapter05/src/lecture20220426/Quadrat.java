package lecture20220426;

public class Quadrat implements Vergleichbar, AndereSchnittstelle {
    private int seitenlaenge;

    public Quadrat(int seitenlaenge) {
        this.seitenlaenge = seitenlaenge;
    }

    @Override
    public String toString() {
        return "Quadrat [seitenlaenge=" + seitenlaenge + "]";
    }

    public int getSeitenlaenge() {
        return seitenlaenge;
    }

//	@Override
//	public int getSomething() {
//		return this.seitenlaenge;
//	}
    
    public boolean istGroesserAls(Vergleichbar other) {
    	if(other instanceof Quadrat) {
    		Quadrat q = (Quadrat) other;
    		return this.seitenlaenge > q.seitenlaenge;
    	}
    	return false;
    }
    
    public static void main(String[] args) {
		Quadrat q1 = new Quadrat(1);
		Object q2 = q1;
		Vergleichbar q3 = q1;
		AndereSchnittstelle q4 = q1;
		// -> Schnittstellen sind auch Datentypen
		// -> Objekte von Klassen, die Schnittstellen implementieren, können
		//    auf die Schnittstellen-Datentypen zugewiesen werden
		
		q4.doSomething();
		q3.istGroesserAls(q3);

		q1.istGroesserAls(q1);
		q1.doSomething();
		
		((Quadrat)q3).seitenlaenge = 12;
		
		System.out.println();
		System.out.println("Test");
		System.out.print("Test\n");
	}

	@Override
	public void doSomething() {
		System.out.println("Hello, World!");
	}
    
    
    
    
    
    
    
}
