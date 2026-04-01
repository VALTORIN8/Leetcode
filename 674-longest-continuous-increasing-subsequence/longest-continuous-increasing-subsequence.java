class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int maxLength = 1;
        int currentLength = 1;
        
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                // Continuing the increasing sequence
                currentLength++;
            } else {
                // Streak broken, save the max and reset
                maxLength = Math.max(maxLength, currentLength);
                currentLength = 1;
            }
        }
        
        // Don't forget the last sequence!
        maxLength = Math.max(maxLength, currentLength);
        return maxLength;
    }
}