package Recursion;

public class NFactorial {

    static int Fact = 1;

    public static void main(String[] args) {
        int n = 4;
        //printFactorial(n);

        System.out.println(checkFactorial(n));

    }

    public static int checkFactorial(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }

        int factN = n * checkFactorial(n - 1);
        return factN;

    }

    public static void printFactorial(int n) {

        if (n == 0) {
            System.out.println(" N! = " + Fact);
            return;
        } else {
            Fact *= n;
            printFactorial(n - 1);
            System.out.println(n - 1);
        }
    }

}
