package SOLID.ISP.Violation;

public class FixedDepositAccount implements BankAccountOperations{

    @Override
    public void deposit(double amount) {
        System.out.println("Depositing into Fixed Deposit");
    }

    @Override
    public void withdraw(double amount) {
        throw new UnsupportedOperationException(
                "Withdrawal not allowed for Fixed Deposit"
        );
    }

    @Override
    public void calculateInterest() {
        System.out.println("Calculating FD interest");
    }

    @Override
    public void closeAccount() {
        System.out.println("Closing FD account");
    }
}
