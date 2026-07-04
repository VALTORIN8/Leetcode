class Solution {
    public int maxSubArray(int[] nums) {
        int sum = nums[0];
        int maxSum = nums[0];

        for (int i = 1; i < nums.length; i++) {

            // Kadane's Algorithm
            if (sum < 0) {
                sum = nums[i];      // Start a new subarray
            } else {
                sum += nums[i];     // Continue the current subarray
            }

            // Update maximum sum found so far
            if (sum > maxSum) {
                maxSum = sum;
            }
        }

        return maxSum;
    }
}