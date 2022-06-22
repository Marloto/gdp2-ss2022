package lecture20220623.cooking;

public class Chef {
    
    private String name;
    private Orders orders;
    private boolean working;
    private Recipe current;
    private double state;

    public Chef(String name, Orders orders) {
        this.name = name;
        this.orders = orders;
        this.working = false;
    }
    
    public boolean isWorking() {
        return working;
    }
    
    
    
    public String toString() {
        if(this.working) {
            int s = (int)(this.state * 100.0);
            return String.format("%5s: %20s %6s", this.name, this.current, s != 100 ? s + "%" : "fertig");
        }
        return String.format("%5s: %27s", this.name, "nichts zu tun");
    }
}