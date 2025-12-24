package OOPS;

public class Inheritance {

    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount(1000);

        // Can call deposit() due to Inheritance
        savingsAccount.deposit(555.55);

        System.out.println("Balance : "+savingsAccount.getBalance());
    }

}

class BankAccount {
    private final int accountNumber;
    protected double balance;

    public BankAccount(int accountNumber){
        this.accountNumber=accountNumber;
        this.balance=0.0;
    }

    public void deposit(double amount){
        if(amount <= 0) throw  new IllegalArgumentException("Deposit amount must be positive");

        balance += amount;
    }

    public double getBalance() {
        return balance;
    }
}

class SavingsAccount extends BankAccount{

    public SavingsAccount(int accountNumber) {
        super(accountNumber);
    }

    // NO METHODS in Child Class
}
