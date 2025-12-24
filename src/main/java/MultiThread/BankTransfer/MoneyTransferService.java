package MultiThread.BankTransfer;


import java.math.BigDecimal;
import java.util.concurrent.locks.Lock;

public class MoneyTransferService {

    public void deposit(Account account, BigDecimal amount){
        validateAmount(amount);
        Lock accountLock = account.getLock();
    
        accountLock.lock();
        try {
            account.deposit(amount);
        }  finally {
            accountLock.unlock();
        }
    }

    public void withdraw(Account account,BigDecimal amount){
        validateAmount(amount);
        Lock accountLock = account.getLock();

        accountLock.lock();
        try {
            account.withdraw(amount);
        } finally {
            accountLock.unlock();
        }
    }

    public void transfer(Account from, Account to, BigDecimal amount){
        validateAmount(amount);

        Lock firstLock = from.getAccountID() < to.getAccountID() ? from.getLock() : to.getLock();
        Lock secondLock = from.getAccountID() < to.getAccountID() ? to.getLock() : from.getLock();

        firstLock.lock();
        try {
            secondLock.lock();
            try {
                from.withdraw(amount);
                to.deposit(amount);
            } finally {
                secondLock.unlock();
            }
        } finally {
            firstLock.unlock();
        }

    }

    private void validateAmount( BigDecimal amount){
        if (amount.compareTo(BigDecimal.ZERO) <= 0) {
            throw new IllegalArgumentException("Amount should be more than zero.");
        }
    }
}
