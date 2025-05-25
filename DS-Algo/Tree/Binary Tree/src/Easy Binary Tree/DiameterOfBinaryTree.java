public class DiameterOfBinaryTree {

    class Node {
        int val;
        Node left;
        Node right;

        Node(int x) {
            val = x;
        }
    }

    int maxDiameter = 0;

    public static void main(String[] args) {
        DiameterOfBinaryTree tree = new DiameterOfBinaryTree();

        Node root = tree.new Node(1);
        root.left = tree.new Node(2);
        root.right = tree.new Node(3);
        root.left.left = tree.new Node(4);
        root.left.right = tree.new Node(5);

        int diameter = tree.diameterOfBinaryTree(root);
        System.out.println("Diameter of the binary tree: " + diameter); // Expected: 3
    }

    public int diameterOfBinaryTree(Node root) {
        height(root);
        return maxDiameter;
    }

    private int height(Node node) {
        if (node == null)
            return 0;

        int leftHeight = height(node.left);
        int rightHeight = height(node.right);

        maxDiameter = Math.max(maxDiameter, leftHeight + rightHeight);

        return Math.max(leftHeight, rightHeight) + 1;
    }
}
