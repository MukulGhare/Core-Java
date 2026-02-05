package Bank;

import java.math.BigDecimal;

public class TestBankAccount {

    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(100);
        BankAccount account2 = new BankAccount(200);
        MoneyTransferService service = new MoneyTransferService();

        service.deposit(account1,BigDecimal.valueOf(1100));
        service.deposit(account2,BigDecimal.valueOf(1100));
        service.withdraw(account1,BigDecimal.valueOf(100));
        service.withdraw(account2,BigDecimal.valueOf(100));

//        System.out.println("Account: "+ account1.getAccountNo()+" Balance: " +account1.getBalance());
//        System.out.println("Account: "+ account2.getAccountNo()+" Balance: " +account2.getBalance());

        Thread transfer1 = new Thread( () -> {
            for (int i=0; i<10 ;i++){
                service.transfer(account1,account2,BigDecimal.valueOf(50));
            }
        });

        Thread transfer2 = new Thread( () -> {
            for (int i=0; i<10 ;i++){
                service.transfer(account2,account1,BigDecimal.valueOf(20));
            }
        });

        transfer1.start();
        transfer2.start();

        try {
            transfer1.join();
            transfer2.join();
        } catch (InterruptedException e) {

        }

        System.out.println("Account: "+ account1.getAccountNo()+" Balance: " +account1.getBalance());
        System.out.println("Account: "+ account2.getAccountNo()+" Balance: " +account2.getBalance());
    }
}
