package SOLID.DIP.Compliant;

public class MoneyTransferService {

    private final NotificationService notificationService;

    public MoneyTransferService(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void transfer(double amount) {
        System.out.println("Transferring amount: " + amount);
        notificationService.send("Amount transferred: " + amount);
    }
}
