package lecture20220421;

public class Quadrat extends GeometrischesObjekt {
	private double seitenLaenge;
	
	public double berechneUmfang() {
		return 4 * seitenLaenge;
	}
	
	public static void main(String[] args) {
		GeometrischesObjekt[] arr = new GeometrischesObjekt[] { 
				new Quadrat(), new Dreieck() };
		for(GeometrischesObjekt obj : arr) {			
			double u = obj.berechneUmfang();
			System.out.println(u);
		}
	}
}
