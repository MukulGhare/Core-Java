import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockExample {

    private Lock lock = new ReentrantLock();

    public void outerMethod(){
        lock.lock();

          try {
            // do something
            innerMethod();
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            lock.unlock();
        }
    }


    public void innerMethod(){
        lock.lock();
        try {
            System.out.println("Inner Method");
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) {
        ReentrantLockExample example = new ReentrantLockExample();

        example.outerMethod();

    }


}
