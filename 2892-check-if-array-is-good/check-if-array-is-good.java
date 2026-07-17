class Solution {
    public boolean isGood(int[] nums) {
        int n=nums.length-1;
        int sum = 0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        return sum==(n*(n+1)/2)+n;
    }
}