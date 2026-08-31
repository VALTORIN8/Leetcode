class Solution {
    public int mostFrequentEven(int[] nums) {
        Map<Integer, Integer> freqMap = new HashMap<>();

        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }
         int result = -1; // default if no even element
        int maxFreq = 0;

        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            int num = entry.getKey();
            int freq = entry.getValue();

            if (num % 2 == 0) { // only even
                if (freq > maxFreq || (freq == maxFreq && num < result)) {
                    maxFreq = freq;
                    result = num;
                }
            }
        }
        return result;
    }
}