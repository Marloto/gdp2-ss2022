package lecture20220428;

import java.util.Comparator;
//                                                               Teaser für "Generics"
public class MatrikelnummerUndNameSortierer implements Comparator<Student> {

	public int compare(Student o1, Student o2) {
		if(o1 == null && o2 == null) {
			return 0;
		}
		if(o1 == null) {
			return -1;
		}
		if(o2 == null) {
			return 1;
		}
		
		if(o1 instanceof Student) {
			if(o2 instanceof Student) {
				Student s1 = (Student) o1;
				Student s2 = (Student) o2;
				
				// -1 für o1 ist kleiner
				// 0 für o1 == o2
				// 1 für o1 ist größer
				int value = s1.getMatrikelnummer() - s2.getMatrikelnummer();
				

				if(value == 0) {
					String n1 = s1.getName();
					String n2 = s2.getName();
					if(n1 == null && n2 == null) {
						return 0;
					}
					if(n1 == null) {
						return -1;
					}
					if(n2 == null) {
						return 1;
					}
					return n1.compareTo(n2);
				}
				
				
				return value;
			}
		}
		return 0; // Offen: was wenn o1 und o2 nicht beide vom Typ Student sind?
	}
	

}


























/*



				if(value == 0) {
					String n1 = s1.getName();
					String n2 = s2.getName();
					if(n1 == null && n2 == null) {
						return 0;
					}
					if(n1 == null) {
						return -1;
					}
					if(n2 == null) {
						return 1;
					}
					return n1.compareTo(n2);
				}




 */