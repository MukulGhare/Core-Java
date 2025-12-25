package SOLID.ISP.Compliant;

public class FixedDepositAccount implements Depositable,InterestBearing{
    @Override
    public void deposit(double amount) {
        System.out.println("Depositing into Fixed Deposit");
    }

    @Override
    public void calculateInterest() {
        System.out.println("Calculating FD interest");
    }


}
