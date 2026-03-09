class Solution {
    public int maximumGap(int[] nums) {
        int n = nums.length;
        if (n < 2) return 0;          // fix 1

        Arrays.sort(nums);

        int result = 0;
        for (int i = 1; i < n; i++) { // fix 2: simple adjacent pairs
            result = Math.max(result, nums[i] - nums[i - 1]); // fix 3: accumulate
        }
        return result;
    }
}