public class BinaryTreeHeight {
    static class Node {
        int data;
        Node left, right;

        Node(int item) {
            data = item;
            left = right = null;
        }
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        BinaryTreeHeight tree = new BinaryTreeHeight();
        System.out.println("Height of tree: " + tree.height(root)); // Output: 2
    }

    int height(Node node) {
        return longestPath(node) - 1;
    }

    int longestPath(Node node) {
        if (node == null) {
            return 0;
        }
        int leftSubTree = longestPath(node.left);
        int rightSubTree = longestPath(node.right);
        return Math.max(leftSubTree, rightSubTree) + 1;
    }
}
