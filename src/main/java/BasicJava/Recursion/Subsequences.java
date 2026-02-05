package Recursion;

import java.util.HashSet;

public class Subsequences {

    public static void main(String[] args) {
        String str = "abc";
        HashSet<String> set = new HashSet<>();

        printSubsequences(str, 0, "");
        uniqueSubsequences("aaa", 0, "", set);
    }

    public static void uniqueSubsequences(String str, int ind, String newString, HashSet<String> set) {

        if (ind == str.length()) {

            if (set.contains(newString)) {
                return;
            } else {
                System.out.println(newString);
                set.add(newString);
                return;
            }

        }

        char c = str.charAt(ind);

        uniqueSubsequences(str, ind + 1, newString + c, set);
        uniqueSubsequences(str, ind + 1, newString, set);

    }

    public static void printSubsequences(String str, int i, String newStr) {

        if (i == str.length()) {
            System.out.println(newStr);
            return;
        }

        char c = str.charAt(i);

        printSubsequences(str, i + 1, newStr + c);

        printSubsequences(str, i + 1, newStr);

    }

}
