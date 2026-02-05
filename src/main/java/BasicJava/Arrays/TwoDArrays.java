package Arrays;

import java.util.Scanner;

public class TwoDArrays {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int[][] arr2D = buildTwoDArray(true);

        System.out.print("Enter number to search in array : ");
        int no = sc.nextInt();

        searchInTwoDArr(arr2D, no);

        sc.close();
    }

    public static void searchInTwoDArr(int[][] arr, int no) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == no) {
                    System.out.println("No found at index [" + i + "][" + j + "]");
                }
            }
        }
    }

    public static int[][] buildTwoDArray(boolean flag) {

        if (flag) {
            int[][] arr = { { 11, 25, 34, 49 }, { 55, 67, 72, 81 }, { 90, 16, 88, 37 } };

            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[0].length; j++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
            return arr;
        } else {
            int rows, columns;
            System.out.print("Tell me no of rows : ");
            rows = sc.nextInt();

            System.out.print("Tell me no of columns : ");
            columns = sc.nextInt();

            int[][] my2DArry = new int[rows][columns];

            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    System.out.print("Enter [" + i + "][" + j + "] ");
                    my2DArry[i][j] = sc.nextInt();
                }
            }

            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    System.out.print(my2DArry[i][j] + " ");
                }
                System.out.println();
            }
            return my2DArry;
        }

    }

}
