import java.util.HashMap;

public class MostFrequentWord {
    static class TrieNode {
        char ch;
        HashMap<Character, TrieNode> children;
        boolean terminal;
        int frequency;
        int firstIndex;
        String word;

        public TrieNode(char ch) {
            this.ch = ch;
            this.children = new HashMap<>();
            this.terminal = false;
            this.frequency = 0;
            this.firstIndex = -1;
            this.word = null;
        }

        public void insert(String word, int index) {
            TrieNode curr = this;
            for (char c : word.toCharArray()) {
                curr.children.putIfAbsent(c, new TrieNode(c));
                curr = curr.children.get(c);
            }
            curr.terminal = true;
            curr.frequency++;
            if (curr.firstIndex == -1) {
                curr.firstIndex = index;
                curr.word = word;
            }
        }
    }

    public static void main(String[] args) {
        MostFrequentWord mf = new MostFrequentWord();

        String[] arr = { "apple", "banana", "apple", "apple", "banana", "orange", "banana" };
        int n = arr.length;

        System.out.println("Most Frequent Word: " + mf.mostFrequentWord(arr, n)); // Output: banana
    }

    public String mostFrequentWord(String[] arr, int n) {
        TrieNode root = new TrieNode('\0');
        for (int i = 0; i < n; i++) {
            root.insert(arr[i], i);
        }

        return getMostFrequent(root, new int[] { 0 }, new int[] { -1 });
    }

    private String getMostFrequent(TrieNode node, int[] maxFreq, int[] latestIndex) {
        String result = "";

        if (node.terminal) {
            if (node.frequency > maxFreq[0]) {
                maxFreq[0] = node.frequency;
                latestIndex[0] = node.firstIndex;
                result = node.word;
            } else if (node.frequency == maxFreq[0] && node.firstIndex > latestIndex[0]) {
                latestIndex[0] = node.firstIndex;
                result = node.word;
            }
        }

        for (TrieNode child : node.children.values()) {
            String childResult = getMostFrequent(child, maxFreq, latestIndex);
            if (!childResult.isEmpty()) {
                result = childResult;
            }
        }

        return result;
    }

}
