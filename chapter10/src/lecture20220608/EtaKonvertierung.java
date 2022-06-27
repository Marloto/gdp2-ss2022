package lecture20220608;

import java.util.function.Consumer;

public class EtaKonvertierung {
	public static void doSomething(Consumer<String> consume) {
		consume.accept("Hello");
	}
	
	private static void other(String alt) {
		System.out.println(alt);
	}
	
	private void other2(String alt) {
		System.out.println(alt);
	}
	
	public static void main(String[] args) {
		// Gibt alle Parameter an die angegebene Methode
		// weiter, ohne das dies in einem Lambda 
		// beschrieben werden muss
		doSomething(System.out::println);
		doSomething(EtaKonvertierung::other);
		
		EtaKonvertierung example = new EtaKonvertierung();
		doSomething(example::other2);
		doSomething(new EtaKonvertierung()::other2);
		
		// wird unter der haube folgendes erzeugt...
		doSomething((s) -> System.out.println(s));
		doSomething((s) -> other(s));
	}
}






