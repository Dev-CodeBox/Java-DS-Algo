public class CountWords {
    static class TrieNode {
        TrieNode[] children = new TrieNode[26];
        boolean isLeaf;

        public TrieNode() {
            isLeaf = false;
            for (int i = 0; i < 26; i++) {
                children[i] = null;
            }
        }
    }

    public void insert(TrieNode root, String word) {
        TrieNode node = root;
        for (char c : word.toCharArray()) {
            int idx = c - 'a';
            if (node.children[idx] == null) {
                node.children[idx] = new TrieNode();
            }
            node = node.children[idx];
        }
        node.isLeaf = true;
    }

    public static void main(String[] args) {
        TrieNode root = new TrieNode();
        CountWords trie = new CountWords();

        trie.insert(root, "apple");
        trie.insert(root, "app");
        trie.insert(root, "bat");
        trie.insert(root, "ball");

        int totalWords = trie.wordCount(root);
        System.out.println("Total words in Trie: " + totalWords); // Output: 4
    }

    public int wordCount(TrieNode root) {
        return countWords(root);
    }

    private int countWords(TrieNode node) {
        int count = 0;
        if (node.isLeaf)
            count++;

        for (int i = 0; i < 26; i++) {
            if (node.children[i] != null) {
                count += countWords(node.children[i]);
            }
        }

        return count;
    }
}
