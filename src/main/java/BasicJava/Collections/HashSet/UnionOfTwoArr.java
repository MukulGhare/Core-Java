package Collections.HashSet;

import java.util.*;

public class UnionOfTwoArr {

    public static void union(int[] arr1, int[] arr2) {
        HashSet<Integer> set = new HashSet<>();

        for (int i : arr1) {
            set.add(i);
        }

        for (int i : arr2) {
            set.add(i);
        }

        System.out.println(set);

    }

    public static void main(String[] args) {

        int[] arr1 = { 7, 3, 9 };
        int[] arr2 = { 6, 3, 9, 2, 9, 4 };

        union(arr1, arr2);

    }

}
