class Solution {
    public int majorityElement(int[] nums) {
        int a=nums[0];
        int count=0;
        for(int num:nums){
            if(count==0){
                a=num;
            }
            if(num==a){
                count++;
            }
            else count--;
        }
        return a;
    }
}