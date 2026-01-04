package IdempotentPayment;

import java.math.BigDecimal;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConHashMapPayment {

    private final Map<String, PaymentInfo> conMap = new ConcurrentHashMap<>();


    public Status processPayment(String idemKey, PaymentInfo paymentInfo){

        PaymentInfo payment = conMap.computeIfAbsent(idemKey, k -> {
           PaymentInfo newPayment = new PaymentInfo(
                   paymentInfo.getUserID(),
                   paymentInfo.getAmount()
           );
           newPayment.setStatus(pay(newPayment.getAmount()));
           return newPayment;
        });

        return payment.getStatus();

    }

    private Status pay(BigDecimal amount) {
        // paymentLogic

        return Status.COMPLETED;
    }

}
