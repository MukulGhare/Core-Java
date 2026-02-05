package Arrays;

public class Spiral2DArr {

    public static void main(String[] args) {

        int[][] arr = TwoDArrays.buildTwoDArray(false);

        int rowStart = 0;
        int rowEnd = arr.length - 1;

        int colStart = 0;
        int colEnd = arr[0].length - 1;

        System.out.println(rowStart + " " + rowEnd + " " + colStart + " " + colEnd);

        while (rowStart <= rowEnd && colStart <= colEnd) {
            for (int col = rowStart; col <= colEnd; col++) {
                System.out.print(arr[rowStart][col] + " ");
            }
            rowStart++;

            for (int row = rowStart; row < colEnd; row++) {
                System.out.print(arr[row][colEnd] + " ");
            }
            colEnd--;

            for (int col = colEnd; col >= 0; col--) {
                System.out.print(arr[rowEnd][col] + " ");
            }
            rowEnd--;

            for (int col = colStart; col <= colEnd; col++) {
                System.out.print(arr[rowEnd][col] + " ");
            }
            colStart++ ;
        }

    }

}
