public class LongestString {

    class TrieNode {
        TrieNode[] children = new TrieNode[26];
        boolean isEnd = false;
    }

    TrieNode root = new TrieNode();

    private void insert(String word) {
        TrieNode node = root;
        for (char ch : word.toCharArray()) {
            int idx = ch - 'a';
            if (node.children[idx] == null)
                node.children[idx] = new TrieNode();
            node = node.children[idx];
        }
        node.isEnd = true;
    }

    public static void main(String[] args) {
        LongestString obj = new LongestString();

        String[] words = { "a", "ap", "app", "appl", "apple", "apply", "banana" };
        String res = obj.longestString(words);
        System.out.println("Longest string with all prefixes present: " + res);
    }

    public String longestString(String[] words) {
        for (String word : words)
            insert(word);

        String result = "";
        for (String word : words) {
            if (allPrefixesExist(word)) {
                if (word.length() > result.length() ||
                        (word.length() == result.length() && word.compareTo(result) < 0)) {
                    result = word;
                }
            }
        }

        return result;
    }

    private boolean allPrefixesExist(String word) {
        TrieNode node = root;
        for (char ch : word.toCharArray()) {
            int idx = ch - 'a';
            node = node.children[idx];
            if (node == null || !node.isEnd)
                return false;
        }
        return true;
    }
}
