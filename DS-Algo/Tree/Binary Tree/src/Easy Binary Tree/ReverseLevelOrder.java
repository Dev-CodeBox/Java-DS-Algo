import java.util.*;

public class ReverseLevelOrder {
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
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        ReverseLevelOrder obj = new ReverseLevelOrder();
        ArrayList<Integer> result = obj.reverseLevelOrder(root);
        System.out.println(result); // Expected: [4, 5, 6, 7, 2, 3, 1]
    }

    public ArrayList<Integer> reverseLevelOrder(Node root) {
        ArrayList<Integer> result = new ArrayList<>();
        if (root == null)
            return result;

        Queue<Node> queue = new LinkedList<>();
        Stack<Integer> stack = new Stack<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            Node curr = queue.poll();
            stack.push(curr.data);

            if (curr.right != null)
                queue.offer(curr.right);
            if (curr.left != null)
                queue.offer(curr.left);
        }

        while (!stack.isEmpty()) {
            result.add(stack.pop());
        }

        return result;
    }
}
