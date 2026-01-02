package URLShortner;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;


public class URLShortnerService {

    private final Map<String,String> shortTolong = new ConcurrentHashMap<>();
    private final Map<String,String> longToShort = new ConcurrentHashMap<>();

    private static final String DOMAIN = "https://short.es/";

    private static final String BASE62 =
            "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";

    private final Object creationLock = new Object();
    private final AtomicInteger counter = new AtomicInteger(1);


    public String shorten(String url){
        if(url==null || url.isBlank()){
            throw new IllegalArgumentException("Invalid URL");
        }

        String shortURL = longToShort.get(url);
        if( shortURL != null){
            return DOMAIN+shortURL;
        }

        synchronized (creationLock) {
            return DOMAIN + longToShort.computeIfAbsent(url, u -> {
                long id = counter.getAndIncrement();
                String key = encodeBase62(id);
                shortTolong.put(key, url);
                return key;
            });
        }

    }

    public String expand(String shortUrl) {
        if (shortUrl == null || !shortUrl.startsWith(DOMAIN)) {
            throw new IllegalArgumentException("Invalid short URL");
        }

        String key = shortUrl.substring(DOMAIN.length());
        String longUrl = shortTolong.get(key);

        if (longUrl == null) {
            throw new IllegalArgumentException("URL not found");
        }

        return longUrl;
    }

    private String encodeBase62(long id) {
        StringBuilder sb = new StringBuilder();

        while (id >0){
            sb.append(BASE62.charAt((int) (id % 62)));
            id /= 62;
        }

        return sb.reverse().toString();
    }

}