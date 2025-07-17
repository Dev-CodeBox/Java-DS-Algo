import java.util.HashMap;

public class ImplementTrie {
    static class Trie {
        static class TrieNode {
            char ch;
            HashMap<Character, TrieNode> children;
            boolean terminal;

            public TrieNode(char ch) {
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

            public boolean search(TrieNode root, String word) {
                if (word.length() == 0) {
                    return root.terminal;
                }

                char ch = word.charAt(0);
                TrieNode curr;

                if (root.children.containsKey(ch)) {
                    curr = root.children.get(ch);
                } else {
                    return false;
                }

                return search(curr, word.substring(1));
            }

            public boolean isPrefix(TrieNode root, String word) {
                if (word.length() == 0) {
                    return true;
                }

                char ch = word.charAt(0);
                TrieNode curr;

                if (root.children.containsKey(ch)) {
                    curr = root.children.get(ch);
                } else {
                    return false;
                }

                return isPrefix(curr, word.substring(1));
            }
        }

        TrieNode root = new TrieNode('-');

        public void insert(String word) {
            root.insert(root, word);
        }

        public boolean search(String word) {
            return root.search(root, word);
        }

        public boolean isPrefix(String word) {
            return root.isPrefix(root, word);
        }
    }

    public static void main(String[] args) {
        Trie trie = new Trie();

        trie.insert("apple");
        trie.insert("app");
        trie.insert("bat");
        trie.insert("ball");

        System.out.println("Search Results:");
        System.out.println("apple: " + trie.search("apple")); // true
        System.out.println("app: " + trie.search("app")); // true
        System.out.println("bat: " + trie.search("bat")); // true
        System.out.println("bad: " + trie.search("bad")); // false

        System.out.println("\nPrefix Results:");
        System.out.println("ap: " + trie.isPrefix("ap")); // true
        System.out.println("ba: " + trie.isPrefix("ba")); // true
        System.out.println("cat: " + trie.isPrefix("cat")); // false
    }
}
