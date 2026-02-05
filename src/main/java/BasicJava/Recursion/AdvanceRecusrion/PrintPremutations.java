package Recursion.AdvanceRecusrion;

public class PrintPremutations {

    public static void main(String[] args) {
        printPremut("abc", "");
    }

    // O(n!)
    public static void printPremut(String str, String premutation) {

        if(str.length() == 0){
            System.out.println(premutation);
            return;
        }


        for (int i = 0; i < str.length(); i++) {
            char currChar = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i + 1);

            printPremut(newStr, premutation + currChar);
        }

    }

}
