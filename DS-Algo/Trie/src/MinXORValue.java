public class MinXORValue {
    static class TrieNode {
        TrieNode[] child = new TrieNode[2];
    }

    static void insert(TrieNode root, int num) {
        TrieNode curr = root;
        for (int i = 31; i >= 0; i--) {
            int bit = (num >> i) & 1;
            if (curr.child[bit] == null)
                curr.child[bit] = new TrieNode();
            curr = curr.child[bit];
        }
    }

    public static void main(String[] args) {
        int[] arr = { 9, 5, 3 }; // Example
        int result = minxorpair(arr.length, arr);
        System.out.println(result); // Output: 6 (since 3 ^ 5 = 6)
    }

    static int findMinXor(TrieNode root, int num) {
        TrieNode curr = root;
        int xor = 0;
        for (int i = 31; i >= 0; i--) {
            int bit = (num >> i) & 1;
            if (curr.child[bit] != null) {
                curr = curr.child[bit];
            } else {
                xor |= (1 << i); // we incur 1 in XOR
                curr = curr.child[bit ^ 1];
            }
        }
        return xor;
    }

    static int minxorpair(int N, int arr[]) {
        TrieNode root = new TrieNode();
        insert(root, arr[0]);

        int minXor = Integer.MAX_VALUE;
        for (int i = 1; i < N; i++) {
            int currXor = findMinXor(root, arr[i]);
            minXor = Math.min(minXor, currXor);
            insert(root, arr[i]);
        }
        return minXor;
    }
}
