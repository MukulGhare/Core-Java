package MultiThread;

public class ProducerConsumerProbelm {

    public static void main(String[] args) {
        SharedResource resource = new SharedResource();
        Thread t1 = new Thread(new Producer(resource));
        Thread t2 = new Thread(new Consumer(resource));
        t1.start();
        t2.start();
    }



}

class Producer implements Runnable{

    private SharedResource resource;

    public Producer(SharedResource resource){
        this.resource = resource;
    }

    @Override
    public void run() {

        for (int i = 0; i < 10; i++) {
            resource.produce(i);
        }

    }
}

class Consumer implements Runnable{

    private SharedResource resource;

    public Consumer(SharedResource resource){
        this.resource=resource;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            int no = resource.consume();
        }
    }
}


class SharedResource {

    private int data;
    private boolean hasData;

    public synchronized void produce (int number){
        while(hasData){
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }
        data=number;
        hasData=true;
        System.out.println("Produced : " + data);
        notify();
    }

    public synchronized int consume (){
        while (!hasData){
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }
        hasData = false;
        System.out.println("Consumed : "+data);
        notify();
        return data;

    }
}



//OUTPUT
//Produced : 0
//Consumed : 0
//Produced : 1
//Consumed : 1
//Produced : 2
//Consumed : 2
//Produced : 3
//Consumed : 3
//Produced : 4
//Consumed : 4
//Produced : 5
//Consumed : 5
//Produced : 6
//Consumed : 6
//Produced : 7
//Consumed : 7
//Produced : 8
//Consumed : 8
//Produced : 9
//Consumed : 9