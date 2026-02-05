package Recursion;

public class MoveX {
    static StringBuilder sb = new StringBuilder("");
    static int countX = 0;

    public static void main(String[] args) {
        String str = "axbcxxd";
        moveToEnd(str, 'x', 0);
    }

    // O(n)
    public static void moveToEnd(String str, char x, int index) {
        if (index == str.length()) {
            while (countX > 0) {
                sb.append(x);
                countX--;
            }
            System.out.println(sb.toString());
            return;
        }

        if (str.charAt(index) == x) {
            countX++;
        } else {
            sb.append(str.charAt(index));
        }

        moveToEnd(str, x, index + 1);
    }

}
