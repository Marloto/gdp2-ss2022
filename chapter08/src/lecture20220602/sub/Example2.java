package lecture20220602.sub;

interface A {}

interface B extends A {}
 
class Vermoegen implements Comparable<Vermoegen> {
	public int compareTo(Vermoegen o) {
		return 0;
	}
}
 
class Bankkonto extends Vermoegen implements A {}
 
class Wertpapier extends Vermoegen implements B  {}
 
class Immobilie extends Vermoegen {}
 
class Sparkonto extends Bankkonto {}
 
class Girokonto extends Bankkonto {}
 
class Optionsschein extends Wertpapier {}
 
class Aktie extends Wertpapier {}

public class Example2 {
	public static void main(String[] args) {
		Bankkonto[] list = null;
		Vermoegen[] list2 = list;
		Comparable[] list3 = list;
		A[] list4 = list;
		Object[] list5 = list;
	}
}
