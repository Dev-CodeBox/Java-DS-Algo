import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;

public class LevelOrderInSpiralForm {
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(60);

        LevelOrderInSpiralForm obj = new LevelOrderInSpiralForm();
        System.out.println(obj.findSpiral(root)); // Output: [10, 20, 30, 60, 40]
    }

    public ArrayList<Integer> findSpiral(Node root) {
        ArrayList<Integer> result = new ArrayList<>();
        if (root == null)
            return result;

        Deque<Node> deque = new ArrayDeque<>();
        deque.add(root);

        boolean leftToRight = false;

        while (!deque.isEmpty()) {
            int size = deque.size();
            ArrayList<Integer> level = new ArrayList<>();

            for (int i = 0; i < size; i++) {
                Node node = deque.poll();
                level.add(node.data);

                if (node.left != null)
                    deque.add(node.left);
                if (node.right != null)
                    deque.add(node.right);
            }

            if (leftToRight) {
                result.addAll(level);
            } else {
                Collections.reverse(level);
                result.addAll(level);
            }

            leftToRight = !leftToRight;
        }

        return result;
    }
}
