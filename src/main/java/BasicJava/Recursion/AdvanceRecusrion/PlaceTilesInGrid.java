package Recursion.AdvanceRecusrion;

public class PlaceTilesInGrid {

    public static void main(String[] args) {

        // Q. fin ways to place 1xm tiles in a grid of nxm ?

        int ways = placeTiles(3, 3);
        System.out.println(ways);

    }

    public static int placeTiles(int n, int m) {

        if (n == m) {
            return 2;
        }

        if(n <m ){
            return 1;
        }
        return placeTiles(n - m, m) + placeTiles(n - 1, m);

    }

}
