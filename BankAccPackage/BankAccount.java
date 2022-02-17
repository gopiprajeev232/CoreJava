package BankAccPackage;

public class BankAccount {
    private String owner;
    private int balance;

    public BankAccount(String owner) {
        this.owner = owner;
        balance = 0;
    }

    public BankAccount(String owner, int balance) {
        if(balance <= 0) {
            System.out.println("Invalid balance.");
        }

        else {
            this.owner = owner;
            this.balance = balance;
        }
    }

    void deposit(int amount) {
        if(amount <= 0) {
            System.out.println("Invalid amount to deposit.");
        }

        else {
            balance += amount;
            System.out.println(amount + " has been deposited. New balance is: " + balance);
        }
    }

    void withdraw(int amount) {
        if(amount <=0) {
            System.out.println("Invalid amount to withdraw.");
        }

        else if(amount > balance) {
            System.out.println("You are trying to withdraw more than you have!");
        }

        else {
            balance -= amount;
            System.out.println("You withdrew "+amount+". New balance is: "+balance);
        }
    }

    int getBalance() {
        return balance;
    }
}
