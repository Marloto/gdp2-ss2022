package lecture20220602;

interface Wiegbar { /*...*/ }
class Tier implements Wiegbar { /*...*/ }
class Hund extends Tier { /*...*/ }
class Katze extends Tier {/*...*/ }

public class Example {
	public static void main(String[] args) {
		Tier k2 = new Katze();
		Tier var1 = k2;
		Wiegbar var2 = k2;
		Object var4 = k2;
		
		// Katze var5 = k2; nur mit cast!
	}
}
