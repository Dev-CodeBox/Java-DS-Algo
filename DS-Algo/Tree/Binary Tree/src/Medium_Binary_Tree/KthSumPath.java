package Medium_Binary_Tree;

import java.util.HashMap;

public class KthSumPath {
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(3);
        root.right = new Node(-1);
        root.left.left = new Node(2);
        root.left.right = new Node(1);
        root.right.left = new Node(4);
        root.right.right = new Node(5);
        root.right.left.left = new Node(1);
        root.right.left.right = new Node(2);
        root.right.right.right = new Node(6);

        KthSumPath obj = new KthSumPath();
        int k = 5;
        System.out.println("Total Paths with sum " + k + ": " + obj.sumK(root, k));
    }

    public int sumK(Node root, int k) {
        HashMap<Integer, Integer> prefSums = new HashMap<>();
        return countPathUtil(root, k, 0, prefSums);
    }

    public int countPathUtil(Node node, int k, int currSum, HashMap<Integer, Integer> prefSums) {
        if (node == null)
            return 0;

        int pathCount = 0;
        currSum += node.data;

        if (currSum == k)
            pathCount++;

        pathCount += prefSums.getOrDefault(currSum - k, 0);
        prefSums.put(currSum, prefSums.getOrDefault(currSum, 0) + 1);

        pathCount += countPathUtil(node.left, k, currSum, prefSums);
        pathCount += countPathUtil(node.right, k, currSum, prefSums);

        prefSums.put(currSum, prefSums.get(currSum) - 1);
        return pathCount;
    }
}