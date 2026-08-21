class Solution {
    static class TrieNode {
        TrieNode[] children = new TrieNode[2]; // 0 and 1
    }

    private void insert(TrieNode root, int num) {
        for (int i = 31; i >= 0; i--) {
            int bit = (num >> i) & 1;
            if (root.children[bit] == null) {
                root.children[bit] = new TrieNode();
            }
            root = root.children[bit];
        }
    }

    private int query(TrieNode root, int num) {
        int xor = 0;
        for (int i = 31; i >= 0; i--) {
            int bit = (num >> i) & 1;
            int opposite = bit ^ 1;
            if (root.children[opposite] != null) {
                xor |= (1 << i);
                root = root.children[opposite];
            } else {
                root = root.children[bit];
            }
        }
        return xor;
    }

    public int findMaximumXOR(int[] nums) {
        TrieNode root = new TrieNode();
        for (int num : nums) insert(root, num);

        int res = 0;
        for (int num : nums) {
            res = Math.max(res, query(root, num));
        }
        return res;
    }
}