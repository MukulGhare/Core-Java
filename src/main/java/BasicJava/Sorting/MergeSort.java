package Sorting;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = { 6, 3, 9, 5, 2, 8 };

        divide(arr, 0, arr.length - 1);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println();
    }

    public static void divide(int[] arr, int si, int ei) {

        if (si >= ei) {
            return;
        }

        int mid = si + (ei - si) / 2; // (si+ei) / 2 --> can result in value above integer

        divide(arr, si, mid);
        divide(arr, mid + 1, ei);
        conquer(arr, si, mid, ei);
    }

    public static void conquer(int[] arr, int si, int mid, int ei) {

        // 3 6 9 2 5 8
        int[] mergedArr = new int[ei - si + 1];
        int idx1 = si;
        int idx2 = mid + 1;
        int x = 0;

        while (idx1 <= mid && idx2 <= ei) {
            if (arr[idx1] <= arr[idx2]) {
                mergedArr[x] = arr[idx1];
                x++;
                idx1++;
            } else {
                mergedArr[x] = arr[idx2];
                x++;
                idx2++;
            }
        }

        while (idx1 <= mid) {
            mergedArr[x] = arr[idx1];
            x++;
            idx1++;
        }
        while (idx2 <= ei) {
            mergedArr[x] = arr[idx2];
            x++;
            idx2++;
        }

        for (int i = 0, j = si; i < mergedArr.length; i++, j++) {
            arr[j] = mergedArr[i];
        }

    }

    // merge sort is used when you have good memory 
    // O(n logn)

}
