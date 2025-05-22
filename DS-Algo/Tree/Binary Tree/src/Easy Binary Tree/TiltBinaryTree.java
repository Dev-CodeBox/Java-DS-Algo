public class TiltBinaryTree {
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    int totalTilt = 0;

    public int tiltTree(Node root) {
        computeSum(root);
        return totalTilt;
    }

    private int computeSum(Node root) {
        if (root == null)
            return 0;

        int leftSum = computeSum(root.left);
        int rightSum = computeSum(root.right);

        totalTilt += Math.abs(leftSum - rightSum);

        return root.data + leftSum + rightSum;
    }
}
