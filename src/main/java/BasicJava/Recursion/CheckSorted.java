package Recursion;

public class CheckSorted {
    static Boolean sorted = true;
    static int first = Integer.MIN_VALUE;

    public static void main(String[] args) {
        int arr[] = { 1, 2,  3, 4, 5 };

        System.out.println(checkSorted(arr, 0));

    }

    public static boolean checkSorted(int arr[], int index) {

        if (index == arr.length - 1) {
            return true;
        }

        if (arr[index] < arr[index + 1]) {
            return checkSorted(arr, index + 1);
        } else {
            return false;
        }

    }

}
