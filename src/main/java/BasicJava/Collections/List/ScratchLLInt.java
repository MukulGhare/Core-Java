package Collections.List;

public class ScratchLLInt {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int no) {
            this.data = no;
            this.next = null;
        }
    }

    public void addFirst(int no) {
        Node newN = new Node(no);
        if (head == null) {
            head = newN;
        } else {
            newN.next = head;
            head = newN;
        }

    }

    public void addLast(int no) {
        Node newNode = new Node(no);
        Node current = head;

        while (current.next != null) {
            current = current.next;
        }

        current.next = newNode;

    }

    public void printLL() {

        Node currentNode = head;

        while (currentNode != null) {
            System.out.print(currentNode.data + " -> ");
            currentNode = currentNode.next;
        }
        System.out.println("NULL");

    }

    public void revereIterate() {

        if (head == null || head.next == null) {
            return;
        }

        Node P = head;
        Node curr = head.next;

        while (curr != null) {
            Node N = curr.next;
            curr.next = P;


            P = curr;
            curr = N;
        }
        head.next =null;
        head=P;

    }


    public Node reverseRecursive (Node head){

        if( head == null || head.next == null){
            return head;
        }
        Node newHead = reverseRecursive(head.next);

        head.next.next = head;
        head.next = null;

        return newHead;
    }


    public static void main(String[] args) {
        ScratchLLInt list = new ScratchLLInt();

        list.addFirst(5);
        list.addFirst(4);
        list.addFirst(3);
        list.addLast(6);
        list.addLast(7);

        list.printLL();

        //list.revereIterate();
        list.head = list.reverseRecursive(list.head);
        list.printLL();

    }

}
