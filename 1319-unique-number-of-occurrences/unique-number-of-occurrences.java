class Solution {
    public boolean uniqueOccurrences(int[] arr) {

        int[] freq = new int[2001];
        for (int num : arr) {
            freq[num + 1000]++;
        }

        Arrays.sort(freq);

        for (int i = 1; i < freq.length; i++) {
            if (freq[i] == 0) continue;
            if (freq[i] == freq[i - 1]) {
                return false;
            }
        }

        return true;
    }
}