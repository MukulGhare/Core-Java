package Functions;

import java.util.Scanner;

public class Recursion {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Recursive halfing : ");
        int number = sc.nextInt();

        halfThisInt(number);
        sc.close();
    }

    public static void halfThisInt(int no) {
        if (no == 1) {
            System.out.println("Finally Done");
            return;
        } else {
            no = no / 2;
            System.out.println(no);
            halfThisInt(no);
        }
    }

}
