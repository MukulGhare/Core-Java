import java.math.BigDecimal;
import java.util.concurrent.locks.Lock;

public class BankTransfer {

    public  void  deposit(Account account, BigDecimal amount){
        validateAmount(amount);
        Lock lock = account.getLock();

        lock.lock();
        try {
            account.addBalance(amount);
        }finally {
            lock.unlock();
        }

    }

    public  void  withdraw(Account account, BigDecimal amount){
        validateAmount(amount);
        Lock lock = account.getLock();

        lock.lock();
        try {

            account.subBalance(amount);
        }finally {
            lock.unlock();
        }

    }


    public void transfer(Account from, Account to , BigDecimal amount){
        if (from == to) {
            throw new IllegalArgumentException("Cannot transfer to same account");
        }
        validateAmount(amount);
        Lock first = from.getAccountId() < to.getAccountId() ? from.getLock() : to.getLock();
        Lock second = from.getAccountId() < to.getAccountId() ? to.getLock() : from.getLock();

        first.lock();
        try {

            second.lock();
            try {

                from.subBalance(amount);
                to.addBalance(amount);

            }finally {
                second.unlock();
            }

        } finally {
            first.unlock();
        }


    }

    private void validateAmount(BigDecimal amount) {
        if (amount == null || amount.compareTo(BigDecimal.ZERO) <= 0) {
            throw new IllegalArgumentException("Please input valid amount");
        }
    }
}
