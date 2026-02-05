package Recursion;

public class OldKeypad {

    public static String[] keypad = { ".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz" };

    public static void main(String[] args) {

        printCombination("23", 0, "");

    }

    public static void printCombination(String str, int idx, String combination) {

        if (idx == str.length()) {
            System.out.println(combination);
            return;
        }

        char c = str.charAt(idx);
        String mapping = keypad[c - '0'];

        for (int i = 0; i < mapping.length(); i++) {
            printCombination(str, idx + 1, combination + mapping.charAt(i));
        }

    }

}
