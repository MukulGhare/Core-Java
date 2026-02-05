package Arrays;

public class AssendingOrder {

    public static void main(String[] args) {
        int myArry[] = LinearSearch.buildIntArray(false);

        // if 1 2 4 7 -> assend tru 3 4 6 2 -> assend false
        System.out.println(" Is my array assending ? " + checkAssend(myArry));

    }

    public static boolean checkAssend(int arr[]) {

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                return false;
            }
        }

        return true;
    }
}
