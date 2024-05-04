import java.util.*;

class Account {
    private String accountId;
    private double balance;
   

    public Account(String accountId) {
        this.accountId = accountId;
        this.balance = 0.0;
    }

    public String getAccountId() {
        return accountId;
    }

    public double getBalance() {
        return balance;
    }
   
    public void deposit(double amount) {
        balance += amount;
        
        System.out.println("$" + amount + " deposited into account " + accountId);
    }

    public void withdraw(double amount) {
        if (amount<=balance) {
            balance -= amount;
            
            System.out.println("$" + amount + " withdrawn from account " + accountId);
        } else {
            System.out.println("Insufficient funds in account " + accountId);
        }
    }
   	 
    	public void transfer(Account fromAccount, Account toAccount, double amount) {
            if (amount <= 0) {
                System.out.println("Invalid transfer amount");
                return;
            }

            if (fromAccount.getBalance() < amount) {
                System.out.println("Insufficient funds");
                return;
            }

            fromAccount.withdraw(amount);
            toAccount.deposit(amount);
            System.out.println("Transfer successful");
        }
   }

