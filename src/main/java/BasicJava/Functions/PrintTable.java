package Functions;

import java.util.Scanner;

public class PrintTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Printing Table for : ");
        int number = sc.nextInt();

        printTable(number);
        sc.close();
    }

    public static void printTable(int number) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(number * i);
        }
    }
}
