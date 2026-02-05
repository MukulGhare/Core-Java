package Collections.Trees;

public class BasicTree {

    // Trees used to store hirearchy data
    // Trees consists nodes that store data
    // Top node -> Root node
    // Node which does not have any branches -> Leaf Node

    // Binary Tree has max 2 braches only
    // Parent node ; Child Node - Left Right NOde ; Sigling Node
    // ancesters -> Ns above till Root

    // Levels -> Root Node - level1 and
    // SubTrees -> left subtree and right subtree of a node

    static class Node {
        int data;
        Node LNode;
        Node RNode;

        Node(int data) {
            this.data = data;
            this.LNode = null;
            this.RNode = null;

        }
    }

    static class BinaryTree {
        static int idx = -1;

        public Node buildTree(int[] nodes) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }

            Node newN = new Node(nodes[idx]);
            newN.LNode = buildTree(nodes);
            newN.RNode = buildTree(nodes);

            return newN;

        }

    }

    public static void preOrderTraversal(Node root) {

        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");

        preOrderTraversal(root.LNode);
        preOrderTraversal(root.RNode);

    }

    public static void inOrderTraversal(Node root) {

        if (root == null) {
            return;
        }

        inOrderTraversal(root.LNode);
        System.out.print(root.data + " ");
        inOrderTraversal(root.RNode);
    }

    public static void postOrderTraversal(Node root) {

        if (root == null) {
            return;
        }

        postOrderTraversal(root.LNode);
        postOrderTraversal(root.RNode);
        System.out.print(root.data + " ");

    }

    public static void main(String[] args) {
        System.out.println();
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        BinaryTree BT = new BinaryTree();
        Node root = BT.buildTree(nodes);

        System.out.println(root.data);

        //preOrderTraversal(root);
        //System.out.println();
        //inOrderTraversal(root);
        System.out.println();
        postOrderTraversal(root);
    }

}
