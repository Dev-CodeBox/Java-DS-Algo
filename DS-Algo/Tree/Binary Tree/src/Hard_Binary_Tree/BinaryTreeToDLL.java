package Hard_Binary_Tree;

public class BinaryTreeToDLL {
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
        root.left = new Node(5);
        root.right = new Node(20);
        root.right.left = new Node(15);
        root.right.right = new Node(25);

        Node head = bToDLL(root);
        printDLL(head);
    }

    public static Node bToDLL(Node root) {
        Node[] head = { null }, tail = { null };
        BtToDll(root, head, tail);
        return head[0];
    }

    private static void BtToDll(Node root, Node[] head, Node[] tail) {
        if (root == null)
            return;

        BtToDll(root.left, head, tail);

        if (tail[0] != null) {
            tail[0].right = root;
            root.left = tail[0];
        } else {
            head[0] = root;
        }

        tail[0] = root;

        BtToDll(root.right, head, tail);
    }

    private static void printDLL(Node head) {
        System.out.print("DLL: ");
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.right;
        }
        System.out.println();
    }
}
