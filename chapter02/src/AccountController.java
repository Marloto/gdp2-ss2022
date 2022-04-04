import java.util.Scanner;

public class AccountController {
    public static void main(String[] args) {
        // Create account array... and add accounts
        Account[] accounts = new Account[] {
        		new Account("DE91100000000123456789", 1234, 1000.0),
        		new Account("DE88100900001234567892", 4321, -100.0),
        		new Account("DE02701500000000594937", 9999, 0.0),
        		new Account("DE02100100100006820101", 1111, 2000.0)
        }; 
        // Vergrößerung: neues Array, daten kopieren, neue
        //   Referenz merken!
        
        Account current = null;
        Scanner scanner = new Scanner(System.in);
        
        while(true) {
            while(current == null) {
                // Add Login Mechanic
            	System.out.print("IBAN: ");
            	String ibanText = scanner.next();
            	Iban iban = new Iban(ibanText);
            	
            	System.out.print("Pin: ");
            	int pin = scanner.nextInt();
            	
            	for(Account account : accounts) {
            		if(account.login(iban.getIban(), pin)) {
            			current = account;
            			break;
            		}
            	}
            	
            	if(current == null) {
            		System.out.println("Login failed");
            	} else {
            		System.out.println("Login successfully");
            	}
            }

            System.out.println("Commands:");
            System.out.println("   deposit - add balance to account");
            System.out.println("   withdraw - remove balance from account");
            System.out.println("   logout - logout from account");
            System.out.println("   exit - stop tool");
            System.out.print(" > ");
            String cmd = scanner.next();
            switch(cmd) {
            case "deposit":
                System.out.print("Value: ");
                double depositeValue = scanner.nextDouble();
                current.deposit(depositeValue);
                current.print();
                break;
            case "withdraw":
                System.out.print("Value: ");
                double withdrawValue = scanner.nextDouble();
                current.withdraw(withdrawValue);
                current.print();
                break;
            case "logout":
                System.out.println("Logout from " + current.getIban());
                current = null;
                break;
            case "exit":
                scanner.close();
                System.out.println("Bye!");
                return;
            }
        }
    }
}
