package Patterns;

public class RotatesPyramids {

    public static void main(String[] args) {

        int size = 5;

        for (int i = 1; i <= size; i++) {

            for (int j = 1; j <=size-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
