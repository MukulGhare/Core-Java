package Strings;

import java.util.Scanner;

public class ReplaceE {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        String str = getStringIP();

        str = str.replace('e', 'i');
        System.out.println(str);
        sc.close();
    }

    public static String getStringIP() {
        System.out.println("Enter a String to read : ");
        String str = sc.nextLine();

        return str;
    }

}
