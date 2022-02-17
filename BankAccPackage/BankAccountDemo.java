package BankAccPackage;

public class BankAccountDemo {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("Gopi", 5000);
        bankAccount.deposit(-1);
        bankAccount.deposit(5000);

        bankAccount.withdraw(11000);
        bankAccount.withdraw(9000);

        System.out.println("Balance is: "+bankAccount.getBalance());
    }
}
