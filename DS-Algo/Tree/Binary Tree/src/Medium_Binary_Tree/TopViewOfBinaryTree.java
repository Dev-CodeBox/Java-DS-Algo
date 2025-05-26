package Medium_Binary_Tree;

import java.util.*;

public class TopViewOfBinaryTree {

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
        root.left.right = new Node(4);
        root.left.right.right = new Node(5);
        root.left.right.right.right = new Node(6);

        ArrayList<Integer> topViewNodes = topView(root);
        System.out.println("Top view of the binary tree:");
        for (int val : topViewNodes) {
            System.out.print(val + " ");
        }
    }

    static ArrayList<Integer> topView(Node root) {
        if (root == null)
            return new ArrayList<>();

        Queue<AbstractMap.SimpleEntry<Node, Integer>> q = new LinkedList<>();
        q.offer(new AbstractMap.SimpleEntry<>(root, 0));

        Map<Integer, Node> distMap = new HashMap<>();

        int minDist = Integer.MAX_VALUE;
        int maxDist = Integer.MIN_VALUE;

        while (!q.isEmpty()) {
            AbstractMap.SimpleEntry<Node, Integer> p = q.poll();

            Node node = p.getKey();
            int dist = p.getValue();

            minDist = Math.min(minDist, dist);
            maxDist = Math.max(maxDist, dist);

            if (!distMap.containsKey(dist)) {
                distMap.put(dist, node);
            }

            if (node.left != null) {
                q.offer(new AbstractMap.SimpleEntry<>(node.left, dist - 1));
            }

            if (node.right != null) {
                q.offer(new AbstractMap.SimpleEntry<>(node.right, dist + 1));
            }
        }

        ArrayList<Integer> result = new ArrayList<>();
        for (int i = minDist; i <= maxDist; i++) {
            if (distMap.containsKey(i)) {
                result.add(distMap.get(i).data);
            }
        }

        return result;
    }

}
