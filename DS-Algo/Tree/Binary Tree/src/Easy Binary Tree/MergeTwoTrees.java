public class MergeTwoTrees {

    static class Node {
        int val;
        Node left;
        Node right;

        Node(int x) {
            val = x;
        }
    }

    public static void main(String[] args) {
        Node root1 = new Node(1);
        root1.left = new Node(3);
        root1.right = new Node(2);
        root1.left.left = new Node(5);

        Node root2 = new Node(2);
        root2.left = new Node(1);
        root2.right = new Node(3);
        root2.left.right = new Node(4);
        root2.right.right = new Node(7);

        MergeTwoTrees obj = new MergeTwoTrees();
        Node merged = obj.mergeTrees(root1, root2);
        obj.printInOrder(merged); // Optional: Print merged tree
    }

    public Node mergeTrees(Node root1, Node root2) {
        if (root1 == null)
            return root2;
        if (root2 == null)
            return root1;

        Node merged = new Node(root1.val + root2.val);
        merged.left = mergeTrees(root1.left, root2.left);
        merged.right = mergeTrees(root1.right, root2.right);
        return merged;
    }

    public void printInOrder(Node root) {
        if (root == null)
            return;
        printInOrder(root.left);
        System.out.print(root.val + " ");
        printInOrder(root.right);
    }
}
