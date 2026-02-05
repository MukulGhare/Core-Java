package Collections.Trees;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderRevision {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree {
        int idx = -1;

        public Node buildBinaryTree(int[] arr) {
            idx++;

            if (arr[idx] == -1) {
                return null;
            }

            Node newN = new Node(arr[idx]);

            newN.left = buildBinaryTree(arr);
            newN.right = buildBinaryTree(arr);

            return newN;

        }

    }

    public static void inOrder(Node root) {

        if (root == null) {
            return;
        }

        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    public static void levelOrderTraversal(Node root) {
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while (!q.isEmpty()) {
            Node n = q.remove();

            if (n != null) {
                System.out.print(n.data + " ");
                if (n.left != null)
                    q.add(n.left);
                if (n.right != null)
                    q.add(n.right);
            } else {
                System.out.println();
                if (!q.isEmpty()) {
                    q.add(null);
                }
            }

        }

    }

    public static void main(String[] args) {
        System.out.println();
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };

        BinaryTree bt = new BinaryTree();
        Node root = bt.buildBinaryTree(nodes);

        inOrder(root);
        System.out.println();
        levelOrderTraversal(root);
    }

}
