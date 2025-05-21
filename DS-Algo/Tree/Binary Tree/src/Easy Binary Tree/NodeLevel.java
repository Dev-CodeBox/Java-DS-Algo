import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class NodeLevel {

    static class Node {
        int data;
        Node left, right;

        Node(int item) {
            data = item;
            left = right = null;
        }
    }

    public static void main(String[] args) {
        Node root = new Node(3);
        root.left = new Node(2);
        root.right = new Node(5);
        root.left.left = new Node(1);
        root.right.left = new Node(4);
        root.right.right = new Node(6);

        NodeLevel obj = new NodeLevel();
        int level = obj.getLevel(root, 4);
        System.out.println("Level of 4: " + level); // Output should be 3
    }

    int getLevel(Node node, int data) {
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        levelOrder(node, arr);
        for (int i = 0; i < arr.size(); i++) {
            for (int j = 0; j < arr.get(i).size(); j++) {
                if (arr.get(i).get(j) == data) {
                    return i + 1;
                }
            }
        }
        return 0;
    }

    void levelOrder(Node node, ArrayList<ArrayList<Integer>> arr) {
        if (node == null)
            return;

        Queue<Node> q = new LinkedList<>();
        q.offer(node);
        while (!q.isEmpty()) {
            int size = q.size();
            ArrayList<Integer> temp = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                Node front = q.poll();
                temp.add(front.data);
                if (front.left != null)
                    q.offer(front.left);
                if (front.right != null)
                    q.offer(front.right);
            }
            arr.add(temp);
        }
    }
}
