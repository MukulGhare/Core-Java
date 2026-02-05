package Bank;

import java.math.BigDecimal;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {

    private int accountNo;
    private BigDecimal balance;
    private Lock lock = new ReentrantLock();


    public BankAccount(int accountNo){
        this.accountNo=accountNo;
        this.balance=BigDecimal.ZERO;
    }

    public int getAccountNo() {
        return accountNo;
    }

    public Lock getLock() {
        return lock;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void deposit(BigDecimal amount){

        balance=balance.add(amount);
    }

    public void withdraw(BigDecimal amount){
        if(amount.compareTo(balance) > 0){
            throw  new IllegalArgumentException("Insufficient Balance");
        }
        balance =balance.subtract(amount);
    }

}
