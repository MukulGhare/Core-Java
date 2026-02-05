package Bits;

import java.util.Scanner;

public class PowerofTwo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        check(sc.nextInt());

        sc.close();

    } // 0010 0100 1000

    public static void check(int n) {
        int ones = 0;

        for (int i = 0; i < 4; i++) {
            int bit = getBit(n, i);
            System.out.println(" when i is " + i + " bit is " + bit);
            if (bit == 1) {
                ones++;
            }
        }

        System.out.println("ones is " + ones);

        if (ones > 1) {
            System.out.println(n + " is not power of 2");
        } else {
            System.out.println(n + " is  power of 2");
        }

    }

    public static int getBit(int n, int position) {
        int BM = 1 << position;

        if ((BM & n) != 0) {
            return 1;
        } else {
            return 0;
        }

    }

}
