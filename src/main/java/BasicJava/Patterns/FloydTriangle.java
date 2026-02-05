package Patterns;

public class FloydTriangle {

    public static void main(String[] args) {

        int n = 5;

        for (int i = 1, z = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(z + " ");
                z++;
            }
            System.out.println();
        }

        zeroOneTriangle(n);
    }

    static void zeroOneTriangle(int n) {

        //int number = 1;
        //boolean no = true;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }

}
