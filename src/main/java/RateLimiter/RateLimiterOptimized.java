package RateLimiter;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class RateLimiterOptimized {
    private final int LIMIT;
    private final Map<String,UserInfo> usersMap = new ConcurrentHashMap<>();

    public RateLimiterOptimized(int limit){
        this.LIMIT=limit;
    }

    public boolean allowRequest(String userId){
        long currentWindow = System.currentTimeMillis() / 60000;

        UserInfo user = usersMap.computeIfAbsent(userId, u ->
              new UserInfo(currentWindow)
        );

        user.lock.lock();
        try {
            if( user.startWindow != currentWindow){
                user.startWindow = currentWindow;
                user.count.set(0);
            }

            if( user.count.get() >= LIMIT) {
                return false;
            }

            user.count.incrementAndGet();
            return true;
        } finally {
            user.lock.unlock();
        }

    }
}


class UserInfo {

    long startWindow;
    AtomicInteger count = new AtomicInteger(0);
    final Lock lock = new ReentrantLock();

    public UserInfo(long startWindow){
        this.startWindow =startWindow;
    }

}
