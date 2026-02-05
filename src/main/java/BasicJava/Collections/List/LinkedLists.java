package Collections.List;

public class LinkedLists {

    static Node head;

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    // adds node in the start of linkedList

    public void addFirst(String data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }

    }

    // adds node in the end of linkedList

    public void addLast(String data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        }

        Node currentNode = head;

        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }

        currentNode.next = newNode;

    }

    public void deleteFirst() {
        if (head == null) {
            System.out.println(" This List is empty :/ ");
            return;
        }

        head = head.next;
    }

    public void deleteLast() {

        if (head == null) {
            System.out.println(" This List is empty :/ ");
            return;
        }

        if (head.next == null) {
            head = null;
            return;
        }

        Node secondLast = head;
        Node last = head.next;

        while (last.next != null) {

            secondLast = last;
            last = last.next;

        }

        secondLast.next = null;

    }

    // Delete Given Node from linkedList

    public void deleteNode(String node) {
        if (head == null) {
            System.out.println(" This List is empty :/ ");
            return;
        }

        if (head.next == null) {
            head = null;
            return;
        }

        Node previousN = head;
        Node toDelete = head.next;
        Node nextN = null;

        while (toDelete.data != node) {
            previousN = toDelete;
            toDelete = toDelete.next;
        }

        nextN = toDelete.next;
        previousN.next = nextN;

    }

    // Prints all Node's data

    public void printLL() {

        Node currentNode = head;

        while (currentNode != null) {
            System.out.print(currentNode.data + " -> ");
            currentNode = currentNode.next;
        }
        System.out.println("NULL");

    }

    public static void main(String[] args) {

        LinkedLists ll = new LinkedLists();

        ll.addFirst("a");
        ll.addFirst("is");
        ll.addLast("list");
        ll.addFirst("This");
        ll.printLL();

        ll.deleteFirst();
        ll.deleteLast();
        ll.printLL();

        ll.addLast("list");
        ll.addFirst("This");
        ll.printLL();

        ll.deleteNode("a");
        ll.printLL();

    }

}
