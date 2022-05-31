package lecture20220531.restaurant.model;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

public class Table {
    private Collection<Reservation> reservations;
    private Map<Article, Integer> bill;
    private int nr;

    public Table(int nr) {
        this.nr = nr;
        this.reservations = new TreeSet<>();
        this.bill = new HashMap<>();
    }
    
    // solange es ein Objekt ist, dass auf "iterable"
    // reduziert / substituiert werden kann
    // kann es in einer for-each hinter dem Doppepunkt
    // platziert werden
    // ---> for(... : ITERABLE)
    public Iterable<Reservation> reservations() {
    	return reservations;
    }
    
    public Iterable<Article> articlesOnBill() {
    	return bill.keySet();
    }
    
    public static void main(String[] args) {
		Table table = new Table(1);
		table.addReservation(new Reservation("20:00", "B"));
		table.addReservation(new Reservation("18:00", "A"));
		for (Reservation r : table.reservations()) {
			System.out.println(r);
		}
		Article pizza = new Article("Pizza", 9.99);
		table.addToBill(pizza);
		table.addToBill(pizza);
		table.addToBill(pizza);
		for(Article a : table.articlesOnBill()) {
			System.out.println(table.getArticleCount(a) + "x" + a);
		}
	}
    
    public int getNr() {
        return nr;
    }
    
    public String toString() {
        return "Table #" + this.nr;
    }
    
    public void addReservation(Reservation res) {
        this.reservations.add(res);
    }
    
    public void addToBill(Article art) {
        int count = 0;
        if(this.bill.containsKey(art)) {
            count = bill.get(art);
        }
        bill.put(art, count + 1);
    }
    
    public int getArticleCount(Article article) {
        if(this.bill.containsKey(article)) {            
            return this.bill.get(article);
        }
        return 0;
    }
}
