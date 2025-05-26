package Medium_Binary_Tree;

import java.util.ArrayList;

public class TreeBoundaryTraversal {

    static class Node {
        int data;
        Node left, right;

        Node(int val) {
            data = val;
            left = right = null;
        }
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        root.right.left.right = new Node(8);

        TreeBoundaryTraversal tree = new TreeBoundaryTraversal();
        ArrayList<Integer> result = tree.boundaryTraversal(root);

        System.out.println("Boundary Traversal:");
        for (int val : result) {
            System.out.print(val + " ");
        }
    }

    ArrayList<Integer> boundaryTraversal(Node node) {
        ArrayList<Integer> arr = new ArrayList<>();

        if (node == null) {
            return arr;
        }

        arr.add(node.data);

        leftBoundary(node.left, arr);

        leaves(node.left, arr);
        leaves(node.right, arr);

        rightBoundary(node.right, arr);

        return arr;
    }

    void leftBoundary(Node node, ArrayList<Integer> arr) {
        if (node == null || (node.left == null && node.right == null)) {
            return;
        }

        arr.add(node.data);

        if (node.left != null) {
            leftBoundary(node.left, arr);
        } else {
            leftBoundary(node.right, arr);
        }
    }

    void rightBoundary(Node node, ArrayList<Integer> arr) {
        if (node == null || (node.left == null && node.right == null)) {
            return;
        }

        if (node.right != null) {
            rightBoundary(node.right, arr);
        } else {
            rightBoundary(node.left, arr);
        }

        arr.add(node.data);
    }

    void leaves(Node node, ArrayList<Integer> arr) {
        if (node == null) {
            return;
        }

        if (node.left == null && node.right == null) {
            arr.add(node.data);
        }

        leaves(node.left, arr);
        leaves(node.right, arr);
    }
}
