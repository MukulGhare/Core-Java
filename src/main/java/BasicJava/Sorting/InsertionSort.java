package Sorting;

public class InsertionSort {

    public static void main(String[] args) {
        int arr[] = { 7, 8, 3, 1, 2 };

        Isort(arr);
    }

    public static void Isort(int arr[]) {

        // insertion sort  1 3 7 8 | 2

        for (int i = 1; i < arr.length; i++) { // i=4
            int curr = arr[i]; // 2
            int j = i - 1;  // 3

            while (j >= 0 && curr < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j+1] = curr ;
        }

        BubbleSort.printArr(arr);

    }
}
