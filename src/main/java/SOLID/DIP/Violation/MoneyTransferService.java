package SOLID.DIP.Violation;

public class MoneyTransferService {

    private EmailNotificationService emailService =
            new EmailNotificationService();

    public void transfer(double amount) {
        System.out.println("Transferring amount: " + amount);
        emailService.sendEmail("Amount transferred: " + amount);
    }
}
