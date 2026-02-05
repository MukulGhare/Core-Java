package Functions;

import java.util.Scanner;

public class CheckPrime {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no to check if Prime : ");
        int number = sc.nextInt();

        System.out.println(isPrime(number));
        ;
        sc.close();
    }

    public static Boolean isPrime(int no) {

        if (no == 1 || no == 2) {
            return true;
        }
        for (int i = 2; i < no; i++) {
            if (no % i == 0) {
                return false;
            }
        }
        return true;

    }

}
