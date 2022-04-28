package lecture20220428;

import java.util.Comparator;

public class QuadratSeitenlaengenSortierer implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		// Wie sortieren in Anlehnung an compareTo
		// o1 und o2 seien Quadrate
		
		// 1. Schritt prüfen ob o1 || o2
		if(o1 == null && o2 == null) {
			return 0;
		}
		if(o1 == null) {
			return -1;
		}
		if(o2 == null) {
			return 1;
		}
		
		// Theoretisch müsste man auch den
		// Fall betrachten in dem z.B. Quadrat mit 
		// Student verglichen wird, wie soll dann sortiert werden?
		if(o1 instanceof Quadrat) {
			if(o2 instanceof Quadrat) {
				Quadrat q1 = (Quadrat) o1;
				Quadrat q2 = (Quadrat) o2;
				
				// -1 für o1 ist kleiner
				// o1 == 10 && o2 == 100
				// 0 für o1 == o2
				// 1 für o1 ist größer
				return q1.getSeitenlaenge() - q2.getSeitenlaenge();
			}
		}
		return 0;  // Offen: was wenn o1 und o2 nicht beide vom Typ Student sind?
	}

}
