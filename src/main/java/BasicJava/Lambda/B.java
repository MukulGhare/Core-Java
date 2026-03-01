package BasicJava.Lambda;

public class B implements A{
    @Override
    public void show() {
        System.out.println("Class B implementation");
    }
}

class M {
    public static void main(String[] args) {
        A obj = new B();

        A anon = new A(){
            @Override
            public void show() {
                System.out.println("Anonymous class");
            }
        };

        A lam = () -> {
            System.out.println("Lambda expression");
        };

        obj.show();
        anon.show();
        lam.show();

    }
}
