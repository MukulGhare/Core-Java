import BankTransfer.Account;
import BankTransfer.MoneyTransferService;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class AccountTest {

    @Test
    public void shouldHandleConcurrentDepositAndTransferCorrectly() throws InterruptedException {
        // given
        Account from = new Account(100);
        Account to = new Account(200);
        MoneyTransferService service = new MoneyTransferService();

        Thread depositThread = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                service.deposit(from, BigDecimal.valueOf(100));
                service.deposit(to, BigDecimal.valueOf(100));
            }
        });

        Thread transferThread = new Thread(() -> {
            service.transfer(from, to, BigDecimal.valueOf(20));
        });

        // when
        depositThread.start();
        transferThread.start();

        try {
            depositThread.join();
            transferThread.join();
        } catch (InterruptedException e){
        }


        // then
        assertEquals(
                "From account balance should be correct",
                BigDecimal.valueOf(980),
                from.getBalance()
                );

        assertEquals(
                "To account balance should be correct",
                BigDecimal.valueOf(1020),
                to.getBalance()
                );
    }


}







