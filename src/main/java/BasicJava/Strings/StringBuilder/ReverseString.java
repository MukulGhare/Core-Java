package Strings.StringBuilder;

public class ReverseString {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("hello");
        StringBuilder revSB = new StringBuilder();

        System.out.println(sb.length());

        for (int i = sb.length() - 1; i >= 0; i--) {
            revSB = revSB.append(sb.charAt(i));
        }

        System.out.println(revSB);

        reverse(sb);
    }

    public static void reverse(StringBuilder sb) {

        for (int i = 0; i <= sb.length() / 2; i++) {

            int front = i;
            int rare = sb.length() - i - 1;
            char frontP = sb.charAt(front) ;
            char rareP = sb.charAt(rare);
            sb.setCharAt(front, rareP);
            sb.setCharAt(rare, frontP);

        }

        System.out.println("Inverted String is - " + sb);
    }

}
