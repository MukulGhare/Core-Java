public class Encapsulation {


    public static void main(String[] args) {
        Accounts account1 = new Accounts(100);

        account1.deposit(1000);

        // Cannot access private variables directly
        //account1.accountBalance

        // Encapsulation Achieved
        System.out.println("Balance : "+account1.getAccountBalance());


    }
}

 class Accounts {

    // Private variables cannot be accessed directly
    private final int accountNumber;
    private double accountBalance;

    // Constructor used for new accounts to have zero balance
    public Accounts(int accountNumber){
        this.accountBalance =0;
        this.accountNumber =accountNumber;
    }


    // Getters to get the Private Variables
    public int getAccountNumber(){
        return accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    // Setter to set Private Variables
    public void deposit(double amount){
        if(amount <= 0){
            throw new IllegalArgumentException("Deposit amount must be positive");
        }
        accountBalance += amount;
    }

}
