package Recursion;

public class SumofN {

    static int sum = 0;

    public static void main(String[] args) {
        int n = 5;

        sumofN(n);

    }

    public static void sumofN(int n) {

        if (n == 0) {
            System.out.println(sum);
            return;
        } else {
            sum += n;
            sumofN(n - 1);
        }

    }

}
