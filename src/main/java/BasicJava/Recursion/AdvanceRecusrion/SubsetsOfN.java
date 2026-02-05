package Recursion.AdvanceRecusrion;

import java.util.ArrayList;

public class SubsetsOfN {

    public static void main(String[] args) {
        // Q. given a set with 1st n natural nos , print all its subsets.
        int n = 3;
        ArrayList<Integer> subset = new ArrayList<Integer>();

        printSubsets(n, subset);
    }

    // O(2*n)
    public static void printSubsets(int n, ArrayList<Integer> subset) {

        if(n ==0){
            System.out.println(subset);
            return;
        }

        // add in set
        subset.add(n);
        printSubsets(n-1, subset);

        //do not add in set
        subset.remove(subset.size()-1);
        printSubsets(n-1, subset);

    }

}
