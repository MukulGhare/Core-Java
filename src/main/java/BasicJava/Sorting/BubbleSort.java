package Sorting;

public class BubbleSort {

    public static void main(String[] args) {
        int arr[] = { 7, 8, 3, 1, 2 };

        Bsort(arr);
    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void Bsort(int arr[]) {

        for (int j = 0; j < arr.length - 1; j++) {
            for (int i = 0; i < arr.length - j - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = 0;
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }

        }
        printArr(arr);

        return;

    }
}
