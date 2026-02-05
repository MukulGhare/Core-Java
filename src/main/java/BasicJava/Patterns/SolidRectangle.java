package Patterns;

public class SolidRectangle {
    public static void main(String[] args) {
        // print a solid rectange with 5 rows and 4 columns

        for (int j = 1; j < 5; j++) {
            for (int i = 1; i <= 5; i++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }

    }
}
