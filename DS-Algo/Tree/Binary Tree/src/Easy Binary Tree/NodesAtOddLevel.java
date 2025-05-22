import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class NodesAtOddLevel {

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
        root.right.right = new Node(6);

        ArrayList<Integer> result = new NodesAtOddLevel().nodesAtOddLevels(root);
        System.out.println(result); // Output: [1, 4, 5, 6]
    }

    public ArrayList<Integer> nodesAtOddLevels(Node root) {
        ArrayList<Integer> result = new ArrayList<>();
        if (root == null)
            return result;

        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        boolean isOddLevel = true;

        while (!q.isEmpty()) {
            int size = q.size();

            for (int i = 0; i < size; i++) {
                Node curr = q.poll();
                if (isOddLevel) {
                    result.add(curr.data);
                }
                if (curr.left != null)
                    q.offer(curr.left);
                if (curr.right != null)
                    q.offer(curr.right);
            }
            isOddLevel = !isOddLevel;
        }

        return result;
    }
}
