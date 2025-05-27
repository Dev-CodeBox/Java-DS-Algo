package Medium_Binary_Tree;

public class SumTree {
    static class Node {
        int data;
        Node left, right;

        Node(int item) {
            data = item;
            left = right = null;
        }
    }

    public static void main(String[] args) {
        Node root = new Node(26);
        root.left = new Node(10);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(6);
        root.right.right = new Node(3);

        SumTree tree = new SumTree();
        System.out.println("Is the given tree a Sum Tree? " + tree.isSumTree(root));
    }

    boolean isSumTree(Node root) {
        return checkSumTree(root).isSumTree;
    }

    class Result {
        boolean isSumTree;
        int sum;

        Result(boolean isSumTree, int sum) {
            this.isSumTree = isSumTree;
            this.sum = sum;
        }
    }

    Result checkSumTree(Node node) {
        if (node == null) {
            return new Result(true, 0);
        }

        if (node.left == null && node.right == null) {
            return new Result(true, node.data);
        }

        Result left = checkSumTree(node.left);
        Result right = checkSumTree(node.right);

        boolean isCurrent = left.isSumTree && right.isSumTree &&
                (node.data == left.sum + right.sum);

        int totalSum = node.data + left.sum + right.sum;

        return new Result(isCurrent, totalSum);
    }
}
