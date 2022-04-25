package lecture20220426;

public class Quadrat {
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
}
