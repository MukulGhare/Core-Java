package MultiThread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReadWriteLocks {

    private ReadWriteLock lock = new ReentrantReadWriteLock();

    private Lock readLock = lock.readLock();
    private Lock writeLock = lock.writeLock();

    
    private int count =0;
    
    public void increment(){
        writeLock.lock();

        try {
            count++;
        } catch (Exception e) {
        } finally {
            writeLock.unlock();
        }


    }

    public int getCount() {
        readLock.lock();
        try {
            return count;
        } finally {
            readLock.unlock();
        }
    }

    public static void main(String[] args) {
        ReadWriteLocks example = new ReadWriteLocks();

        Runnable readTask = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(Thread.currentThread().getName() +" reading: " +  example.getCount());
                }
            }
        };

        Runnable writeTask = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    example.increment();
                    System.out.println(Thread.currentThread().getName() +" incremented");

                }
            }
        };


        Thread read1 = new Thread(readTask);
        Thread read2 = new Thread(readTask);
        Thread write = new Thread(writeTask);

        read1.start();
        read2.start();
        write.start();

        try {
            write.join();
            read2.join();
            read1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}


/*
OUTPUT
Thread-2 incremented
Thread-2 incremented
Thread-2 incremented
Thread-2 incremented
Thread-2 incremented
Thread-2 incremented
Thread-2 incremented
Thread-2 incremented
Thread-2 incremented
Thread-2 incremented
Thread-0 reading: 0
Thread-1 reading: 0
Thread-0 reading: 10
Thread-0 reading: 10
Thread-1 reading: 10
Thread-0 reading: 10
Thread-1 reading: 10
Thread-0 reading: 10
Thread-1 reading: 10
Thread-0 reading: 10
Thread-1 reading: 10
Thread-0 reading: 10
Thread-1 reading: 10
Thread-0 reading: 10
Thread-1 reading: 10
Thread-0 reading: 10
Thread-1 reading: 10
Thread-0 reading: 10
Thread-1 reading: 10
Thread-1 reading: 10
* */