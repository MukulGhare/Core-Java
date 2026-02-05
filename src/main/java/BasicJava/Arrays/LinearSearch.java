package Arrays;

import java.util.Scanner;

public class LinearSearch {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println(searchNo(buildIntArray(false)));
        sc.close();

    }

    public static int[] buildIntArray(boolean flag) {
        if (flag) {
            int ry[] = { 1, 2, 3, 4, 5 };
            return ry;

        } else {
            System.out.print("Wat size of array you want > ");
            int size = sc.nextInt();
            int array[] = new int[size];

            for (int i = 0; i < size; i++) {
                System.out.print("Input Element no " + (i + 1) + " : ");
                array[i] = sc.nextInt();
            }

            System.out.print("[ ");
            for (int i = 0; i < size; i++) {
                System.out.print("\"" + array[i] + "\"");
            }
            System.out.println(" ]");

            return array;
        }

    }

    public static String searchNo(int arr[]) {
        System.out.print("Enter no you want to search : ");

        int no = sc.nextInt();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == no) {
                return "Found you no at index : " + i;
            }
        }
        return "Not found :( ";

    }
}
