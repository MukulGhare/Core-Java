package RateLimiter;

import java.util.HashMap;

public class RateLimiterService {

    private final int limit;
    private final HashMap<Integer, UserCounter> users = new HashMap<>();

    public RateLimiterService(int limit){
        this.limit=limit;
    }

    public synchronized boolean allowRequest(int userID){

        long currentTime = System.currentTimeMillis() / 60000;
        UserCounter userCounter = users.get(userID);

        if( userCounter == null){
            userCounter = new UserCounter(currentTime);
            users.put(userID,userCounter);
        }

        if ( currentTime != userCounter.getStartWindow()){
            userCounter.setStartWindow(currentTime);
            userCounter.resetCount();
        }

        if( userCounter.getCount() < limit){
            userCounter.incrementCount();
            return true;
        }


        return false;
    }
}
