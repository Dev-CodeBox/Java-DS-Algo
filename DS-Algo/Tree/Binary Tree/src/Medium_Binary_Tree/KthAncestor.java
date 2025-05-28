package Medium_Binary_Tree;

import java.util.*;

public class KthAncestor {
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        KthAncestor obj = new KthAncestor();
        int k = 2, node = 5;
        System.out.println("Kth Ancestor of node " + node + ": " + obj.kthAncestor(root, k, node)); // Output: 1
    }

    public int kthAncestor(Node root, int k, int node) {
        if (root == null || root.data == node)
            return -1;

        Map<Integer, Integer> parentMap = new HashMap<>();
        buildParentMap(root, parentMap);

        int current = node;
        while (k > 0 && parentMap.containsKey(current)) {
            current = parentMap.get(current);
            k--;
        }

        return k == 0 ? current : -1;
    }

    private void buildParentMap(Node root, Map<Integer, Integer> parentMap) {
        Queue<Node> q = new LinkedList<>();
        q.offer(root);

        while (!q.isEmpty()) {
            Node curr = q.poll();

            if (curr.left != null) {
                parentMap.put(curr.left.data, curr.data);
                q.offer(curr.left);
            }

            if (curr.right != null) {
                parentMap.put(curr.right.data, curr.data);
                q.offer(curr.right);
            }
        }
    }
}