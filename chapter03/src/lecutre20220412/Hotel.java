package lecutre20220412;

public class Hotel extends Unterkunft {
	private Restaurant restaurant;
	private int sterne; // Sterne: 1-5 -> datentyp?
	
	public Hotel(Adresse adresse, String name, int sterne,
			Zimmer... zimmer) {
		this(adresse, new Restaurant(), sterne, name, zimmer);
		//this.restaurant = new Restaurant(); // erzeugung zusammen mit Hotel
	}
	
	public void setSterne(int sterne) {
		this.sterne = Math.max(1, Math.min(5, sterne));
	}

	public Hotel(Adresse adresse, Restaurant restaurant, 
			int sterne, String name, Zimmer[] zimmer) {
		super(adresse, name, zimmer);
		this.restaurant = restaurant;
		this.setSterne(sterne);
	}
	
	public static void main(String[] args) {
		// durch ... kann mehrfach ein Parameter des entsprechenden Typs
		// ergänzt werden, wird wie ein Array genutzt
		//new Hotel(null, "Something", new Zimmer(), new Zimmer(), new Zimmer());
		Unterkunft unterkunft1 = new Unterkunft(null, null, null);
		Unterkunft unterkunft2 = new Unterkunft(null, null, null);
		// if(unterkunft1 == unterkunft2) {} --> false, da unterschiedliche referenzen!
		// if(unterkunft1.equals(unterkunft2)) {} --> false, da unterschiedliche referenzen und keine
		//   implementierung von equals vorgesehen ist!
		System.out.println(unterkunft1.toString());
	}
	
}
