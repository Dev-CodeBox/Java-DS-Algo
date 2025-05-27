package Medium_Binary_Tree;

public class ConstructTreeFromInorderAndPreorder {
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            this.left = this.right = null;
        }
    }

    public static void main(String[] args) {
        int[] inorder = { 4, 2, 5, 1, 6, 3, 7 };
        int[] preorder = { 1, 2, 4, 5, 3, 6, 7 };

        Node root = buildTree(inorder, preorder);

        System.out.print("Inorder traversal of constructed tree: ");
        printInorder(root); // should print inorder array: 4 2 5 1 6 3 7
    }

    public static Node buildTree(int inorder[], int preorder[]) {
        return constructTree(inorder, preorder, 0, inorder.length - 1, new int[] { 0 });
    }

    public static Node constructTree(int inorder[], int preorder[], int inStartIndex,
            int inEndIndex, int[] preIndex) {
        if (preIndex[0] >= preorder.length || inStartIndex > inEndIndex) {
            return null;
        }

        int element = preorder[preIndex[0]++];
        Node root = new Node(element);

        int inorderIndex = findIndex(inorder, element);
        root.left = constructTree(inorder, preorder, inStartIndex, inorderIndex - 1, preIndex);
        root.right = constructTree(inorder, preorder, inorderIndex + 1, inEndIndex, preIndex);

        return root;
    }

    public static int findIndex(int[] inorder, int target) {
        for (int i = 0; i < inorder.length; i++) {
            if (inorder[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static void printInorder(Node root) {
        if (root == null)
            return;
        printInorder(root.left);
        System.out.print(root.data + " ");
        printInorder(root.right);
    }
}
