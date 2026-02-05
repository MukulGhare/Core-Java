package Functions;

import java.util.Scanner;

public class EnterNos {
    public static void main(String[] args) {

        int P = 0, N = 0, Z = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1 to continue and 0 to quit !");
        int input = sc.nextInt();

        while (input == 1) {
            System.out.print("Enter your no : ");
            int no = sc.nextInt();

            if (no > 0) {
                P++;
            } else if (no < 0) {
                N++;
            } else {
                Z++;
            }
            System.out.println("Enter 1 to continue and 0 to quit !");
            input = sc.nextInt();
        }

        System.out.println("Positives : " + P);

        System.out.println("Negatives : " + N);

        System.out.println("Zeros : " + Z);


        sc.close();

    }

}
