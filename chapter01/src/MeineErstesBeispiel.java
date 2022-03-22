class MeinErstesBeispiel {
	public static void main(String[] args) {
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		int zahl2 = scanner.nextInt();
		String eingabe = scanner.next();
		
		int zahl = 32; // lokale variable
		String someString = "Test-Message";
		
		System.out.println("Hello, World!");
		System.out.println(someString);
		System.out.println(zahl);
		System.out.println(eingabe);
		System.out.println(zahl2);
		
		if(zahl2 == 42) {
			System.out.println("Perfekte Antwort!");
		} else {
			System.out.println("Schlechte Antwort!");
		}
		
		int i;
		for(i = 0; i < 10; ++ i) {
			System.out.println("Schleife 1: " + i);
		}
		
		for(int j = 0; j < 10; ++ j) {
			System.out.println("Schleife 2: " + j);
		}
		
		// Veränderung zu while-Schleife
		int k = 0;
		while(k < 10) {
			System.out.println("Schleife 3: " + k);
			k ++;
		}
		
		// Methoden-Signatur
		int res1, res2, res3;
		int a1 = 200;
		int a2 = 10;
		int a3 = 21;
		
		res1 = doSomething(a1, 1);
		res2 = doSomething(10, a2);
		res3 = doSomething(a3, 21);
		
		printSomething(a2, a3);
		
		
		double d1 = 1.1;
		double d2 = 2.3;
		doSomething2(d1, d2);
		
		doSomething((int) d1, (int) d2);
		
		doSomething3((byte) a1, (byte) a2);
	}
	
	// [public] static <returntype> <name>(<parameterliste>)
	static int doSomething(int a, int b) {
		return a + b;
		// <- System.out.println("...");
	}
	
	static void printSomething(int a, int b) {
		int res = a + b;
		System.out.println(res);
		return;
	}
	
	static void hello(String xyz) {
		System.out.println(xyz);
	}

	static double doSomething2(double a, double b) {
		return a + b;
		// <- System.out.println("...");
	}

	static byte doSomething3(byte a, byte b) {
		System.out.println(a);
		System.out.println(b);
		return (byte) (a + b);
		// <- System.out.println("...");
	}
	
	
	
	
	
	
	
	
	
}