package Bits;

import java.util.Scanner;

public class DecimalToBinary {
    /*
     * 5 - 0101
     * 
     * 
     * 
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no to conver to binary : ");
        convert(sc.nextInt());

        sc.close();
    }

    public static void convert(int n) {

        StringBuilder sb = new StringBuilder();

        do {
            sb.insert(0, n % 2);
            n = n / 2;

        } while (n > 0);
        System.out.println(sb.toString());

    }

}
