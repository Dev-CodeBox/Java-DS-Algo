import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class IdenticalTree {
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    public static void main(String[] args) {
        Node r1 = new Node(1);
        r1.left = new Node(2);
        r1.right = new Node(3);

        Node r2 = new Node(1);
        r2.left = new Node(2);
        r2.right = new Node(3);

        IdenticalTree tree = new IdenticalTree();
        System.out.println(tree.isIdentical(r1, r2)); // true
    }

    boolean isIdentical(Node r1, Node r2) {
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();
        levelOrder(r1, arr1);
        levelOrder(r2, arr2);
        return arr1.equals(arr2);
    }

    void levelOrder(Node root, ArrayList<Integer> arr) {
        if (root == null) {
            arr.add(null);
            return;
        }

        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        while (!q.isEmpty()) {
            Node front = q.poll();
            if (front != null) {
                arr.add(front.data);
                q.offer(front.left);
                q.offer(front.right);
            } else {
                arr.add(null);
            }
        }
    }
}
