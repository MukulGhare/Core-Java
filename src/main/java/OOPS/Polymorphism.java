package OOPS;

public class Polymorphism {

    public static void main(String[] args) {
        PaymentMethod paymentMethod;

        paymentMethod = new CreditCardPayment("1111-2222-3333-4444");
        paymentMethod.pay(500.0);

        paymentMethod = new NetBankingPayment("HDFC0001");
        paymentMethod.pay(8000.80);
    }
}


// Method Overloading

