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
    }
}