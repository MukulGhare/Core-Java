package Recursion;

public class PrintNto1 {

    public static void main(String[] args) {
        int n = 5;

        printNto1(n);

    }

    public static void printNto1(int n) {
        if (n == 0) { // base case
            return;
        } else {
            System.out.println(n);
            printNto1(n - 1);
        }
    }

}
