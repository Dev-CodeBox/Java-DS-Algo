package Medium_Binary_Tree;

public class IsBinaryTreeHeap {
    static class Node {
        int data;
        Node left, right;

        Node(int item) {
            data = item;
            left = right = null;
        }
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(9);
        root.right = new Node(8);
        root.left.left = new Node(7);
        root.left.right = new Node(6);
        root.right.left = new Node(5);
        root.right.right = new Node(4);

        IsBinaryTreeHeap obj = new IsBinaryTreeHeap();
        System.out.println(obj.isHeap(root)); // Output: true
    }

    boolean isHeap(Node tree) {
        int count = countNodes(tree);
        return isHeapUtil(tree, 0, count);
    }

    int countNodes(Node root) {
        if (root == null)
            return 0;
        return 1 + countNodes(root.left) + countNodes(root.right);
    }

    boolean isHeapUtil(Node root, int index, int totalNodes) {
        if (root == null)
            return true;

        if (index >= totalNodes)
            return false;

        if (root.left != null && root.data < root.left.data)
            return false;
        if (root.right != null && root.data < root.right.data)
            return false;

        return isHeapUtil(root.left, 2 * index + 1, totalNodes) &&
                isHeapUtil(root.right, 2 * index + 2, totalNodes);
    }
}