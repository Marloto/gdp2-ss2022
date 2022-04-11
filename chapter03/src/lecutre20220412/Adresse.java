package lecutre20220412;

public class Adresse {
	private String strasse;
	private String plz;
	private String city;

	public Adresse(String strasse, String plz, String city) {
		this.strasse = strasse;
		this.plz = plz;
		this.city = city;
	}

	public String getCity() {
		return city;
	}

	public String getPlz() {
		return plz;
	}

	public String getStrasse() {
		return strasse;
	}
}
