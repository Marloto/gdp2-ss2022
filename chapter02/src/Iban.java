public class Iban {
    private String iban;
    
    // https://pastie.io/dzyefi.java
    
    public static void main(String[] args) {
    	System.out.println((byte)'A');
		Iban iban2 = new Iban("DE02 1203 0000 0000 2020 51");
		System.out.println(iban2.validate());
		
//		String something = iban2.toString();
//		System.out.println(something);
		System.out.println(iban2);
	}
    
    public String toString() {
    	return "Iban " + this.iban;
    }
    
    public Iban(String iban) {
		this.iban = iban;
		this.fix();
	}
    
    public String getIban() {
		return iban;
	}
    
    private void fix() {
    	// de01 1234 5678... => DE0112345678...
    	// DE01 1234 5678... => DE0112345678...
    	// DE01-1234-5678... => DE0112345678...
    	// nur Großbuchstaben und Zahlen
    	
    	String result = this.iban.toUpperCase();
    	String newIban = "";
    	
    	// kleine Info: char example = 'Z' - 'A';
    	
    	// Alternative mit replace-Methode
    	// result = this.iban.replace("-", "");
    	// result = this.iban.replace(" ", "");
    	
    	// Alternative mit Schleife über den String
    	// jedes Character auswerten
    	int length = result.length();
    	for(int i = 0; i < length; i ++) {
    		char charAt = result.charAt(i);
    		if(charAt >= 'A' && charAt <= 'Z') {
    			newIban += charAt;
    		} else if(charAt >= '0' && charAt <= '9') {
    			newIban += charAt;
    		// } else if(charAt == ' ' || charAt == '-') {
    			
    		}
    		
//    		if((charAt >= 'A' && charAt <= 'Z') || 
//    				(charAt >= '0' && charAt <= '9')) {
//    			newIban += charAt;
//    		}
    	}
    	this.iban = newIban;
	}
    
    public boolean validate() {
    	// 1. Check if length == 22 wenn "DE"
    	// 2. ersten vier zeichen an das Ende schieben
    	// 3. Ersetzen von allen Buchstaben durch: 
    	//    A = 10, B = 11, C = 12, usw.
    	// 4. gesamtstring als integer => mod 97
    	
    	// Variante 1
    	if(!this.iban.startsWith("DE")) {
    		return false;
    	}
    	
    	// Variante 2
    	String substring = this.iban.substring(0, 2);
    	if(!substring.equals("DE")) {
    		// ...
    		return false;
    	}
    	
    	// Variante 3
    	char first = this.iban.charAt(0);
    	char second = this.iban.charAt(1);
    	if(first != 'D' || second != 'E') {
    		// 3
    		return false;
    	}
    	
    	// Länge == 22
    	if(this.iban.length() != 22) {
    		return false;
    	}
    	

    	// 2. ersten vier zeichen an das Ende schieben
    	// missing...
    	// "DE0112345678" => "12345678DE01"
    	String start = this.iban.substring(0, 4);
    	String end = this.iban.substring(4);
    	String newIban = end + start;
    		

    	// 3. Ersetzen von allen Buchstaben durch: 
    	//    A = 10, B = 11, C = 12, usw.
    	// Variante 1: charAt + iteration mit switch rausfiltern
    	// Variante 2: charAt + iteration mit Berechnung
    	// Variante 3: replace
    	// Variante 4: charAt iteration + Umrechnung
    	String res = "";
    	for(int i = 0; i < newIban.length(); i ++) {
    		char charAt = newIban.charAt(i);
    		if(charAt >= 'A' && charAt <= 'Z') {
    			res += charAt - 'A' + 10;
    		} else {
    			res += charAt;
    		}
    	}
    	
    	// Umwandlung einer Zeichenkette mit 24 Stellen, 
    	// und anschließend mod 97
    	// -> double, 64 Bit
    	// -> int, 32 Bit
    	// -> 24 Stellen zuviel für die primitiven Datentypen!
    	// Trick: aufteilen
    	// ersten 9 Zeichen, dann mod 97 und ergebnis mit den nächsten 7
    	
    	String check = res.substring(0, 2);
    	String rest = res.substring(2);
    	for(int i = 0; i < rest.length(); i+=7) {
 
    		int until = Math.min(rest.length(), i + 7);
    		String part = check + rest.substring(i, until);
    		int checksum = Integer.parseInt(part) % 97;
    		// check = checksum + "";
    		check = Integer.toString(checksum);
    	}
    	
    	if(Integer.parseInt(check) == 1) {
    		return true;
    	}
    	
    	return false;
    	
    	//return check.equals("1");
	}
}
