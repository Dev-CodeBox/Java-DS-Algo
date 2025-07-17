import java.util.*;

public class WordBoggle {
    static class TrieNode {
        TrieNode[] children = new TrieNode[26];
        boolean isEndOfWord = false;
    }

    static TrieNode root;

    private void insert(String word) {
        TrieNode curr = root;
        for (char ch : word.toCharArray()) {
            int idx = ch - 'a';
            if (curr.children[idx] == null)
                curr.children[idx] = new TrieNode();
            curr = curr.children[idx];
        }
        curr.isEndOfWord = true;
    }

    public static void main(String[] args) {
        WordBoggle wb = new WordBoggle();

        char[][] board = {
                { 'g', 'i', 'z' },
                { 'u', 'e', 'k' },
                { 'q', 's', 'e' }
        };

        String[] dictionary = { "geeks", "for", "quiz", "go" };

        String[] foundWords = wb.wordBoggle(board, dictionary);

        System.out.println("Words found in board:");
        for (String word : foundWords) {
            System.out.println(word);
        }
    }

    public String[] wordBoggle(char[][] board, String[] dictionary) {
        root = new TrieNode();
        for (String word : dictionary)
            insert(word);

        int r = board.length, c = board[0].length;
        boolean[][] visited = new boolean[r][c];
        Set<String> result = new HashSet<>();

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                dfs(board, visited, i, j, root, "", result);
            }
        }

        List<String> foundWords = new ArrayList<>();
        for (String word : dictionary) {
            if (result.contains(word))
                foundWords.add(word);
        }

        Collections.sort(foundWords);
        return foundWords.toArray(new String[0]);
    }

    int[] dx = { -1, -1, -1, 0, 0, 1, 1, 1 };
    int[] dy = { -1, 0, 1, -1, 1, -1, 0, 1 };

    private void dfs(char[][] board, boolean[][] visited, int i, int j, TrieNode node, String word,
            Set<String> result) {
        char ch = board[i][j];
        int idx = ch - 'a';

        if (node.children[idx] == null)
            return;

        node = node.children[idx];
        word += ch;

        if (node.isEndOfWord)
            result.add(word);

        visited[i][j] = true;
        for (int d = 0; d < 8; d++) {
            int ni = i + dx[d], nj = j + dy[d];
            if (ni >= 0 && ni < board.length && nj >= 0 && nj < board[0].length && !visited[ni][nj]) {
                dfs(board, visited, ni, nj, node, word, result);
            }
        }
        visited[i][j] = false;
    }

}
