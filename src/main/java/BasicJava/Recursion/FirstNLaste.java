package Recursion;

public class FirstNLaste {

    static int first = -1;
    static int last = -1;

    public static void main(String[] args) {
        String input = "pqrsabaacdaefaah";

        firstNlaste(input, 'a');

        findOcc(input, 0, 'a');
    }

    public static void findOcc(String str, int index, char e) {

        if (index == str.length()) {
            System.out.println(first);
            System.out.println(last);
            return;
        }

        if (str.charAt(index) == e) {
            if (first == -1) {
                first = index;
            } else {
                last = index;
            }
        }

        findOcc(str, index + 1, e);

    }

    public static void firstNlaste(String str, char e) {

        System.out.println(firstE(str, e));
        System.out.println(lastE(str, e));
    }

    public static int firstE(String str, char e) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == e) {
                return i;
            }
        }
        return 0;
    }

    public static int lastE(String str, char e) {
        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) == e) {
                return i;
            }
        }
        return 0;
    }

}
