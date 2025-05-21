import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class TwoMirrorTree {
    static class Node {
        int data;
        Node left, right;

        Node(int item) {
            data = item;
            left = right = null;
        }
    }

    public static void main(String[] args) {
        Node tree1 = new Node(1);
        tree1.left = new Node(2);
        tree1.right = new Node(3);

        Node tree2 = new Node(1);
        tree2.left = new Node(3);
        tree2.right = new Node(2);

        TwoMirrorTree obj = new TwoMirrorTree();
        System.out.println(obj.areMirror(tree1, tree2)); // Output: true
    }

    boolean areMirror(Node a, Node b) {
        convertMirror(a); // modifies tree 'a' to its mirror
        ArrayList<ArrayList<Integer>> arrA = new ArrayList<>();
        ArrayList<ArrayList<Integer>> arrB = new ArrayList<>();
        levelOrder(a, arrA);
        levelOrder(b, arrB);

        if (arrA.size() != arrB.size())
            return false;

        for (int i = 0; i < arrA.size(); i++) {
            ArrayList<Integer> levelA = arrA.get(i);
            ArrayList<Integer> levelB = arrB.get(i);
            if (levelA.size() != levelB.size())
                return false;
            for (int j = 0; j < levelA.size(); j++) {
                if (!levelA.get(j).equals(levelB.get(j))) {
                    return false;
                }
            }
        }
        return true;
    }

    void convertMirror(Node a) {
        if (a == null)
            return;

        Node temp = a.left;
        a.left = a.right;
        a.right = temp;

        convertMirror(a.left);
        convertMirror(a.right);
    }

    void levelOrder(Node a, ArrayList<ArrayList<Integer>> arr) {
        if (a == null)
            return;

        Queue<Node> q = new LinkedList<>();
        q.offer(a);
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
