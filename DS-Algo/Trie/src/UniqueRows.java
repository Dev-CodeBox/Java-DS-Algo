import java.util.*;

public class UniqueRows {

    static class TrieNode {
        char ch;
        HashMap<Character, TrieNode> children;
        boolean terminal;

        TrieNode(char ch) {
            this.ch = ch;
            this.children = new HashMap<>();
            this.terminal = false;
        }

        public boolean insert(TrieNode trie, String word) {
            if (word.length() == 0) {
                if (trie.terminal)
                    return false;
                trie.terminal = true;
                return true;
            }

            char ch = word.charAt(0);
            TrieNode curr = trie.children.getOrDefault(ch, new TrieNode(ch));
            trie.children.putIfAbsent(ch, curr);

            return insert(curr, word.substring(1));
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {
                { 1, 0, 0 },
                { 1, 0, 0 },
                { 1, 0, 1 },
                { 0, 1, 0 }
        };

        ArrayList<ArrayList<Integer>> unique = UniqueRows.uniqueRow(matrix, 4, 3);

        for (ArrayList<Integer> row : unique) {
            System.out.println(row);
        }
    }

    public static ArrayList<ArrayList<Integer>> uniqueRow(int[][] a, int r, int c) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        TrieNode root = new TrieNode('\0');

        for (int i = 0; i < r; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < c; j++) {
                sb.append(a[i][j]);
            }

            boolean isNew = root.insert(root, sb.toString());

            if (isNew) {
                ArrayList<Integer> row = new ArrayList<>();
                for (int j = 0; j < c; j++) {
                    row.add(a[i][j]);
                }
                result.add(row);
            }
        }

        return result;
    }
}
