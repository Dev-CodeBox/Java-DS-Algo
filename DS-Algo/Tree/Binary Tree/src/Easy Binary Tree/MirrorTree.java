public class MirrorTree {
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    public static void main(String[] args) {
        MirrorTree tree = new MirrorTree();

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        System.out.print("Inorder before mirror: ");
        tree.inorder(root); // Output: 4 2 5 1 3
        System.out.println();

        tree.mirror(root);

        System.out.print("Inorder after mirror: ");
        tree.inorder(root); // Output: 3 1 5 2 4
        System.out.println();
    }

    void mirror(Node node) {
        if (node == null)
            return;

        Node temp = node.left;
        node.left = node.right;
        node.right = temp;

        mirror(node.left);
        mirror(node.right);
    }

    void inorder(Node node) {
        if (node == null)
            return;
        inorder(node.left);
        System.out.print(node.data + " ");
        inorder(node.right);
    }
}
