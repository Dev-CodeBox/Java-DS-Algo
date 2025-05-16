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
    }

    public void insertLeft(int value) {
        this.left = new CustomBinaryTree(value);
    }

    public void insertRight(int value) {
        this.right = new CustomBinaryTree(value);
    }
}