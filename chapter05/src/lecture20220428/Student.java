package lecture20220428;

public class Student implements Vergleichbar, Comparable {
    // Aufgabe: Wie könnte ein Comparator für Student aussehen?
    // -> Min. eine die Matrikelnummer verwendet
    // -> Erweiterung: beide Suchkriterien
	
    private String name;
    private int matrikelnummer;

    public Student(String name, int matrikelnummer) {
        this.name = name;
        this.matrikelnummer = matrikelnummer;
    }

    public String toString() {
        return "Student [name=" + name + ", matrikelnummer=" + matrikelnummer + "]";
    }

    public String getName() {
        return name;
    }

    public int getMatrikelnummer() {
        return matrikelnummer;
    }
    
    public boolean istGroesserAls(Vergleichbar vrgl) {
    	if(vrgl instanceof Student) {
    		Student st = (Student) vrgl;
    		return this.matrikelnummer > st.matrikelnummer; 
    	}
    	return false;
    }
    
    public int compareTo(Object o) {
    	if(o instanceof Student) {
    		Student st = (Student) o;
			// -1 für this ist kleiner
			// 0 für gleich
			// 1 für this ist größer
    		
    		// Null-Prüfungen ergänzen
    		// Wie sortieren wir unter Verwendung von -1, 0 und 1
    		// -> wenn einer oder beide namen null sind?
    		// -> this.name null -1
    		// -> st.name null 1
    		// -> this.name == st.name, beide null 0
    		
    		if(this.name == null && st.name == null) {
    			return this.matrikelnummer - st.matrikelnummer; // <-
    		} else if(this.name == null) {
    			return -1;
    		} else if(st.name == null) {
    			return 1;
    		}
    		
    		// wie könnten wir zusätzlich noch die matrikelnummer
    		// berücksichtigen?
    		// -> falls name gleich, dann nach matrikelnummer sortieren
    		
    		
    		// int compareTo;
    		// if((compareTo = this.name.compareTo(st.name)) == 0)
    		
    		// Wie könnte mit dem Namen sortiert werden, wenn Strings Comparable implementieren?
    		int compareTo = this.name.compareTo(st.name);
    		if(compareTo == 0) {
    			return this.matrikelnummer - st.matrikelnummer;
    		}
			return compareTo;
    		
    		//return this.matrikelnummer - st.matrikelnummer;
    		//  10 < 100 => 10 - 100 = -90
//    		if(this.matrikelnummer < st.matrikelnummer) {
//    			return -1;
//    		}
//    		//  100 == 100 => 100 - 100 = 0
//    		if(this.matrikelnummer == st.matrikelnummer) {
//    			return 0;
//    		}
//    		//  100 > 10 => 100 - 10 = 90
//    		if(this.matrikelnummer > st.matrikelnummer) {
//    			return 1;
//    		}
    		
    	}
    	return 0;
    	
    	
    }

}








