package Patterns;

public class homework3 {
    public static void main(String args[]) {

        int size = 5;
        int number = 1;

        for (int i = 1; i <= size; i++) {
            number = i;

            for (int j = 1; j <= size - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(number);
                if (number != 1)
                    number--;
            }
            for (int j = 1; j <= i - 1; j++) {
                number++;
                System.out.print(number);

            }
            System.out.println();
        }
    }
}