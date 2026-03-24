class Solution {
    public boolean uniqueOccurrences(int[] arr) {

        // Step 1: Count frequency using plain array
        // offset by 1000 to handle negative indices (-1000 to 1000)
        int[] freq = new int[2001];
        for (int num : arr) {
            freq[num + 1000]++;   // e.g. -3 → index 997
        }

        // Step 2: Sort the freq array
        Arrays.sort(freq);

        // Step 3: Check if any two adjacent non-zero values are equal
        for (int i = 1; i < freq.length; i++) {
            if (freq[i] == 0) continue;          // skip zeros (numbers not in arr)
            if (freq[i] == freq[i - 1]) {        // duplicate frequency found!
                return false;
            }
        }

        return true;
    }
}
