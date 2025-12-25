package SOLID.OpenClosed.Compliant;

public class PaymentService {

    public void processPayment(PaymentMethod paymentMethod, double amount){
        paymentMethod.pay(amount);
    }
}


class DebitCardPayment implements PaymentMethod{
    @Override
    public void pay(double amount){
        System.out.println("Paying using Debit Card");
    }
}

class CreditCardPayment implements PaymentMethod{
    @Override
    public void pay(double amount){
        System.out.println("Paying using Credit Card");
    }
}

class NetBankingPayment implements PaymentMethod{
    @Override
    public void pay(double amount){
        System.out.println("Paying using Net Banking");
    }
}
