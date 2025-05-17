import java.util.ArrayList;

public class LeftView {
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
        root.right.right = new Node(6);

        ArrayList<Integer> leftViewList = leftView(root);
        System.out.println(leftViewList); // Output: [1, 2, 4]
    }

    static ArrayList<Integer> leftView(Node root) {
        ArrayList<Integer> arr = new ArrayList<>();
        leftNodeInsertion(root, 0, arr);
        return arr;
    }

    static void leftNodeInsertion(Node root, int level, ArrayList<Integer> arr) {
        if (root == null)
            return;

        if (arr.size() == level) {
            arr.add(root.data);
        }

        leftNodeInsertion(root.left, level + 1, arr);
        leftNodeInsertion(root.right, level + 1, arr);
    }
}
