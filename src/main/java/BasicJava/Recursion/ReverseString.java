package Recursion;

public class ReverseString {

    public static void main(String[] args) {
        String str = "abcd";

        reverseStrRecursive(str, str.length() - 1);

    }

    public static void reverseStrRecursive(String s, int i) {
        if (i == 0) {
            System.out.println(s.charAt(i));
            return;
        } 
            System.out.println(s.charAt(i));
            reverseStrRecursive(s, i - 1);
        
    }

}
