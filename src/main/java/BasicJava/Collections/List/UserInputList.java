package Collections.List;

import java.util.*;

public class UserInputList {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> list = new LinkedList<>();

        System.out.print("Input nos one by one to create a list OR Press 100 to exit : ");

        while (true) {

            int input = sc.nextInt();

            if (input == 100) {
                break;
            }
            list.add(input);

        }

        printList(list);
        delBigNodes(list);
        printList(list);

        sc.close();

    }


    public static void delBigNodes(LinkedList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > 25) {
                list.remove(i);
                i--;
            }
        }
    }

    public static void printList(LinkedList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " -> ");
        }
        System.out.println("null");
    }

}
