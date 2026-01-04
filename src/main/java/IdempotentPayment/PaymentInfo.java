package IdempotentPayment;

import java.math.BigDecimal;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class PaymentInfo {

    private String userID;
    private BigDecimal amount;
    private Status status;

    public PaymentInfo(String userID, BigDecimal amount){
        this.userID=userID;
        this.amount=amount;
    }

    public String getUserID() {
        return userID;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

}
