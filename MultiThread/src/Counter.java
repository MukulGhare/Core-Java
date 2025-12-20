public class Counter {
    private int count;

    public void increment(){
        count++;
    }

    public int getCount() {
        return count;
    }


    public static void main(String[] args) {
        Counter counter = new Counter();

        // Extending Thread Class
        ExtendThread extendThread = new ExtendThread(counter);

        // Implementing Runnable
        ImplementRunnable implement = new ImplementRunnable(counter);
        Thread implementThread = new Thread(implement);

        // Using Lambda Expression
        Thread lambdaThread = new Thread( () -> {
            counter.increment();
        });

        extendThread.start();
        implementThread.start();
        lambdaThread.start();

        try {
            extendThread.join();
            implementThread.join();
            lambdaThread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Count after all threads are done : " + counter.getCount());

    }
}

class ExtendThread extends Thread{

    Counter counter;

    public ExtendThread(Counter counter){
        this.counter=counter;
    }

    @Override
    public void run() {
        counter.increment();
    }
}


class ImplementRunnable implements Runnable{
    Counter counter;

    public ImplementRunnable(Counter counter){
        this.counter = counter;
    }

    @Override
    public void run() {
        counter.increment();
    }
}
