import java.util.LinkedList;
import java.util.Queue;

public class MaxWidthTree {

    static class Node {
        int data;
        Node left, right;

        Node(int item) {
            data = item;
            left = right = null;
        }
    }

    public static void main(String[] args) {
        // Example tree
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(8);
        root.right.right.left = new Node(6);
        root.right.right.right = new Node(7);

        MaxWidthTree tree = new MaxWidthTree();
        System.out.println("Maximum width is: " + tree.getMaxWidth(root)); // Output: 4
    }

    int getMaxWidth(Node root) {
        if (root == null)
            return 0;

        int maxWidth = 0;
        Queue<Node> q = new LinkedList<>();
        q.offer(root);

        while (!q.isEmpty()) {
            int size = q.size();
            maxWidth = Math.max(maxWidth, size);

            for (int i = 0; i < size; i++) {
                Node front = q.poll();
                if (front.left != null)
                    q.offer(front.left);
                if (front.right != null)
                    q.offer(front.right);
            }
        }

        return maxWidth;
    }
}
