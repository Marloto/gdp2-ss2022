package lecture20220428;

public class Quadrat implements Vergleichbar {
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
    
    public boolean istGroesserAls(Vergleichbar other) {
    	if(other instanceof Quadrat) {
    		Quadrat q = (Quadrat) other;
    		return this.seitenlaenge > q.seitenlaenge;
    	}
    	return false;
    }
    
}
