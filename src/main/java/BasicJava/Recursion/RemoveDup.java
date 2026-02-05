package Recursion;

public class RemoveDup {

    static boolean[] map = new boolean[26];
    static String str2 = "";

    public static void main(String[] args) {
        String str = "abbccda";

        removeDup(str, 0);
    }

    public static void removeDup(String str, int index) {

        if( index==str.length()){
            System.out.println(str2);
            return;
        }

        char currch = str.charAt(index);

        int newi = currch - 'a';
        if (map[newi] == false) {
            str2 += currch;
            map[newi] = true;
        }

        removeDup(str, index + 1);

    }

}
