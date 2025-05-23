import java.util.*;

public class MaxLevelSum {
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
        root.right.right = new Node(8);
        root.right.right.right = new Node(7);

        System.out.println("Maximum level sum = " + maxLevelSum(root)); // Should print 17
    }

    public static int maxLevelSum(Node root) {
        if (root == null)
            return 0;

        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        int maxSum = Integer.MIN_VALUE;

        while (!q.isEmpty()) {
            int size = q.size();
            int levelSum = 0;

            for (int i = 0; i < size; i++) {
                Node front = q.poll();
                levelSum += front.data;

                if (front.left != null)
                    q.offer(front.left);
                if (front.right != null)
                    q.offer(front.right);
            }

            maxSum = Math.max(maxSum, levelSum);
        }

        return maxSum;
    }
}
