
public class MyThread extends Thread {

    BankAccount bankAccount = new BankAccount();

    public MyThread(BankAccount bankAccount){
        this.bankAccount=bankAccount;
    }

    @Override
    public void run() {
        System.out.println("Running Thread " + Thread.currentThread().getName());
        for (int i = 0; i < 1000; i++) {
            bankAccount.credit(10);
        }
    }

    //    private Counter counter;
//
//    public MyThread(Counter counter){
//        this.counter = counter;
//    }
//
//    @Override
//    public void run() {
//        System.out.println("Thread is running");
//        for (int i = 0; i < 10000; i++) {
//            counter.increment();
//        }
//    }

}