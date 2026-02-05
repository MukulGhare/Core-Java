package Recursion.AdvanceRecusrion;

public class MoveInMatrix {

    public static void main(String[] args) {
        // movew in a nXm matrix from 0,0 to n,m in how many ways ?

        System.out.println(noOfWays(3, 3, 0, 0));

    }

    public static int noOfWays(int n, int m, int i, int j) {

        if (i == n || j == m) {
            return 0;
        }

        if (i == n - 1 && j == m - 1) {
            return 1;
        }

        return noOfWays(n, m, i + 1, j) + noOfWays(n, m, i, j + 1);

    }

}
