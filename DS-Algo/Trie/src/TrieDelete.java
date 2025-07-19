import java.util.*;

public class TrieDelete {
    static class TrieNode {
        char content;
        boolean isEnd;
        int count;
        LinkedList<TrieNode> childList;

        public TrieNode(char c) {
            this.content = c;
            this.isEnd = false;
            this.count = 0;
            this.childList = new LinkedList<>();
        }

        public TrieNode subNode(char c) {
            for (TrieNode child : childList) {
                if (child.content == c)
                    return child;
            }
            return null;
        }
    }

    public static void insert(TrieNode root, String word) {
        TrieNode current = root;
        for (char ch : word.toCharArray()) {
            TrieNode child = current.subNode(ch);
            if (child == null) {
                child = new TrieNode(ch);
                current.childList.add(child);
            }
            child.count++;
            current = child;
        }
        current.isEnd = true;
    }

    public static void main(String[] args) {
        TrieNode root = new TrieNode('-');

        insert(root, "hello");
        insert(root, "hell");
        insert(root, "he");

        deleteKey(root, "hello".toCharArray()); // deletes "hello" only
        deleteKey(root, "he".toCharArray()); // deletes "he"

        // "hell" should still exist
        TrieNode node = root.subNode('h').subNode('e').subNode('l').subNode('l');
        System.out.println(node != null && node.isEnd); // true
    }

    public static void deleteKey(TrieNode root, char[] key) {
        deleteKeyRec(root, key, 0);
    }

    private static boolean deleteKeyRec(TrieNode node, char[] key, int index) {
        if (index == key.length) {
            if (!node.isEnd)
                return false; // Word not found
            node.isEnd = false;
            return node.childList.isEmpty(); // Delete if no children
        }

        char ch = key[index];
        TrieNode child = node.subNode(ch);
        if (child == null)
            return false; // Word not found

        boolean shouldDeleteChild = deleteKeyRec(child, key, index + 1);

        if (shouldDeleteChild) {
            node.childList.removeIf(n -> n.content == ch);
            return node.childList.isEmpty() && !node.isEnd;
        }

        return false;
    }
}