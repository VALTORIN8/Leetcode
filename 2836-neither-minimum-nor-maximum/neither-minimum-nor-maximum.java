class Solution {
    public int findNonMinOrMax(int[] nums) {
        
        int n=nums.length;
        if(n<3){//wait
            return -1;
        }
        int min=nums[0];
        int max=nums[0];
        for(int num:nums){
            if(num>max){
                max=num;
            }
            if(num<min){
                min=num;
            }
        }
        for(int i=0;i<n;i++){
            if(nums[i]!=max && nums[i]!=min){
                return nums[i];
            }
        }//time
        return -1;
    }
}