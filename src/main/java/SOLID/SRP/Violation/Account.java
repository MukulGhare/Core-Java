package SOLID.SRP.Violation;

public class Account {

    private int accountNo;
    private double balance;

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


    public void transferMoney(){

    }

    public void sendNotification(){

    }
}
