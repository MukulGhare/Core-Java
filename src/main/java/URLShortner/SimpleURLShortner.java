package URLShortner;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class SimpleURLShortner {

    private final String DOMAIN = "http://shorten.es";
    private final String Base62 = "abcdefghijklmnopqrstuvwxyz0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    private final Map<String, String> shortToLong = new HashMap<>();
    private final Map<String, String> longToShort = new HashMap<>();
    private final AtomicLong counter = new AtomicLong(1);

    private final Lock lock = new ReentrantLock();


    public  String shorten(String longURL){
        lock.lock();
        try{
            if (longURL == null || longURL.isEmpty()) {
                throw new IllegalArgumentException("Invalid long URL");
            }

            if( longToShort.containsKey(longURL)){
                return DOMAIN+longToShort.get(longURL);
            }

            long countNum = counter.getAndIncrement();
            String key = encodeBASE62(countNum);

            shortToLong.put(key,longURL);
            longToShort.put(longURL,key);

            return DOMAIN + key;

        } finally {
            lock.unlock();
        }
    }

    public String expand(String shortURL){

        lock.lock();

        try {
            if (shortURL == null || !shortURL.startsWith(DOMAIN)) {
                throw new IllegalArgumentException("Invalid short URL");
            }

            shortURL = shortURL.replace(DOMAIN,"");
            String longURL  = shortToLong.get(shortURL);

            if(longURL == null){
                throw new IllegalArgumentException("URL not found");
            }

            return longURL;

        } finally {
            lock.unlock();
        }


    }

    private String encodeBASE62(long num){

        StringBuilder sb = new StringBuilder();

        while ( num > 0){
            sb.append(Base62.charAt((int) ( num % 62)));
            num /= 62;
        }

        return sb.reverse().toString();
    }
}
