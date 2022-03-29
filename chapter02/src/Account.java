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
    	return this.pin == pin && 
    		this.iban.equals(iban);
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
}