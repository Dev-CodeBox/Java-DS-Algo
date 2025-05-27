package Medium_Binary_Tree;

import java.util.ArrayList;

public class RootToLeafPath {
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            this.left = this.right = null;
        }
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        ArrayList<ArrayList<Integer>> allPaths = Paths(root);

        System.out.println("Root to leaf paths:");
        for (ArrayList<Integer> path : allPaths) {
            System.out.println(path);
        }
    }

    public static ArrayList<ArrayList<Integer>> Paths(Node root) {
        ArrayList<ArrayList<Integer>> paths = new ArrayList<>();
        ArrayList<Integer> currentPath = new ArrayList<>();
        dfs(root, currentPath, paths);
        return paths;
    }

    static void dfs(Node node, ArrayList<Integer> currentPath, ArrayList<ArrayList<Integer>> paths) {
        if (node == null)
            return;

        currentPath.add(node.data);

        if (node.left == null && node.right == null) {
            paths.add(new ArrayList<>(currentPath));
        } else {
            dfs(node.left, currentPath, paths);
            dfs(node.right, currentPath, paths);
        }

        currentPath.remove(currentPath.size() - 1);
    }
}
