package Bits;

public class BinaryToDecimal {

    public static void main(String[] args) {

        int binary[] = { 1, 1, 1, 1 };
        int decimal = 0;

        for (int i = binary.length - 1, j = 0; i > 0; i--, j++) {
            decimal +=  (binary[i] * (int) Math.pow(2, j));
        }

        System.out.println(decimal);
    }

}
