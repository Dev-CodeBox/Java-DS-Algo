import java.util.*;

public class GeekAndString {

    static class TrieNode {
        TrieNode[] children = new TrieNode[26];
        int prefixCount = 0;
    }

    static void insert(TrieNode root, String word) {
        TrieNode curr = root;
        for (char ch : word.toCharArray()) {
            int idx = ch - 'a';
            if (curr.children[idx] == null) {
                curr.children[idx] = new TrieNode();
            }
            curr = curr.children[idx];
            curr.prefixCount++;
        }
    }

    public static void main(String[] args) {
        String[] li = { "apple", "app", "apricot", "banana", "bat", "battle" };
        String[] query = { "app", "ba", "bat", "z" };

        int N = li.length;
        int Q = query.length;

        List<Integer> result = prefixCount(N, Q, li, query);
        System.out.println("Prefix match counts: " + result);
    }

    static int countPrefix(TrieNode root, String prefix) {
        TrieNode curr = root;
        for (char ch : prefix.toCharArray()) {
            int idx = ch - 'a';
            if (curr.children[idx] == null) {
                return 0;
            }
            curr = curr.children[idx];
        }
        return curr.prefixCount;
    }

    static List<Integer> prefixCount(int N, int Q, String[] li, String[] query) {
        TrieNode root = new TrieNode();
        for (int i = 0; i < N; i++) {
            insert(root, li[i]);
        }

        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < Q; i++) {
            res.add(countPrefix(root, query[i]));
        }
        return res;
    }
}
