package MultiThread.BankTransfer;


import java.math.BigDecimal;

public class AccountTest {

    public static void main(String[] args) {
        Account from = new Account(100);
        Account to = new Account(200);
        MoneyTransferService service = new MoneyTransferService();

        Thread deposit = new Thread(()->{
            for (int i=0; i<10;i++){
                service.deposit(from,BigDecimal.valueOf(100));
                service.deposit(to,BigDecimal.valueOf(100));
            }
        });

        Thread transfer = new Thread(() -> {
            service.transfer(from,to,BigDecimal.valueOf(20));
        });

        deposit.start();
        transfer.start();

        try {
            deposit.join();
            transfer.join();
        } catch (InterruptedException e){

        }

        System.out.println(from.getBalance());
        System.out.println(to.getBalance());
    }
}
