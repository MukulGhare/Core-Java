package SeatBooking;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class SeatInfo {
    private final String seatNo;
    private Status status;
    private final Lock lock = new ReentrantLock();

    public SeatInfo(String seatNo){
        this.seatNo=seatNo;
        this.status=Status.AVAILABLE;
    }

    public String getSeatNo() {
        return seatNo;
    }

    public Status getStatus() {
        return status;
    }

    public Lock getLock() {
        return lock;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
