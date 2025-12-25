package SOLID.LiskovSub.Violation;

public class ViolationFDAccount {


    public static void main(String[] args) {
        Account savings = new Account(5000);
        Account fd = new FixedDepositAccount(10000);

        savings.withdraw(500);
        fd.withdraw(500); // Will throw Exception
    }
}

class Account {

    protected double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }
}

class FixedDepositAccount extends Account {

    public FixedDepositAccount(double balance) {
        super(balance);
    }

    @Override
    public void withdraw(double amount) {
        throw new UnsupportedOperationException(
                "Withdrawal not allowed for Fixed Deposit Account"
        );
    }
}
