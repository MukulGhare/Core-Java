package Recursion.BackTracking;

public class Permutations {

    public static void main(String[] args) {

        String str = "abc";

        backTrck(str, "");

    }

    public static void backTrck(String str, String Permutations) {

        if (str.length() == 0) {
            System.out.println(Permutations);
            return;
        }

        for (int i = 0; i < str.length(); i++) {

            char c = str.charAt(i);
            String newString = str.substring(0, i) + str.substring(i + 1);

            backTrck(newString, Permutations + c);

        }

    }

}
