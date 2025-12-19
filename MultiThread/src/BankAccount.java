import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {
    private int balance;
    private final Lock lock = new ReentrantLock();

    public BankAccount(){
        this.balance = 1000;
    }

    public synchronized void credit(int amount){
        // validateAmount()
        balance = balance+amount;
    }


    //explicitLocking using Lock interface
    public void withdraw(int amount){
        System.out.println(Thread.currentThread().getName() + " Attempting Withdraw ");

        try {
            if ( lock.tryLock(1000, TimeUnit.MILLISECONDS)) {
                System.out.println(Thread.currentThread().getName() + " Performing Withdraw ");
                if( balance >= amount) {
                    try {
                        Thread.sleep(3000);
                        balance -= amount;
                        System.out.println(Thread.currentThread().getName() + " Withdraw completed, Current Balance " + balance);
                    } catch (Exception e) {
                        Thread.currentThread().interrupt();
                    } finally {
                        lock.unlock();
                    }

                } else {
                    System.out.println(Thread.currentThread().getName() + " Insufficient Balance ");
                }

            } else {
                System.out.println(Thread.currentThread().getName() + " Could Not acquire lock, will try again ! ");
            }

        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

    }


    // Implicit Locking using 'synchronized'
    public  synchronized void debit(int amount){

        System.out.println(Thread.currentThread().getName() + " attempting to debit " + amount);

        if ( balance >= amount){
            try {
                System.out.println(Thread.currentThread().getName() + " performing debit ");
                Thread.sleep(3000);
            } catch (InterruptedException e) {
            }

            balance -= amount;
            System.out.println(Thread.currentThread().getName() + " Debit completed. Current Balance "+balance);
        } else {
            System.out.println(Thread.currentThread().getName() + " Insufficient Balance ");
        }

    }

    public int getBalance() {
        return balance;
    }
}
