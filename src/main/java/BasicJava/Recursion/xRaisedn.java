package Recursion;

public class xRaisedn {

    public static void main(String[] args) {
        int x = 3, n = 3;

        System.out.println(xPoweredn(x, n));

        System.out.println(xton(x, n));

        System.out.println(lognstack(x, n));

    }

    public static int xton(int x, int n) {
        int power = 1;

        while (n != 0) {

            power = power * x;
            n--;

        }
        return power;

    }

    public static int xPoweredn(int x, int n) { // stack height here is n

        if (n == 0) {
            return 1;
        } else {
            return x = x * xPoweredn(x, n - 1);
        }

    }

    // Q. Can you find power of n while stack height being log n ??
    // yess below code

    public static int lognstack(int x, int n) {

        if (n == 0) {
            return 1;
        } else {
            if (n % 2 == 0) {
                return lognstack(x, n / 2) * lognstack(x, n / 2);
            } else {
                return lognstack(x, n / 2) * lognstack(x, n / 2) * x;

            }
        }
    }

}
