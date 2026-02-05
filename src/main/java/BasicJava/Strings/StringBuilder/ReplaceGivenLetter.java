package Strings.StringBuilder;

import java.util.Scanner;
import Strings.ReplaceE;

public class ReplaceGivenLetter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(ReplaceE.getStringIP());
        System.out.println("What letter from this string do you want to replace ? ");
        String toReplace = sc.nextLine();
        System.out.println("Replace with ? ");
        String replaceW = sc.nextLine();

        replaceLetter(sb, toReplace.charAt(0), replaceW.charAt(0));

        sc.close();
    }

    public static void replaceLetter(StringBuilder sb, char r, char w) {

        for (int i = 0; i <= sb.length()-1; i++) {
            if (sb.charAt(i) == r) {
                sb.setCharAt(i, w);
            }
        }

        System.out.println(" Updated String is --> " + sb);

    }

}
