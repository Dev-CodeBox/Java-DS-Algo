public class MinimumDepth {
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
        root.left.left = new Node(4);
        root.right = new Node(3);

        MinimumDepth tree = new MinimumDepth();
        System.out.println("Minimum Depth: " + tree.minDepth(root)); // Output: 2
    }

    int minDepth(Node root) {
        if (root == null)
            return 0;

        if (root.left == null)
            return minDepth(root.right) + 1;

        if (root.right == null)
            return minDepth(root.left) + 1;

        return Math.min(minDepth(root.left), minDepth(root.right)) + 1;
    }
}
