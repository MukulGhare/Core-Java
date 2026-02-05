package Functions;

import java.util.Scanner;

public class ReturnGreater {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 nos and I will tell you which is greater : ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(returnGreater(a, b));
        sc.close();
    }

    public static int returnGreater(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }
}
