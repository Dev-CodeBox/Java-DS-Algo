import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class KDistanceFromRoot {
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        ArrayList<Integer> result = Kdistance(root, 2);
        System.out.println(result); // Output: [4, 5]
    }

    public static ArrayList<Integer> Kdistance(Node root, int k) {
        ArrayList<Integer> result = new ArrayList<>();
        if (root == null)
            return result;

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        int level = 0;

        while (!queue.isEmpty()) {
            int size = queue.size();

            if (level == k) {
                for (Node node : queue) {
                    result.add(node.data);
                }
                break;
            }

            while (size-- > 0) {
                Node curr = queue.poll();
                if (curr.left != null)
                    queue.add(curr.left);
                if (curr.right != null)
                    queue.add(curr.right);
            }

            level++;
        }

        return result;
    }
}