package lecture20220503;

public class Quadrat implements Vergleichbar, Comparable<Quadrat> {
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

	public int compareTo(Quadrat o) {
		// ggf. o == null prüfen!
		// -1 für this ist kleiner
		if(this.seitenlaenge < o.seitenlaenge) {
			return -1;
		}
		// 0 für gleich
		else if(this.seitenlaenge == o.seitenlaenge) {
			return 0;
		}
		// 1 für this ist größer
		else {
			return 1;
		}
	}

}
