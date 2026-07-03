class Solution {
    public int singleNumber(int[] nums) {
        int[] freq = new int[60001];

        for (int num : nums) {
            freq[num + 30000]++;
        }

        for (int i = 0; i < freq.length; i++) {
            if (freq[i] == 1) {
                return i - 30000;
            }
        }

        return -1;
    }
}