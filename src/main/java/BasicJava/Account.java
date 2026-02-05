import java.math.BigDecimal;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Account {

    private int accountId;
    private BigDecimal balance;
    private final Lock lock = new ReentrantLock();

    public Account(int accountId){
        this.accountId=accountId;
        this.balance = BigDecimal.ZERO;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public int getAccountId() {
        return accountId;
    }

    public void addBalance(BigDecimal amount){
        balance=balance.add(amount);
    }

    public void subBalance(BigDecimal amount){
        if( amount.compareTo(balance) > 0 ){
            throw new IllegalArgumentException("Insufficient Balance");
        }
        balance=balance.subtract(amount);
    }

    public Lock getLock() {
        return lock;
    }
}
