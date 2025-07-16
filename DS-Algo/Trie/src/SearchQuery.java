public class SearchQuery {
    static class TrieNode {
        TrieNode[] children = new TrieNode[26];
        boolean isEndOfWord;

        TrieNode() {
            isEndOfWord = false;
            for (int i = 0; i < 26; i++) {
                children[i] = null;
            }
        }
    }

    static TrieNode root = new TrieNode();

    static void insert(String key) {
        TrieNode curr = root;

        for (int i = 0; i < key.length(); i++) {
            char ch = key.charAt(i);
            int index = ch - 'a';

            if (curr.children[index] == null) {
                curr.children[index] = new TrieNode();
            }

            curr = curr.children[index];
        }

        curr.isEndOfWord = true;
    }
    
    public static void main(String[] args) {
        insert("hello");
        insert("world");

        System.out.println(search("hello")); // true
        System.out.println(search("world")); // true
        System.out.println(search("java")); // false
    }

    static boolean search(String key) {
        TrieNode curr = root;

        for (int i = 0; i < key.length(); i++) {
            char ch = key.charAt(i);
            int index = ch - 'a';

            if (curr.children[index] == null) {
                return false;
            }

            curr = curr.children[index];
        }

        return curr.isEndOfWord;
    }

}
