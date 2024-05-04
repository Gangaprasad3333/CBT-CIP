import java.util.*;

class Bank {
    private Map<String, Account> accounts;
	

    public Bank() {
        this.accounts = new HashMap<>();
    }

    public void createAccount(String accountId) {
        if (!accounts.containsKey(accountId)) {
            accounts.put(accountId, new Account(accountId));
            System.out.println("Account " + accountId + " created successfully.");
        } else {
            System.out.println("Account " + accountId + " already exists.");
        }
    }

    public void deposit(String accountId, double amount) {
        Account acc = accounts.get(accountId);
        if (acc != null) {
            acc.deposit(amount);
        } else {
            System.out.println("Account " + accountId + " not found.");
        }
    }

    public void withdraw(String accountId, double amount) {
        Account acc = accounts.get(accountId);
        if (acc != null) {
            acc.withdraw(amount);
        } else {
            System.out.println("Account " + accountId + " not found.");
        }
    }
    public double getBalance(String accountId) {
        Account acc = accounts.get(accountId);
        if (acc != null) {
            return acc.getBalance();
        } else {
            System.out.println("Account " + accountId + " not found.");
            return -1;
        }
    }
    public void transfer(String fromAccountNumber, String toAccountNumber, double amount) {
        Account fromAccount = accounts.get(fromAccountNumber);
        Account toAccount = accounts.get(toAccountNumber);

        if (fromAccount != null && toAccount != null) {
            if (toAccount != null) {
            	fromAccount.withdraw(amount);
                toAccount.deposit(amount);
                System.out.println("Transfer successful.");
            } else {
                System.out.println("Insufficient funds for transfer.");
            }
        } 
    }

   }

    



