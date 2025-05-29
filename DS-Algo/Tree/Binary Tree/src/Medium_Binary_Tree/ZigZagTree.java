package Medium_Binary_Tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class ZigZagTree {
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            this.left = this.right = null;
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

        ZigZagTree tree = new ZigZagTree();
        ArrayList<Integer> result = tree.zigZagTraversal(root);
        System.out.println(result); // Output: [1, 3, 2, 4, 5, 6, 7]
    }

    ArrayList<Integer> zigZagTraversal(Node root) {
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        zigzagLevelOrderItr(root, arr);

        // Flatten the 2D list into a single list
        ArrayList<Integer> result = new ArrayList<>();
        for (ArrayList<Integer> level : arr) {
            result.addAll(level);
        }
        return result;
    }

    public void zigzagLevelOrderItr(Node root, ArrayList<ArrayList<Integer>> arr) {
        if (root == null)
            return;

        Queue<Node> q = new LinkedList<>();
        q.offer(root);

        boolean leftToRight = true;

        while (!q.isEmpty()) {
            int size = q.size();
            ArrayList<Integer> temp = new ArrayList<>();

            for (int i = 0; i < size; i++) {
                Node node = q.poll();
                temp.add(node.data);

                if (node.left != null)
                    q.offer(node.left);
                if (node.right != null)
                    q.offer(node.right);
            }

            if (!leftToRight)
                Collections.reverse(temp);
            arr.add(temp);
            leftToRight = !leftToRight;
        }
    }
}
