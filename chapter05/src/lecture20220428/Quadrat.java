package lecture20220428;

public class Quadrat implements Vergleichbar, Comparable {
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

	public int compareTo(Object o) {
		if(o instanceof Quadrat) {
			Quadrat q = (Quadrat) o;
			
			// -1 für this ist kleiner
			if(this.seitenlaenge < q.seitenlaenge) {
				return -1;
			}
			// 0 für gleich
			if(this.seitenlaenge == q.seitenlaenge) {
				return 0;
			}
			// 1 für this ist größer
			if(this.seitenlaenge > q.seitenlaenge) {
				return 1;
			}
			
		}
		return -1;
	}

}
