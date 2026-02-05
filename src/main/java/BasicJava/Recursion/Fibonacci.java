package Recursion;

public class Fibonacci {

    public static void main(String[] args) {
        // 0 1 1 2 3 5 8 ..... c =a+b is fibonacci series

        int a = 0, b = 1, n = 6;

        System.out.println(a);
        System.out.println(b);

        printFiboN(n-2, a, b);
    }

    public static void printFiboN(int n, int a, int b) {

        if (n == 0) {
            return;
        } else {
            int c = a + b;
            System.out.println(c);
            n--;
            printFiboN(n, b, c);

        }

    }

}
