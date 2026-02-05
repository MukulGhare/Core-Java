package Collections.Stack;

public class LLQueue {

    static class Node {
        int data;
        Node next;

        Node(int n) {
            this.data = n;
            this.next = null;
        }
    }

    static class Q {

        static Node head;
        static Node tail;

        public Boolean isEmpty() {
            return head == null && tail == null;
        }

        public void add(int data) {
            Node newN = new Node(data);

            if (tail == null) {
                head = tail = newN;
                return;
            }

            tail.next = newN;
            tail = newN;

        }

        public int remove() {
            int front = head.data;
            head = head.next;
            return front;
        }
    }

    public static void main(String[] args) {
        Q q = new Q();
        q.add(1);
        q.add(2);
        q.add(3);

        System.out.println(q.remove());
        System.out.println(q.remove());

    }

}
