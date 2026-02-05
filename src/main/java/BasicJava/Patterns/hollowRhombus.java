package Patterns;

public class hollowRhombus {

    public static void main(String[] args) {
        int n = 5;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= n; j++) {

                if (i == 2 || i == 3 || i == 4) {
                    if (j == 2 || j == 3 || j == 4) {
                        System.out.print(" ");
                    } else {
                        System.out.print("*");
                    }
                } else{
                    System.out.print("*");
                }

            }
            System.out.println();

        }

    }

} // 2,2 2,3 2,4
  // 3,2 3,3 3,4
  // 4,2 4,3 4,4
