package Collections.Trees;

public class CountNodes {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = this.right = null;
        }
    }

    static class BinaryTree {
        static int idx = -1;

        public Node createTree(int[] nodes) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }
            Node newN = new Node(nodes[idx]);

            newN.left = createTree(nodes);
            newN.right = createTree(nodes);
            return newN;
        }
    }

    public static void inorder(Node root) {

        if (root == null) {
            return;
        }

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static int countNodes(Node root) {

        if (root == null) {
            return 0;
        }
        int left = countNodes(root.left);
        int right = countNodes(root.right);

        return left + right + 1;
    }

    public static int sumOfNodes(Node root) {
        if (root == null) {
            return 0;
        }

        int leftSum = sumOfNodes(root.left);
        int rightSum = sumOfNodes(root.right);

        return leftSum + rightSum + root.data;
    }

    public static int treeHeight(Node root) {

        if (root == null) {
            return 0;
        }

        int lH = treeHeight(root.left);
        int rH = treeHeight(root.right);

        return (lH > rH ? lH : rH) + 1;
        // return Math.max(lH, rH) + 1;

    }

    public static void main(String args[]) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };

        BinaryTree tree = new BinaryTree();
        Node root = tree.createTree(nodes);

        // inorder(root); // 4 2 5 1 3 6
        // System.out.println(countNodes(root));
        // System.out.println(sumOfNodes(root));

        System.out.println(treeHeight(root));

    }

}
