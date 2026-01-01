package RateLimiter;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class UserCounter {
    private long startWindow;
    private int count;


    public UserCounter(long startWindow){
        this.startWindow = startWindow;
        this.count = 0;
    }

    public long getStartWindow() {
        return startWindow;
    }

    public void setStartWindow(long startWindow) {
        this.startWindow = startWindow;
    }

    public int getCount() {
        return count;
    }

    public void incrementCount(){
        count += 1;
    }


    public void resetCount() {
        count=0;
    }
}
