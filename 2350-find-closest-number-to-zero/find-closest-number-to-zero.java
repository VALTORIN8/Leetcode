class Solution {
    public int findClosestNumber(int[] nums) {
        int min = Integer.MAX_VALUE;
        int ans = 0;

        for(int i=0;i<nums.length;i++){
            int m=0;

            if(nums[i]<0){
                m=-1*nums[i];
            }
            else{
                m=nums[i];
            }

            if(m<min){
                min=m;
                ans=nums[i];
            }
            else if(m==min && nums[i]>ans){
                ans=nums[i];
            }
        }

        return ans;
    }
}