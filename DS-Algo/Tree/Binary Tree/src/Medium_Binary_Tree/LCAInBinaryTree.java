package Medium_Binary_Tree;

public class LCAInBinaryTree {

    static class Node {
        int data;
        Node left, right;

        Node(int val) {
            data = val;
            left = right = null;
        }
    }

    public static void main(String[] args) {
        Node root = new Node(3);
        root.left = new Node(5);
        root.right = new Node(1);
        root.left.left = new Node(6);
        root.left.right = new Node(2);
        root.right.left = new Node(0);
        root.right.right = new Node(8);

        LCAInBinaryTree tree = new LCAInBinaryTree();
        Node lcaNode = tree.lca(root, 5, 1);
        System.out.println("LCA: " + (lcaNode != null ? lcaNode.data : "null"));
    }

    Node lca(Node root, int n1, int n2) {
        if (root == null)
            return null;
        if (root.data == n1 || root.data == n2)
            return root;

        Node leftSubTree = lca(root.left, n1, n2);
        Node rightSubTree = lca(root.right, n1, n2);

        if (leftSubTree != null && rightSubTree != null) {
            return root;
        }
        return (leftSubTree != null) ? leftSubTree : rightSubTree;
    }
}
