package Collections.List;

import java.util.*;

// import Strings.lengthStrArr;

public class CollectionLinkedList {

    // public static void main(String[] args) {

    // LinkedList<String> list = new LinkedList<>();

    // list.add("a");
    // list.addFirst("is");
    // list.addLast("list");
    // list.addFirst("This");

    // System.out.println(list);

    // for (int i = 0; i < list.size(); i++) {
    // System.out.print(list.get(i) + " -> ");
    // }
    // System.out.println("null");

    // list.remove(2);
    // System.out.println(list);

    // }

    public static void main(String[] args) {

        LinkedList<Integer> intList = new LinkedList<>();

        intList.add(3);
        intList.addFirst(7);
        intList.addFirst(5);
        intList.addFirst(1);
        intList.addLast(8);
        intList.addLast(2);
        intList.addLast(3);

        for (int i = 0; i < intList.size(); i++) {
            System.out.print(intList.get(i) + " -> ");
        }
        System.out.println("null");

        for (int i = 0; i < intList.size(); i++) {
            if (intList.get(i) == 7) {
                System.out.println(7 + " is present at index -> " + i);
            }
        }

    }

    public static LinkedList<Integer> giveLL() {
        LinkedList<Integer> intList = new LinkedList<>();

        intList.add(3);
        intList.addFirst(7);
        intList.addFirst(5);
        intList.addFirst(1);
        intList.addLast(8);
        intList.addLast(2);
        intList.addLast(3);

        return intList;

    }

}
