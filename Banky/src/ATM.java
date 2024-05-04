import java.util.Scanner;
public class ATM {
    public static void main(String[] args) {
        Bank bank = new Bank();
       
        Scanner scanner = new Scanner(System.in);
        System.out.println("=================");

        System.out.println("Welcome to ATM!");
        System.out.println("=================");

        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Transfer");
            System.out.println("5. Exit");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter account ID:");
                    String accountId = scanner.next();
                    bank.createAccount(accountId);
                    break;
                case 2:
                    System.out.println("Enter account ID:");
                    accountId = scanner.next();
                    System.out.println("Enter amount to deposit:");
                    double depositAmount = scanner.nextDouble();
                    bank.deposit(accountId, depositAmount);
                    break;
                case 3:
                    System.out.println("Enter account ID:");
                    accountId = scanner.next();
                    System.out.println("Enter amount to withdraw:");
                    double withdrawAmount = scanner.nextDouble();
                    bank.withdraw(accountId, withdrawAmount);
                    break;
                case 4:
                	System.out.print("Enter source account number: ");
                    String fromAccNum = scanner.next();
                    System.out.print("Enter destination account number: ");
                    String toAccNum = scanner.next();
                    System.out.print("Enter transfer amount: ");
                    double transferAmount = scanner.nextDouble();
                    System.out.println("Transfer initiated from account: " + fromAccNum);
                    System.out.println("Transfer initiated to account: " + toAccNum);
                    System.out.println("Transfer amount: " + transferAmount);
                    bank.transfer(fromAccNum, toAccNum, transferAmount);
                    System.out.println(transferAmount +" Amount transfered successfully");
                    break;
                   
                case 5:
                    System.out.println("Thank you for using BankY");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice Please choose again.");
            }
        }
    }
}
