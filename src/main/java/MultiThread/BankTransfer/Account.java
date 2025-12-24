package MultiThread.BankTransfer;
import java.math.BigDecimal;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Account {

    private final int accountID;
    private BigDecimal balance;
    private final Lock lock = new ReentrantLock();

    public Account(int accountID){
        this.accountID = accountID;
        this.balance = BigDecimal.ZERO;
    }

    public Lock getLock() {
        return lock;
    }

    public int getAccountID() {
        return accountID;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void deposit(BigDecimal amount){

        balance = balance.add(amount);
    }

    public void  withdraw(BigDecimal amount){


        if(amount.compareTo(balance) > 0 ){
            throw  new IllegalArgumentException("Insufficient Balance");
        }

        balance = balance.subtract(amount);
    }



}
