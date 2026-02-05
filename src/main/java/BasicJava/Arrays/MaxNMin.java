package Arrays;

public class MaxNMin {

    public static void main(String[] args) {
        int myArry[] = LinearSearch.buildIntArray(false);

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i=0;i<myArry.length;i++) {

            if (myArry[i] < min) {
                min = myArry[i];
            }

            if (myArry[i] > max) {
                max = myArry[i];
            }

        }

        System.out.println("Max value is " + max);
        System.out.println("Min value is " + min);

    }

}
