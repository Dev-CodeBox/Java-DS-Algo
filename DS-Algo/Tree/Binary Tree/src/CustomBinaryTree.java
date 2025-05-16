import java.util.LinkedList;
import java.util.Queue;

public class CustomBinaryTree {
    int data;
    CustomBinaryTree left, right;

    CustomBinaryTree(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }

    public static void main(String[] args) {
        CustomBinaryTree root = new CustomBinaryTree(0);
        root.insertLeft(2);
        root.insertRight(3);

        root.left.insertLeft(4);
        root.left.insertRight(5);

        System.out.println("Tree created!");

        root.preorder(root);

        System.out.println();
        root.inorder(root);

        System.out.println();
        root.postorder(root);

        System.out.println();
        root.levelOrder(root);
    }

    public void insertLeft(int value) {
        this.left = new CustomBinaryTree(value);
    }

    public void insertRight(int value) {
        this.right = new CustomBinaryTree(value);
    }

    public static void preorder(CustomBinaryTree node) {
        if (node != null) {
            System.out.print(node.data + " ");
            preorder(node.left);
            preorder(node.right);
        }
    }

    public static void inorder(CustomBinaryTree node) {
        if (node != null) {
            inorder(node.left);
            System.out.print(node.data + " ");
            inorder(node.right);
        }
    }

    public static void postorder(CustomBinaryTree node) {
        if (node != null) {
            postorder(node.left);
            postorder(node.right);
            System.out.print(node.data + " ");
        }
    }

    public static void levelOrder(CustomBinaryTree root) {
        if (root == null)
            return;

        Queue<CustomBinaryTree> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int levelSize = queue.size();

            for (int i = 0; i < levelSize; i++) {
                CustomBinaryTree current = queue.poll();
                System.out.print(current.data + " ");

                if (current.left != null)
                    queue.add(current.left);
                if (current.right != null)
                    queue.add(current.right);
            }
            System.out.println();
        }
    }
}