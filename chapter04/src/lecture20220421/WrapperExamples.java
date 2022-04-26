package lecture20220421;

public class WrapperExamples {
	public static void main(String[] args) {
		// Wrapper-Klasse: wrappen primitive Datentypen
		//   in Attributen ihrer passenden Klasse
		int x1 = 42;
		Integer x2 = new Integer(42); // nicht üblich
		Integer x3 = Integer.valueOf(42); // empfohlener Weg
		int x3_ = Integer.parseInt("42"); // -> erzeugt primtivien Datentyp
		Integer x4 = x3;
		// byte x5 = Byte.parseByte("129"); Exception, weil zu groß
		
		// Autoboxing / Autounboxing
		int x6 = x2.intValue();
		int x7 = x2; // Autounboxing -> x2.value auf 
		   // primitiven Datentypen zuweisen
		Integer x8 = 42; // Autoboxing
		
		// int = int + Integer
		int x9 = 41 + Integer.valueOf(1); // 41 + 1
		Integer x10 = 41 + Integer.valueOf(1); // zuvor Autounboxing für 
		  //  Integer(1), Autoboxing für 41 + 1
		
		if(x2 == 42) {
			System.out.println("x2 == 42");
		}
		if(x1 == Integer.valueOf(42)) {
			System.out.println("x1 == 42");
		}
		
		if(Integer.valueOf(1) == Integer.valueOf(1)) {
			System.out.println("1 == 1");
		}
		if(Integer.valueOf(128) == Integer.valueOf(128)) {
			System.out.println("128 == 128");
		}
		if(x2.equals(x10)) {
			System.out.println("x2 == x10");
		}
		
		int[] arr1 = new int[] {1, 2, 3};
		// Integer[] arr2 = arr1; geht nicht!
		Integer[] arr3 = new Integer[] { // einzelnes unboxing
				arr1[0],
				arr1[1],
				arr1[2]
		};
		
	}
}









