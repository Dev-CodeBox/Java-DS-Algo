import java.util.*;

public class ReplaceWord {

    class TrieNode {
        char ch;
        HashMap<Character, TrieNode> children;
        boolean terminal;

        TrieNode(char ch) {
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

        public static void main(String[] args) {
            ReplaceWord rw = new ReplaceWord();

            List<String> dictionary = Arrays.asList("cat", "bat", "rat");
            String sentence = "the cattle was rattled by the battery";

            String result = rw.replaceWords(dictionary, sentence);
            System.out.println("Output: " + result); // Output: the cat was rat by the bat
        }

        public String searchRoot(TrieNode root, String word, String original, StringBuilder prefix) {
            if (root.terminal) {
                return prefix.toString();
            }
            if (word.length() == 0) {
                return original;
            }

            char ch = word.charAt(0);

            if (!root.children.containsKey(ch)) {
                return original;
            }

            prefix.append(ch);
            TrieNode curr = root.children.get(ch);

            return searchRoot(curr, word.substring(1), original, prefix);
        }
    }

    public String replaceWords(List<String> dictionary, String sentence) {
        TrieNode root = new TrieNode('-');

        for (String word : dictionary) {
            root.insert(root, word);
        }

        StringBuilder result = new StringBuilder();
        for (String word : sentence.split(" ")) {
            if (result.length() > 0) {
                result.append(" ");
            }
            StringBuilder prefix = new StringBuilder();
            String replaced = root.searchRoot(root, word, word, prefix);
            result.append(replaced);
        }

        return result.toString();
    }
}
