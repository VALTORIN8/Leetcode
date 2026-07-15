class Solution {
    public long rob(int[] nums, int[] colors) {
        if (nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];

        // dpPrev represents dp[i-1]
        long dpPrev = nums[0]; 
        
        // maxDpPrev2 represents the maximum money we could have robbed ending at ANY house <= i-2
        long maxDpPrev2 = 0; 
        
        long ans = nums[0];

        for (int i = 1; i < nums.length; i++) {
            long curr = nums[i];

            // Option 1: Pair this house with the best non-adjacent sequence (any color)
            curr = Math.max(curr, maxDpPrev2 + nums[i]);

            // Option 2: Pair this house with the immediate previous house ONLY IF colors differ
            if (colors[i] != colors[i - 1]) {
                curr = Math.max(curr, dpPrev + nums[i]);
            }

            ans = Math.max(ans, curr);

            // Update variables for the next iteration:
            // The old dpPrev (dp[i-1]) becomes valid for maxDpPrev2 (dp[i-2]) in the next loop
            maxDpPrev2 = Math.max(maxDpPrev2, dpPrev);
            dpPrev = curr;
        }

        return ans;
    }
}