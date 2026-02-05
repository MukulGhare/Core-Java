package Functions;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no to check if Even Or Odd : ");
        int number = sc.nextInt();

        System.out.println(evenOdd(number));
        ;
        sc.close();
    }

    public static String evenOdd(int number) {
        if (number % 2 == 0) {
            return "Even";
        }
        return "ODD";
    }
}
