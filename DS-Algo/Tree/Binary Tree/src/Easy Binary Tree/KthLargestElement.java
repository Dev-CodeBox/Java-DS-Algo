import java.util.ArrayList;

public class KthLargestElement {
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {
        Node root = new Node(50);
        root.left = new Node(30);
        root.right = new Node(70);
        root.left.left = new Node(20);
        root.left.right = new Node(40);
        root.right.left = new Node(60);
        root.right.right = new Node(80);

        KthLargestElement obj = new KthLargestElement();
        int k = 3;
        System.out.println("Kth largest element is: " + obj.kthLargest(root, k));
    }

    public int kthLargest(Node root, int k) {
        ArrayList<Integer> arr = new ArrayList<>();
        inorder(root, arr);
        return arr.get(k - 1);
    }

    public void inorder(Node root, ArrayList<Integer> arr) {
        if (root == null) {
            return;
        }
        inorder(root.right, arr);
        arr.add(root.data);
        inorder(root.left, arr);
    }
}
