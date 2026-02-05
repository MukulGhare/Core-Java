package Patterns;

public class halfPyramid {

    public static void main(String args[]) {
        halfPyr(5);
        System.out.println("______________________________________");
        invertedHalfPyr(5);
    }

    static void halfPyr(int size) {
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void invertedHalfPyr(int size) {
        for (int i = size; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
