package SOLID.LiskovSub.Compliant;

public class CompliantFDAccount {

    public static void main(String[] args) {

        WithdrawableAccount savings = new SavingsAccount(5000);
        Account fd = new FDAccount(10000);

        savings.withdraw(500);
        // fd.withdraw(5000); // no withdraw method


    }
}

abstract class Account {

    protected double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }
}

abstract class WithdrawableAccount extends Account {

    public WithdrawableAccount(double balance) {
        super(balance);
    }

    public abstract void withdraw(double amount);
}

class SavingsAccount extends WithdrawableAccount {

    public SavingsAccount(double balance) {
        super(balance);
    }

    @Override
    public void withdraw(double amount) {
        balance -= amount;
    }
}

class FDAccount extends Account {

    public FDAccount(double balance) {
        super(balance);
    }

    // No withdraw() here — and that's OK
}
