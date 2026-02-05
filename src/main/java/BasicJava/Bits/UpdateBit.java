package Bits;

import java.util.Scanner;

public class UpdateBit {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer -> ");
        int n = sc.nextInt();

        System.out.println("Enter position to update -> ");
        int position = sc.nextInt();

        System.out.println("Enter position to update -> ");
        int updatedBit = sc.nextInt();

        System.out.println(updateBit(n, position, updatedBit));

        sc.close();

    }

    public static int updateBit(int n, int position, int newbit) {
        if (newbit == 1) {
            return setBit(n, position);
        } else {
            return clearBit(n, position);
        }
    }

    public static int setBit(int n, int position) {
        // (i) create BM
        int BM = 1 << position;

        // BM OR n
        return BM | n;

    }

    public static int clearBit(int n, int position) {
        // (i) create BM
        int BM = 1 << position;

        // BM OR n
        return ~BM & n;

    }

}
