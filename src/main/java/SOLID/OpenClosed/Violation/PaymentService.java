package SOLID.OpenClosed.Violation;

public class PaymentService {
    public void processPayment(String paymentType, double amount) {

        if ("CREDIT_CARD".equals(paymentType)) {
            System.out.println("Processing credit card payment of " + amount);

        } else if ("DEBIT_CARD".equals(paymentType)) {
            System.out.println("Processing debit card payment of " + amount);

        } else if ("UPI".equals(paymentType)) {
            System.out.println("Processing UPI payment of " + amount);

        } else {
            throw new IllegalArgumentException("Unsupported payment type");
        }
    }
}
