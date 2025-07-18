import java.util.HashMap;

public class PrefixMatch {
    static class TrieNode {
        char ch;
        HashMap<Character, TrieNode> children;
        boolean terminal;

        public TrieNode(char ch) {
            this.ch = ch;
            this.children = new HashMap<>();
            this.terminal = false;
        }

        public void insert(String word) {
            TrieNode current = this;
            for (char c : word.toCharArray()) {
                current.children.putIfAbsent(c, new TrieNode(c));
                current = current.children.get(c);
            }
            current.terminal = true;
        }

        public boolean isPrefix(String prefix) {
            TrieNode current = this;
            for (char c : prefix.toCharArray()) {
                current = current.children.get(c);
                if (current == null)
                    return false;
            }
            return true;
        }
    }

    public static void main(String[] args) {
        PrefixMatch obj = new PrefixMatch();

        String[] arr = { "apple", "apricot", "banana", "appetizer", "apply" };
        int n = arr.length;
        int k = 3;
        String str = "appetite";

        int result = obj.klengthpref(arr, n, k, str);
        System.out.println("Count of strings with prefix '" + str.substring(0, k) + "': " + result);
    }

    public int klengthpref(String[] arr, int n, int k, String str) {
        if (str.length() < k)
            return 0;

        TrieNode root = new TrieNode('\0');
        for (String word : arr) {
            root.insert(word);
        }

        String targetPrefix = str.substring(0, k);
        int count = 0;

        for (String word : arr) {
            if (word.length() >= k && word.substring(0, k).equals(targetPrefix)) {
                count++;
            }
        }

        return count;
    }
}
