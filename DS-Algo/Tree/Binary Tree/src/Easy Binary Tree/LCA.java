public class LCA {
    static class Node {
        int data;
        Node left, right;

        Node(int item) {
            data = item;
            left = right = null;
        }
    }

    public static void main(String[] args) {
        Node root = new Node(20);
        root.left = new Node(10);
        root.right = new Node(30);
        root.left.left = new Node(5);
        root.left.right = new Node(15);
        root.right.left = new Node(25);
        root.right.right = new Node(35);

        LCA tree = new LCA();
        Node lca = tree.LCA(root, root.left.left, root.left.right);
        System.out.println("LCA: " + lca.data);
    }

    Node LCA(Node root, Node n1, Node n2) {
        if (root == null)
            return null;

        if (n1.data < root.data && n2.data < root.data) {
            return LCA(root.left, n1, n2);
        }

        if (n1.data > root.data && n2.data > root.data) {
            return LCA(root.right, n1, n2);
        }

        return root; 
    }
}
