package lecture20220623.cooking;

public class Chef implements Runnable {
    
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
    
    public void start() {
        // die den Chef als Thread startet... 
        // was ist notwendig?
        // this.start() -> geht das, warum geht das nicht?
        //   -> von außen kann man das nutzen
        Thread thread = new Thread(this);
        thread.start();
    }

    public void run() {
        // - Setzen Sie das Attribut working auf true
        // - Beziehen Sie aus der Bestellliste im Attribut orders eine neue Bestellung mit get
        // - Prüfen Sie ob die Bestellung ungleich null ist
        // - Setzen Sie das Attribut current auf das entsprechenden Rezept
        // - Starten Sie das Kochen, nutzen Sie hierfür den CookingSimulator3000X und 
        //   rufen Sie die statische Methode cooking auf
        
        this.working = true;
        while(this.orders.size() > 0) {
            Recipe recipe = this.orders.get();
            if(recipe != null) {
                this.current = recipe;
                
                // Hierdrin wird für x Sekunden das Rezept gekocht und
                // alle paar ms wird der Zustand des Kochprozess über
                // das Consumable kommuniziert
                CookingSimulator3000X.cooking(recipe, s -> state = s);
            }
        }
        this.working = false;
    }
    
    public String toString() {
        if(this.working) {
            int s = (int)(this.state * 100.0);
            return String.format("%5s: %20s %6s", this.name, this.current, s != 100 ? s + "%" : "fertig");
        }
        return String.format("%5s: %27s", this.name, "nichts zu tun");
    }
}