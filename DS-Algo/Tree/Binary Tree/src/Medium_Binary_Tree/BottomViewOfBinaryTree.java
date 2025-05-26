package Medium_Binary_Tree;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class BottomViewOfBinaryTree {

    static class Node {
        int data;
        Node left, right;

        Node(int val) {
            data = val;
            left = right = null;
        }
    }

    public static void main(String[] args) {
        Node root = new Node(20);
        root.left = new Node(8);
        root.right = new Node(22);
        root.left.left = new Node(5);
        root.left.right = new Node(3);
        root.right.left = new Node(4);
        root.right.right = new Node(25);
        root.left.right.left = new Node(10);
        root.left.right.right = new Node(14);

        BottomViewOfBinaryTree tree = new BottomViewOfBinaryTree();
        ArrayList<Integer> bottomViewNodes = tree.bottomView(root);

        System.out.println("Bottom view of the binary tree:");
        for (int val : bottomViewNodes) {
            System.out.print(val + " ");
        }
    }

    public ArrayList<Integer> bottomView(Node root) {
        ArrayList<Integer> arr = new ArrayList<>();
        if (root == null)
            return arr;

        Queue<AbstractMap.SimpleEntry<Node, Integer>> q = new LinkedList<>();
        q.offer(new AbstractMap.SimpleEntry<>(root, 0));

        HashMap<Integer, Node> distMap = new HashMap<>();

        int minDist = Integer.MAX_VALUE;
        int maxDist = Integer.MIN_VALUE;

        while (!q.isEmpty()) {
            AbstractMap.SimpleEntry<Node, Integer> p = q.poll();

            Node node = p.getKey();
            int dist = p.getValue();

            minDist = Math.min(minDist, dist);
            maxDist = Math.max(maxDist, dist);

            // For bottom view, overwrite existing node at dist
            distMap.put(dist, node);

            if (node.left != null) {
                q.offer(new AbstractMap.SimpleEntry<>(node.left, dist - 1));
            }

            if (node.right != null) {
                q.offer(new AbstractMap.SimpleEntry<>(node.right, dist + 1));
            }
        }

        for (int i = minDist; i <= maxDist; i++) {
            Node node = distMap.get(i);
            if (node != null)
                arr.add(node.data);
        }

        return arr;
    }
}
