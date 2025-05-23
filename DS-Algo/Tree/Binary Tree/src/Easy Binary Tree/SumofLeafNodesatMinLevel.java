import java.util.*;

public class SumofLeafNodesatMinLevel {
    static class Node {
        int data;
        Node left, right;

        Node(int item) {
            data = item;
            left = right = null;
        }
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.right.left = new Node(5);
        root.right.right = new Node(6);
        root.right.left.left = new Node(7);

        System.out.println("Sum of leaf nodes at minimum level: " + minLeafSum(root));
    }

    public static int minLeafSum(Node root) {
        if (root == null)
            return 0;

        Queue<Node> q = new LinkedList<>();
        q.offer(root);

        while (!q.isEmpty()) {
            int size = q.size();
            int sum = 0;
            boolean foundLeaf = false;

            for (int i = 0; i < size; i++) {
                Node curr = q.poll();

                if (curr.left == null && curr.right == null) {
                    sum += curr.data;
                    foundLeaf = true;
                }
                if (curr.left != null)
                    q.offer(curr.left);
                if (curr.right != null)
                    q.offer(curr.right);
            }

            if (foundLeaf)
                return sum;
        }

        return 0;
    }
}
