package MultiThread;

public class DeadLockExample {

    public static void main(String[] args) {
        Pen pen = new Pen();
        Paper paper = new Paper();

        Thread t1 = new Thread(new Task1(pen,paper), "Thread1");
        Thread t2 = new Thread(new Task2(pen,paper), "Thread2");

        t1.start();
        t2.start();
    }
}

class Task1 implements Runnable{

    private Pen pen;
    private Paper paper;

    public Task1(Pen pen, Paper paper){
        this.paper =paper;
        this.pen=pen;
    }
    @Override
    public void run() {
        pen.writeWithPen(paper);
    }
}

class Task2 implements Runnable{

    private Pen pen;
    private Paper paper;

    public Task2(Pen pen, Paper paper){
        this.paper =paper;
        this.pen=pen;
    }
    @Override
    public void run() {
        synchronized (pen){
            System.out.println(Thread.currentThread().getName() + " has pen");
            paper.writeWithPaper(pen);
        }

    }
}

class Pen {

    public synchronized void writeWithPen(Paper paper){
        System.out.println(Thread.currentThread().getName() + " has pen & trying to get java.main.Paper");
        paper.finishWriting();
    }

    public synchronized void finishWriting(){
        System.out.println(Thread.currentThread().getName() + " finished writing with pen");

    }
}

class Paper {

    public synchronized void writeWithPaper(Pen pen){
        System.out.println(Thread.currentThread().getName() + " has java.main.Paper & trying to get java.main.Pen");
        pen.finishWriting();
    }

    public synchronized void finishWriting(){
        System.out.println(Thread.currentThread().getName() + " finished writing with paper");

    }

}

/*
OUTPUT
Thread2 has java.main.Paper & trying to get java.main.Pen
Thread2 finished writing with pen
Thread1 has pen & trying to get java.main.Paper
Thread1 finished writing with paper
*/