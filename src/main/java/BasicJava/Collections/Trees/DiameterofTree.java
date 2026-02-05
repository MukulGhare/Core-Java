package Collections.Trees;

public class DiameterofTree {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = this.right = null;
        }
    }

    static class BTree {
        static int idx = -1;

        public Node builtBtree(int[] nodes) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }
            Node newN = new Node(nodes[idx]);

            newN.left = builtBtree(nodes);
            newN.right = builtBtree(nodes);

            return newN;
        }
    }

    public static int height(Node root) {
        if (root == null) {
            return 0;
        }

        int leftH = height(root.left);
        int rightH = height(root.right);

        return Math.max(leftH, rightH) + 1;
    }

    // O(n*2) -> not optimal
    public static int diameter(Node root) {
        if (root == null) {
            return 0;
        }

        int leftDia = diameter(root.left);
        int rightDia = diameter(root.right);

        int rootDia = height(root.left) + height(root.right) + 1;

        return Math.max(Math.max(rightDia, leftDia), rootDia);
    }

    // O(n) --> optimized for diameter of tree - find height and diameter together

    static class TreeInfo {
        int height;
        int diameter;

        TreeInfo(int height, int diameter) {
            this.height = height;
            this.diameter = diameter;
        }
    }

    public static TreeInfo diameter2(Node root) {

        if( root==null){
            return new TreeInfo(0, 0);
        }

        TreeInfo left = diameter2(root.left);
        TreeInfo right = diameter2(root.right);

        int myHeight = Math.max(left.height, right.height) + 1;

        int dia1 = left.diameter;
        int dia2 = right.diameter;
        int dia3 = left.height + right.height + 1;

        int myDiameter = Math.max(Math.max(dia1, dia2), dia3);

        return new TreeInfo(myHeight, myDiameter);

    }

    public static void main(String[] args) {
        System.out.println();
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };

        BTree tree = new BTree();
        Node root = tree.builtBtree(nodes);
        System.out.println(height(root));
        System.out.println(diameter(root));
        System.out.println(diameter2(root).diameter);

    }

}
