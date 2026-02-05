package Patterns;

public class HollowRectangle {
    public static void main(String[] args) {
        hollwrec(4, 5);
    }

    static void hollwrec(int rows, int columns) {

        for (int j = 1; j <= rows; j++) {
            for (int i = 1; i <= columns; i++) {

                if (i == 1 || j == 1 || i == columns || j == rows) {
                    System.out.print("*");
                } else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}
