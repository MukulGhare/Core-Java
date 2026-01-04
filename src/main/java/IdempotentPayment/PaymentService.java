package IdempotentPayment;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class PaymentService {

    private final Map<String, PaymentInfo> idempotentMap = new HashMap<>();
    private final Map<String, Object> locks = new HashMap<>();

    public Status processPayment(String idemKey, PaymentInfo paymentInfo){

        synchronized (idempotentMap){
            PaymentInfo existing = idempotentMap.get(idemKey);
            if(existing != null){
                return existing.getStatus();
            }
        }

        Object keyLock;
        synchronized (locks){
            keyLock = locks.computeIfAbsent(idemKey, k -> new Object());
        }

        synchronized (keyLock){

            synchronized (idempotentMap){
                PaymentInfo existing = idempotentMap.get(idemKey);
                if(existing != null){
                    return existing.getStatus();
                }

                paymentInfo.setStatus(Status.COMPLETED);
                idempotentMap.put(idemKey,paymentInfo);

                return idempotentMap.get(idemKey).getStatus();
            }

        }


    }


}
