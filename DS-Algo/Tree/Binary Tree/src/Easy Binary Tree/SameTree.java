public class SameTree {

    static class Node {
        int val;
        Node left, right;

        Node(int x) {
            val = x;
        }
    }

    public static void main(String[] args) {
        Node p = new Node(1);
        p.left = new Node(2);
        p.right = new Node(3);

        Node q = new Node(1);
        q.left = new Node(2);
        q.right = new Node(3);

        SameTree obj = new SameTree();
        System.out.println(obj.isSameTree(p, q)); // Output: true
    }

    public boolean isSameTree(Node p, Node q) {
        if (p == null && q == null)
            return true;
        if (p == null || q == null || p.val != q.val)
            return false;

        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}
