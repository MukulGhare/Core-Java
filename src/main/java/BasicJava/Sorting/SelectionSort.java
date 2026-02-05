package Sorting;

public class SelectionSort {

    public static void main(String[] args) {
        int arr[] = { 7, 8, 3, 1, 2 };

        Ssort(arr);
    }

    public static void Ssort(int arr[]) {

        // selection sort
        for (int i = 0; i < arr.length - 1; i++) {
            int smallest = i;
            for (int j = i + 1; j < arr.length ; j++) {

                if (arr[j] < arr[smallest]) {
                    smallest = j;
                }

            }

            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;

        }

        BubbleSort.printArr(arr);

    }

}
