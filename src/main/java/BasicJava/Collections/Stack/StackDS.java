package Collections.Stack;

// Last in First OUT -> LIFO

// .push() - add element in stack O(1)
// .pop()  - remove element from top of stack O(1)
// .peek() - get element at top of stack O(1)

public class StackDS {

    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            next = null;
        }
    }

    static class Stack {
        public static Node head;

        public static Boolean isEmpty() {
            return head == null;
        }

        public void push(int data) {
            Node newNode = new Node(data);

            if (isEmpty()) {
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }

        public Node peek() {
            return head;
        }

        public void pop() {
            if (isEmpty()) {
                return;
            }

            if (head.next == null) {
                head = null;
                return;
            }

            head = head.next;
            return;
        }

        public void printStack() {

            Node newN = head;

            while (newN != null){
                System.out.print(newN.data + " -> ");
                newN = newN.next;
            }
            System.out.print("null");

        }
    }

    public static void main(String[] args) {

        Stack stack = new Stack();

        stack.push(1);
        stack.push(2);
        stack.printStack();
        // Node n = stack.peek();
        // System.out.println(n.data);

    }

}
