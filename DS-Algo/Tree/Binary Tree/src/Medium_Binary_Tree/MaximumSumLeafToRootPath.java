package Medium_Binary_Tree;

public class MaximumSumLeafToRootPath {
    static class Node {
        int data;
        Node left, right;

        Node(int val) {
            data = val;
            left = right = null;
        }
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(8);
        root.right = new Node(2);
        root.left.left = new Node(3);
        root.left.right = new Node(5);
        root.right.left = new Node(2);

        System.out.println("Maximum leaf to root path sum: " + maxPathSum(root));
    }

    public static int maxPathSum(Node root) {
        return maxLeafToRootPathSum(root);
    }

    private static int maxLeafToRootPathSum(Node node) {
        if (node == null) {
            return Integer.MIN_VALUE;
        }

        if (node.left == null && node.right == null) {
            return node.data;
        }

        int leftSum = maxLeafToRootPathSum(node.left);
        int rightSum = maxLeafToRootPathSum(node.right);

        if (node.left == null)
            return node.data + rightSum;
        if (node.right == null)
            return node.data + leftSum;

        return node.data + Math.max(leftSum, rightSum);
    }
}
