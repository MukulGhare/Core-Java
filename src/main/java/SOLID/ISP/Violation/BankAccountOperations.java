package SOLID.ISP.Violation;

public interface BankAccountOperations {
    void deposit(double amount);

    void withdraw(double amount);

    void calculateInterest();

    void closeAccount();
}
