import java.util.Scanner;

public class AccountController {
    public static void main(String[] args) {
        // Create account array... and add accounts
        // ...
        
        Account current = null;
        Scanner scanner = new Scanner(System.in);
        
        while(true) {
            while(current == null) {
                // Add Login Mechanic
                // ...
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
//                current.deposit(depositeValue);
//                current.print();
                break;
            case "withdraw":
                System.out.print("Value: ");
                double withdrawValue = scanner.nextDouble();
//                current.withdraw(withdrawValue);
//                current.print();
                break;
            case "logout":
//                System.out.println("Logout from " + current.getIban());
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
