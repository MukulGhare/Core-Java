import javax.print.attribute.standard.RequestingUserName;

public class LambdaExpression {

    public static void main(String[] args) {

        // Anonymous Class
        Runnable task1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Anonymous Class");
            }
        };
        Thread t1 = new Thread(task1);
        t1.start();

        // Anonymous Method
        Runnable task2 = () -> {
            System.out.println("Lambda used");
        };
        Thread t2 = new Thread(task2);

        //Super Clean
        Thread t3 = new Thread( () -> {
            System.out.println("Final Thread");
        } );


    }
}
