import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class NodesWithoutSibling {
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {
        // Example tree creation
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6); // Node 6 has no sibling

        NodesWithoutSibling obj = new NodesWithoutSibling();
        ArrayList<Integer> result = obj.noSibling(root);
        System.out.println(result);
    }

    ArrayList<Integer> noSibling(Node node) {
        ArrayList<Integer> singleChild = new ArrayList<>();
        levelOrder(node, singleChild);
        if (singleChild.isEmpty()) {
            singleChild.add(-1);
        } else {
            Collections.sort(singleChild);
        }
        return singleChild;
    }

    void levelOrder(Node node, ArrayList<Integer> singleChild) {
        if (node == null)
            return;
        Queue<Node> q = new LinkedList<>();
        q.offer(node);
        while (!q.isEmpty()) {
            Node front = q.poll();
            if (front.left != null && front.right == null) {
                singleChild.add(front.left.data);
            } else if (front.right != null && front.left == null) {
                singleChild.add(front.right.data);
            }
            if (front.left != null)
                q.offer(front.left);
            if (front.right != null)
                q.offer(front.right);
        }
    }
}
