package Functions;

import java.util.Scanner;

public class NoRaisedtoNo {
    public static void main(String[] args) {
        int value = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter 2nos to raise to : ");

        int x = sc.nextInt();
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            value = x * x;
        }

        System.out.println(value);

        sc.close();
    }
}
