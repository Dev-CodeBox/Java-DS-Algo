import java.util.ArrayList;

public class RightView {
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
        root.left.right = new Node(5);
        root.right.right = new Node(4);

        ArrayList<Integer> result = rightView(root);
        System.out.println(result); // Output: [1, 3, 4]
    }

    static ArrayList<Integer> rightView(Node root) {
        ArrayList<Integer> arr = new ArrayList<>();
        rightNodeInsertion(root, 0, arr);
        return arr;
    }

    static void rightNodeInsertion(Node root, int level, ArrayList<Integer> arr) {
        if (root == null)
            return;

        if (arr.size() == level) {
            arr.add(root.data);
        }

        rightNodeInsertion(root.right, level + 1, arr);
        rightNodeInsertion(root.left, level + 1, arr);
    }
}
