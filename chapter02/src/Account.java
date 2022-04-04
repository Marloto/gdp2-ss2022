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
    
    public static void main(String[] args) {
        Account acc1 = new Account("DE...", 1234, 1.0);
        Account acc2 = new Account("DE...", 1234, 1.0);
        Account[] arr = new Account[]{acc1, acc2};
        Account foo = acc2;
        acc1 = acc2;
        acc2 = foo;
        acc1.withdraw(1);
        for(Account a : arr) {
        	a.print();
        }
	}
}