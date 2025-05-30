package Hard_Binary_Tree;

public class AVLTreeInsertion {
    static class Node {
        int data, height;
        Node left, right;

        Node(int val) {
            data = val;
            height = 1;
            left = right = null;
        }
    }

    public static void main(String[] args) {
        AVLTreeInsertion tree = new AVLTreeInsertion();
        Node root = null;

        int[] values = { 10, 20, 30, 40, 50, 25 };
        for (int val : values) {
            root = tree.insertToAVL(root, val);
        }

        System.out.println("Inorder traversal of AVL Tree:");
        inorder(root);
    }

    public Node insertToAVL(Node node, int data) {
        if (node == null) {
            return new Node(data);
        }

        if (data < node.data)
            node.left = insertToAVL(node.left, data);
        else if (data > node.data)
            node.right = insertToAVL(node.right, data);
        else
            return node;

        node.height = 1 + Math.max(height(node.left), height(node.right));
        int balance = getBalance(node);

        // Left Left
        if (balance > 1 && data < node.left.data)
            return rightRotate(node);

        // Right Right
        if (balance < -1 && data > node.right.data)
            return leftRotate(node);

        // Left Right
        if (balance > 1 && data > node.left.data) {
            node.left = leftRotate(node.left);
            return rightRotate(node);
        }

        // Right Left
        if (balance < -1 && data < node.right.data) {
            node.right = rightRotate(node.right);
            return leftRotate(node);
        }

        return node;
    }

    int height(Node node) {
        return (node == null) ? 0 : node.height;
    }

    int getBalance(Node node) {
        return (node == null) ? 0 : height(node.left) - height(node.right);
    }

    Node rightRotate(Node y) {
        Node x = y.left;
        Node T2 = x.right;

        x.right = y;
        y.left = T2;

        y.height = Math.max(height(y.left), height(y.right)) + 1;
        x.height = Math.max(height(x.left), height(x.right)) + 1;

        return x;
    }

    Node leftRotate(Node x) {
        Node y = x.right;
        Node T2 = y.left;

        y.left = x;
        x.right = T2;

        x.height = Math.max(height(x.left), height(x.right)) + 1;
        y.height = Math.max(height(y.left), height(y.right)) + 1;

        return y;
    }

    static void inorder(Node node) {
        if (node != null) {
            inorder(node.left);
            System.out.print(node.data + " ");
            inorder(node.right);
        }
    }
}
