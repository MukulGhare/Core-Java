
public class Main {


    public static void main(String[] args) throws InterruptedException {
        BankAccount sharedAccount = new BankAccount();

        Runnable task = new Runnable() {
            @Override
            public void run() {
                //sharedAccount.debit(500);
                sharedAccount.withdraw(500);
            }
        };

        Thread t1 = new Thread(task,"Thread 1");
        Thread t2 = new Thread(task,"Thread 2");
        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(sharedAccount.getBalance());

//       Counter counter = new Counter();
//
//       MyThread t1 = new MyThread(counter);
//       MyThread t2 = new MyThread(counter);
//
//       t1.start();
//       t2.start();
//
//       try {
//           t1.join();
//           t2.join();
//       } catch (InterruptedException e) {
//
//       }
//
//        System.out.println(counter.getCount());

    }
}

/*
OUTPUT
Thread 2 Attempting to Withdraw
Thread 1 Attempting to Withdraw
Thread 2 Performing Withdraw
Thread 1 Could Not acquire lock, will try again !
Thread 2 Withdraw completed, Current Balance 500
500
*/