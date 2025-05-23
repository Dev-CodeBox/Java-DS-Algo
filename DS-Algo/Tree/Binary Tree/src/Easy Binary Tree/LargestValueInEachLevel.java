import java.util.*;

public class LargestValueInEachLevel {
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
        root.left = new Node(3);
        root.right = new Node(2);
        root.left.left = new Node(5);
        root.left.right = new Node(3);
        root.right.right = new Node(9);

        ArrayList<Integer> result = largestValues(root);
        System.out.println("Largest values at each level: " + result);
    }

    public static ArrayList<Integer> largestValues(Node root) {
        ArrayList<Integer> arr = new ArrayList<>();
        if (root == null)
            return arr;

        Queue<Node> q = new LinkedList<>();
        q.offer(root);

        while (!q.isEmpty()) {
            int size = q.size();
            int max = Integer.MIN_VALUE;

            for (int i = 0; i < size; i++) {
                Node curr = q.poll();
                max = Math.max(max, curr.data);

                if (curr.left != null)
                    q.offer(curr.left);
                if (curr.right != null)
                    q.offer(curr.right);
            }

            arr.add(max);
        }

        return arr;
    }
}
