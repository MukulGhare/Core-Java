package Bank;

import java.math.BigDecimal;
import java.util.concurrent.locks.Lock;

public class MoneyTransferService {

    public void deposit(BankAccount account, BigDecimal amount){
        validateAmount(amount);
        System.out.println("Attempting to deposit " + amount + " from " + account.getAccountNo());
        Lock accountLock = account.getLock();

        accountLock.lock();
        try {
            account.deposit(amount);
        } finally {
            accountLock.unlock();
        }
        System.out.println("Deposit Successful ! Current Balance " + account.getBalance());

    }

    public void withdraw(BankAccount account, BigDecimal amount){
        validateAmount(amount);
        System.out.println("Attempting to withdraw " + amount + " from " + account.getAccountNo());
        Lock accountLock = account.getLock();

        accountLock.lock();
        try {
            account.withdraw(amount);
        } finally {
            accountLock.unlock();
        }
        System.out.println("Withdraw Successful ! Current Balance " + account.getBalance());

    }


    public void transfer(BankAccount from, BankAccount to, BigDecimal amount){
        validateAmount(amount);
        System.out.println("Attempting to transfer " + amount + " from " + from.getAccountNo() + " to " + to.getAccountNo());

        Lock firstLock;
        Lock secondLock;

        firstLock = from.getAccountNo() < to.getAccountNo() ? from.getLock() : to.getLock();
        secondLock = from.getAccountNo() < to.getAccountNo() ? to.getLock() : from.getLock();

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
        System.out.println("Transfer Successful ! ");

    }



    private void validateAmount(BigDecimal amount){
        if( amount.compareTo(BigDecimal.ZERO) <= 0){
            throw new IllegalArgumentException("Amount should be more than zero !");
        }
    }
}
