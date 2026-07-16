class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int totalSum = 0;
        for (int num : nums) {
            totalSum += num;
        }

        int[] answer = new int[n];
        int leftSum = 0;
        
        for (int i = 0; i < n; i++) {
            // rightSum for index i is: Total - (everything to the left) - (current element)
            int rightSum = totalSum - leftSum - nums[i];
            
            // Calculate absolute difference
            answer[i] = Math.abs(leftSum - rightSum);
            
            // Update leftSum for the next index
            leftSum += nums[i];
        }
        
        return answer;
    }
}