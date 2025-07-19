import java.util.*;

public class LCP {
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
            TrieNode curr = this;
            for (char c : word.toCharArray()) {
                curr.children.putIfAbsent(c, new TrieNode(c));
                curr = curr.children.get(c);
            }
            curr.terminal = true;
        }

        public void findLCP(StringBuilder lcp) {
            TrieNode curr = this;
            while (curr.children.size() == 1 && !curr.terminal) {
                for (Map.Entry<Character, TrieNode> entry : curr.children.entrySet()) {
                    lcp.append(entry.getKey());
                    curr = entry.getValue();
                }
            }
        }
    }

    public static void main(String[] args) {
        LCP lcpFinder = new LCP();
        String[] words = { "flower", "flow", "flight" };
        System.out.println(lcpFinder.lcp(words, words.length)); // Output: "fl"
    }

    public String lcp(String[] s, int n) {
        if (n == 0)
            return "-1";

        TrieNode root = new TrieNode('-');
        for (String word : s) {
            root.insert(word);
        }

        StringBuilder lcp = new StringBuilder();
        root.findLCP(lcp);

        return lcp.length() == 0 ? "-1" : lcp.toString();
    }
}
