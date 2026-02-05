package Strings;

import java.util.Scanner;

public class lengthStrArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(" Enter size of String array you want : ");
        int size = sc.nextInt();

        String clubs[] = new String[size];

        for (int i = 0; i < size; i++) {
            clubs[i] = sc.next();
        }

        for (int i = 0; i < clubs.length; i++) {
            System.out.print(clubs[i] + " " + i + " ");
        }
        sc.close();

        findLenght(clubs);

    }

    public static void findLenght(String arr[]) {

        int length=0;

        for(int i=0; i<arr.length;i++){
            length += arr[i].length();
        }

        System.out.println(length);

    }
}
