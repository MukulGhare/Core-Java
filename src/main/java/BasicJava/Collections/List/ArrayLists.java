package Collections.List;

import java.util.*;
// import java.util.ArrayList;
// import java.util.Collections;

public class ArrayLists {

    public static void main(String[] args) {
        ArrayList<Integer> listInt = new ArrayList<>();

        // add in the last
        listInt.add(0);
        listInt.add(2);
        listInt.add(3);
        System.out.println(listInt);

        // get elem
        int ele = listInt.get(2);
        System.out.println(ele);

        // add in between
        listInt.add(1, 1);
        System.out.println("new list is -> " + listInt);

        // set an elem
        listInt.set(0, 5);
        System.out.println("new list is -> " + listInt);

        // delete elem
        listInt.remove(3);
        System.out.println("new list is -> " + listInt);

        // sorting in arrayList
        Collections.sort(listInt);
        System.out.println("sorted list is -> " + listInt);

    }

}
