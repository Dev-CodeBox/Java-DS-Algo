public class DepthOfNode {
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(5);
        root.right = new Node(15);
        root.left.left = new Node(3); // depth 3 (odd)
        root.left.right = new Node(7); // depth 3 (odd)
        root.right.right = new Node(20); // depth 3 (odd)

        System.out.println(depthOfOddLeaf(root)); // Output: 3
    }

    public static int depthOfOddLeaf(Node root) {
        return allNodeDepth(root, 1);
    }

    public static int allNodeDepth(Node root, int depth) {
        if (root == null)
            return 0;

        if (root.left == null && root.right == null) {
            return (depth % 2 != 0) ? depth : 0;
        }

        int left = allNodeDepth(root.left, depth + 1);
        int right = allNodeDepth(root.right, depth + 1);

        return Math.max(left, right);
    }
}
