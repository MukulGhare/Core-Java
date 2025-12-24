package OOPS;

public class Abstraction {

    public static void main(String[] args) {

        PaymentService paymentService = new PaymentService();

        CreditCardPayment creditCardPayment = new CreditCardPayment("1234-5678-9990");
        NetBankingPayment netBankingPayment = new NetBankingPayment("BankCode");

        paymentService.makePayment(creditCardPayment,888.8);
        paymentService.makePayment(netBankingPayment, 1000.0);
    }

}

class PaymentService{

    public void makePayment(PaymentMethod paymentMethod, double amount){
        if( amount <= 0) throw new IllegalArgumentException("Amount must be positive");
        paymentMethod.pay(amount);
    }
}

interface PaymentMethod {

    void pay(double amount);
}

class CreditCardPayment implements PaymentMethod{
    private final String cardNumber;

    public CreditCardPayment(String cardNumber){
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(double amount) {
        // validate Credit Card
        System.out.println("Paid : " + amount +" using Credit Card -> " + cardNumber);
    }
}

class NetBankingPayment implements PaymentMethod{

    private final String bankCode;

    public NetBankingPayment(String bankCode){
        this.bankCode = bankCode;
    }

    @Override
    public void pay(double amount) {
        // validate Bank
        System.out.println("Paid: " + amount + " using Bank -> " + bankCode);
    }
}
