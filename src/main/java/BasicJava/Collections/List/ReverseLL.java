package Collections.List;

import java.util.LinkedList;
import java.util.Stack;

public class ReverseLL {

    public static void main(String[] args) {

        LinkedList<Integer> list = CollectionLinkedList.giveLL();
        UserInputList.printList(list);
        UserInputList.printList(reverseLinkL(list));

    }

    // this is not done in space complexity O(1) thus go to new method below
    public static LinkedList<Integer> reverseLinkL(LinkedList<Integer> list) {

        LinkedList<Integer> rList = new LinkedList<>();

        Stack<Integer> s = new Stack<>();

        for (int i = 0; i < list.size(); i++) {
            s.push(list.get(i));
        }

        while (!s.isEmpty()) {
            rList.add(s.peek());
            s.pop();
        }

        return rList;
    }

}
