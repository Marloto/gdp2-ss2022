public class GgtKgv {
	// ggT
	// Methoden-Definition
	static int ggT(int zahl1, int zahl2) {
		int zahl3;
		do {
			zahl3 = zahl1 % zahl2;
			zahl1 = zahl2;
			zahl2 = zahl3;
		} while(zahl3 != 0);
		return zahl1;
	}
	
	// kgV
//	static int kgV(int a, int b, int teiler) {
//		return a * b / teiler;
//	}
	
	static int kgV(int a, int b) {
		int teiler = ggT(a, b);
		return a * b / teiler;
	}
	
	public static void main(String[] args) {

		  java.util.Scanner scanner = new java.util.Scanner(System.in);
		  System.out.print("m = ");
		  int m = scanner.nextInt();
		  System.out.print("n = ");
		  int n = scanner.nextInt();
		 
		  //... ggT und kgV aufrufen
		  
		  int ggT = ggT(m, n);
		  int kgV = kgV(m, n);
		  
		 
		  // Nutze die folgenden Ausgaben
		  System.out.printf("ggT( %d, %d) = %d\n", m, n, ggT);
		  System.out.printf("kgV( %d, %d) = %d\n", m, n, kgV);
	}
}
