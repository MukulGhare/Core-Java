package Bits;

public class BitAND {

    public static void main(String[] args) {

        int a = 5; //0101
        int position = 2;
        // Find what bit is present @ position 3 of no 5

        // (i) creating bit mask --> Left shifting 1 3 times
        int bitmask = 1 << 3;

        if ((bitmask & a) == 0) {
            System.out.println("Bit @" +position+" position for no "+a+" is -> 0");
        } else{
            System.out.println("Bit @" +position+" position for no "+a+" is -> 1");

        }

    }

}
