package lecture20220503;

import java.util.Comparator;

public class UmfangSortierter implements Comparator<GeometrischesObjekt> {

	@Override
	public int compare(GeometrischesObjekt o1, GeometrischesObjekt o2) {
		// nullprüfung ggf. ergänzen
		
		if(o1.berechneUmfang() < o2.berechneUmfang()) {
			return -1;
		} else if(o1.berechneUmfang() > o2.berechneUmfang()) {
			return 1;
		}
		
		return 0;
	}

}
