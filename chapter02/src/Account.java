public class Account {
	private String iban;
	private int pin;
	private double balance;

	public Account(String iban, int pin, double balance) {
		this.iban = iban; // Referenz auf das aktuelle Objekt
		this.pin = pin;
		this.balance = balance;
	}

	public String getIban() {
		return iban;
	}

	public boolean login(String iban, int pin) {
		return this.pin == pin && this.iban.equals(iban);
	}

	public void deposit(double value) {
		balance += value;
	}

	public void withdraw(double value) {
		balance -= value;
	}

	public void print() {
		System.out.print("Account");
		System.out.print(iban);
		System.out.print(" with balance ");
		System.out.print(balance);
		System.out.println(" €.");
	}

	// Übung: definieren Sie die equals-Methode
	public boolean equals(Object object) {
		if (object == null) {
			return false;
		}
		Account other = (Account) object;
		return other.iban.equals(this.iban) && other.pin == this.pin && other.balance == this.balance;
	}

	// Rechtsklick -> Source -> Generate toString
//	public String toString() {
//		return "Account [iban=" + iban + ", pin=" + pin + ", balance=" + balance + "]";
//	}

	public String toString() {
		// Relevante Informationen zurückgeben in Form eines Strings
		return "Account mit Iban " + this.iban + " = " + this.balance;
	}

	public static void main(String[] args) {
		Account acc1 = new Account("DE...", 1234, 1.0); // A
		Account acc2 = new Account("DE...", 1234, 1.0); // B

		// Aufgabe 1: Wird die folgende Ausgabe erzeugt?
		// -> es sind unterschiedliche Objekte
		// -> Attribute vergleichen, bei primitiven Datentypen
		// -> Übung: definieren Sie die equals-Methode
		// -> Objekt, welches Methode ausführt muss != null sein,
		// andernfalls NullPointerException
		if (acc1 != null && acc1.equals(acc2)) { // iban ist String
			System.out.println("acc1 == acc2");
		}

		// Aufgabe 2: wie kann das Objekt (in acc1 oder acc2)
		// ausgegeben werden
		// -> Attribute, solange zugreifbar, manuell ausgeben
		// -> toString-Methode um die Repräsentation als String
		// umzusetzen
		System.out.println(acc1);
		System.out.println(acc2);

		// Aufgabe 3: Was ist die Ausgabe?
		Account[] arr = new Account[] { acc1, acc2 };
		Account foo = acc2;
		acc1 = acc2;
		acc2 = foo;
		
		acc1.withdraw(1);
		for (Account a : arr) {
			System.out.println(a);
		}
	}
}