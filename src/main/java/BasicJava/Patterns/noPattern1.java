package Patterns;

public class noPattern1 {
    public static void main(String[] args) {

        int size = 5;
        // for (int i = 1; i <= size; i++) {

        //     for (int j = 1; j <= i; j++) {
        //         System.out.print(j + "   ");
        //     }
        //     System.out.println();
        // }

        System.out.println("____________________");
        invertedHlfPyrNo(size);
    }

    static void invertedHlfPyrNo(int n) {

        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
