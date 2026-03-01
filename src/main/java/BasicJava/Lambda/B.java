package BasicJava.Lambda;

public class B implements A{
    @Override
    public int add(int i, int j) {
        System.out.println("Class B implementation "+ i+j);
        return i+j;
    }
}

class M {
    public static void main(String[] args) {
        A obj = new B();

        A anon = new A(){
            @Override
            public int add(int i, int j) {
                System.out.println("Anonymous class "+ i+j);
                return i+j;
            }
        };

        A lam = (i,j) -> {
            System.out.println("Lambda expression "+ i+j);
            return i+j;
        };

        obj.add(2,3);
        anon.add(2,3);
        lam.add(2,3);

    }
}
