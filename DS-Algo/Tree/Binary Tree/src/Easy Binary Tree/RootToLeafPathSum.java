public class RootToLeafPathSum {
    static class Node {
        int data;
        Node left, right;

        Node(int item) {
            data = item;
            left = right = null;
        }
    }

    public static void main(String[] args) {
        Node root = new Node(5);
        root.left = new Node(4);
        root.right = new Node(8);
        root.left.left = new Node(11);
        root.left.left.left = new Node(7);
        root.left.left.right = new Node(2);
        root.right.left = new Node(13);
        root.right.right = new Node(4);
        root.right.right.right = new Node(1);

        RootToLeafPathSum tree = new RootToLeafPathSum();
        int targetSum = 22;

        System.out.println(tree.hasPathSum(root, targetSum)); // Output: true
    }

    boolean hasPathSum(Node root, int target) {
        if (root == null)
            return false;

        if (root.left == null && root.right == null) {
            return target == root.data;
        }

        return hasPathSum(root.left, target - root.data) || hasPathSum(root.right, target - root.data);
    }
}
