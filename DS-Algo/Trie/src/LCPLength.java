import java.util.*;

public class LCPLength {

    class TrieNode {
        char ch;
        HashMap<Character, TrieNode> children;
        boolean terminal;

        TrieNode(char ch) {
            this.ch = ch;
            this.children = new HashMap<>();
            this.terminal = false;
        }

        public void insert(TrieNode root, String word) {
            if (word.length() == 0) {
                root.terminal = true;
                return;
            }

            char ch = word.charAt(0);
            TrieNode curr;

            if (root.children.containsKey(ch)) {
                curr = root.children.get(ch);
            } else {
                curr = new TrieNode(ch);
                root.children.put(ch, curr);
            }

            insert(curr, word.substring(1));
        }
    }

    public static void main(String[] args) {
        LCPLength obj = new LCPLength();

        int[] arr1 = { 1234, 1256, 1299 };
        int[] arr2 = { 1235, 1239, 1278 };

        int result = obj.longestCommonPrefix(arr1, arr2);
        System.out.println("Longest Common Prefix Length: " + result); // Output: 3
    }

    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        TrieNode root1 = new TrieNode('-');
        TrieNode root2 = new TrieNode('-');

        for (int num : arr1) {
            String word = Integer.toString(num);
            root1.insert(root1, word);
        }

        for (int num : arr2) {
            String word = Integer.toString(num);
            root2.insert(root2, word);
        }

        return findLCP(root1, root2);
    }

    public int findLCP(TrieNode root1, TrieNode root2) {
        if (root1 == null || root2 == null) {
            return 0;
        }

        int maxLen = 0;

        for (Map.Entry<Character, TrieNode> entry : root1.children.entrySet()) {
            char ch = entry.getKey();
            TrieNode child1 = entry.getValue();
            if (root2.children.containsKey(ch)) {
                TrieNode child2 = root2.children.get(ch);
                int len = 1 + findLCP(child1, child2);
                maxLen = Math.max(maxLen, len);
            }
        }

        return maxLen;
    }
}
