package LRUCache;

public class DoublyLinkedList {

    private Node head;
    private Node tail;


    public void moveToHead(Node moveNode) {
        removeNode(moveNode);
        addToHead(moveNode);
    }

    public void addToHead(Node putNode) {

        putNode.prev=null;
        putNode.next = head;

        if( head != null){
            head.prev=putNode;
        }

        head = putNode;

        if( tail == null){
            tail = putNode;
        }

    }

    public Node removeTail() {
        Node lru = tail;
        removeNode(lru);
        return lru;

    }

    private void removeNode (Node removeNode){
        if (removeNode.prev != null) {
            removeNode.prev.next = removeNode.next;
        } else {
            head = removeNode.next;
        }

        if (removeNode.next != null) {
            removeNode.next.prev = removeNode.prev;
        } else {
            tail = removeNode.prev;
        }
    }
}
