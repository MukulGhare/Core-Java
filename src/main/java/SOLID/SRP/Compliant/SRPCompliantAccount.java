package SOLID.SRP.Compliant;

public class SRPCompliantAccount {

    public static void main(String[] args) {
        Account from = new Account(100,1000);
        Account to = new Account(200,1000);

        MoneyService service = new MoneyService( new NotificationService());
        service.transfer(from,to,500);
    }
}

class Account {
    private final int accountNo;
    private double balance;

    public Account (int accountNo, double balance){
        this.accountNo = accountNo;
        this.balance = balance;
    }

    public int getAccountNo() {
        return accountNo;
    }

    public double getBalance() {
        return balance;
    }

    void debit(double amount){
        balance -= amount;
    }

    void credit(double amount){
        balance += amount;
    }
}

class MoneyService{

    NotificationService notificationService;

    public MoneyService(NotificationService notificationService){
        this.notificationService = notificationService;
    }

    public void transfer ( Account from,Account to, double amount){
        System.out.println(" Transferring amount "+ amount +" from "+ from.getAccountNo() + "to " + to.getAccountNo());
        from.debit(amount);
        to.credit(amount);
        notificationService.sendNotification(from,amount+" debited");
        notificationService.sendNotification(to, amount+" credited");
    }

}

class NotificationService {

    public void sendNotification(Account account, String notif){
        System.out.println("Sending "+notif+" to account " + account.getAccountNo());
    }
}
